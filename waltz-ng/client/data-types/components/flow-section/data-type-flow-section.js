/*
 * Waltz - Enterprise Architecture
 * Copyright (C) 2016, 2017, 2018, 2019 Waltz open source project
 * See README.md for more information
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific
 *
 */

import _ from "lodash";

import {initialiseData} from "../../../common";
import {authoritativeRatingColorScale} from "../../../common/colors";
import {CORE_API} from "../../../common/services/core-api-utils";
import {mkSelectionOptions} from "../../../common/selector-utils";

import template from "./data-type-flow-section.html";


const bindings = {
    filters: "<",
    parentEntityRef: "<"
};


const initialState = {
    flowData: {},
    filterOptions: {
        showPrimary: true,
        showSecondary: true,
        showDiscouraged: false,
        showNoOpinion: false
    }
};


function calculateEntities(flows = []) {
    return _.chain(flows)
        .flatMap(f => [f.source, f.target])
        .uniqBy("id")
        .value();
}


const buildGraphTweakers = (decorators = [],
                            onAppSelect) => {
    const decoratorsByFlowId = _.keyBy(decorators, "dataFlowId");

    const getRatingForLink = (link) => {
        const decorator = decoratorsByFlowId[link.data.id];
        return decorator
            ? decorator.rating
            : "NO_OPINION";
    };

    return {
        node : {
            enter: (selection) => {
                selection
                    .on("click.appSelect", onAppSelect)
                    .on("dblclick.unfix", d => { d.fx = null; d.fy = null; })
            },
            exit: _.identity,
            update: _.identity
        },
        link : {
            enter: (selection) => {
                selection
                    .attrs({
                        stroke: (d) => {
                            const rating = getRatingForLink(d);
                            return authoritativeRatingColorScale(rating);
                        },
                        fill: (d) => {
                            const rating = getRatingForLink(d);
                            return authoritativeRatingColorScale(rating).brighter();
                        }
                    });
            },
            exit: _.identity,
            update: _.identity
        }
    };
};


function mkKeepDecoratorFn(filterOptions = {}) {
    return (decorator) => {
        const rating = decorator.rating;
        switch (rating) {
            case "PRIMARY":
                return filterOptions.showPrimary;
            case "SECONDARY":
                return filterOptions.showSecondary;
            case "DISCOURAGED":
                return filterOptions.showDiscouraged;
            case "NO_OPINION":
                return filterOptions.showNoOpinion;
        }
    };
}


function filterDecorators(decorators =[],
                          filterOptions) {
    return _.filter(decorators, mkKeepDecoratorFn(filterOptions));
}


function filterFlows(flows = [],
                     decorators = []) {
    const flowIds = _.map(decorators, "dataFlowId");
    return _.filter(flows, f => _.includes(flowIds, f.id));

}


function filterData(flows = [],
                    decorators = [],
                    filterOptions) {
    const filteredDecorators = filterDecorators(decorators, filterOptions);
    const filteredFlows = filterFlows(flows, filteredDecorators);
    const filteredEntities = calculateEntities(filteredFlows);
    return {
        entities: filteredEntities,
        flows: filteredFlows,
        decorators: filteredDecorators
    };
}


function controller($q, $scope, serviceBroker) {
    const vm = initialiseData(this, initialState);
    const onAppSelect = (app) => $scope.$applyAsync(() => vm.selectedApp = app);

    const loadAll = () => {
        const selector = mkSelectionOptions(
            vm.parentEntityRef,
            undefined,
            undefined,
            vm.filters);

        const flowPromise = serviceBroker
            .loadViewData(
                CORE_API.LogicalFlowStore.findBySelector,
                [ selector ])
            .then(r => vm.rawFlows = r.data);
        const decoratorPromise = serviceBroker
            .loadViewData(
                CORE_API.LogicalFlowDecoratorStore.findBySelector,
                [ selector ])
            .then(r => {
                vm.rawDecorators = r.data;
                vm.graphTweakers = buildGraphTweakers(
                    vm.rawDecorators,
                    onAppSelect);
            });

        $q.all([flowPromise, decoratorPromise])
            .then(() => vm.filterChanged());
    };


    vm.filterChanged = () => {
        vm.flowData = filterData(
            vm.rawFlows,
            vm.rawDecorators,
            vm.filterOptions);
    };

    vm.showAll = () => {
        vm.filterOptions = {
            showPrimary: true,
            showSecondary: true,
            showDiscouraged: true,
            showNoOpinion: true
        };
        vm.filterChanged();
    };

    vm.refocusApp = app => {
        onAppSelect(app);
    };

    vm.$onInit = () => {
        loadAll();
    };

    vm.$onChanges = (changes) => {
        if(changes.filters) {
            loadAll();
        }
    };
}


controller.$inject = [
    "$q",
    "$scope",
    "ServiceBroker"
];


const component = {
    bindings,
    template,
    controller
};


const id = "waltzDataTypeFlowSection"

export default {
    component,
    id
};
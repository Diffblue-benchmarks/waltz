package com.khartec.waltz.model.enum_value;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.enum_value.EnumValueKind
 *
 * @author Diffblue Cover
 */

class EnumValueKindTest {

    @Test
    void valuesReturnsTransport_kindBookmark_kindAuthoritativeness_ratingCost_kindPerson_kindScenario_typeChange_initiative_lifecycle_phasePhysical_flow_criticalityFreshness_indicator() {
        EnumValueKind[] result = EnumValueKind.values();
        assertThat(result[0], is(EnumValueKind.TRANSPORT_KIND));
        assertThat(result[1], is(EnumValueKind.BOOKMARK_KIND));
        assertThat(result[2], is(EnumValueKind.AUTHORITATIVENESS_RATING));
        assertThat(result[3], is(EnumValueKind.COST_KIND));
        assertThat(result[4], is(EnumValueKind.PERSON_KIND));
        assertThat(result[5], is(EnumValueKind.SCENARIO_TYPE));
        assertThat(result[6], is(EnumValueKind.CHANGE_INITIATIVE_LIFECYCLE_PHASE));
        assertThat(result[7], is(EnumValueKind.PHYSICAL_FLOW_CRITICALITY));
        assertThat(result[8], is(EnumValueKind.FRESHNESS_INDICATOR));
    }

    @Test
    void dbValueReturnsTransportKind() {
        assertThat(EnumValueKind.TRANSPORT_KIND.dbValue(), is("TransportKind"));
    }
}

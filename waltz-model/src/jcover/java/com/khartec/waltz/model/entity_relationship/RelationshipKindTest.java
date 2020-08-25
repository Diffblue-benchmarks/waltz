package com.khartec.waltz.model.entity_relationship;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.entity_relationship.RelationshipKind
 *
 * @author Diffblue Cover
 */

class RelationshipKindTest {

    @Test
    void valuesReturnsHasDeprecatesParticipates_inRelates_toSupportsApplication_newApplication_functional_changeApplication_decommissionedApplication_nfr_changeData_publisherData_consumer() {
        RelationshipKind[] result = RelationshipKind.values();
        assertThat(result[0], is(RelationshipKind.HAS));
        assertThat(result[1], is(RelationshipKind.DEPRECATES));
        assertThat(result[2], is(RelationshipKind.PARTICIPATES_IN));
        assertThat(result[3], is(RelationshipKind.RELATES_TO));
        assertThat(result[4], is(RelationshipKind.SUPPORTS));
        assertThat(result[5], is(RelationshipKind.APPLICATION_NEW));
        assertThat(result[6], is(RelationshipKind.APPLICATION_FUNCTIONAL_CHANGE));
        assertThat(result[7], is(RelationshipKind.APPLICATION_DECOMMISSIONED));
        assertThat(result[8], is(RelationshipKind.APPLICATION_NFR_CHANGE));
        assertThat(result[9], is(RelationshipKind.DATA_PUBLISHER));
        assertThat(result[10], is(RelationshipKind.DATA_CONSUMER));
    }
}

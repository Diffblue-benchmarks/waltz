package com.khartec.waltz.model.physical_flow_participant;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.physical_flow_participant.ParticipationKind
 *
 * @author Diffblue Cover
 */

class ParticipationKindTest {

    @Test
    void valuesReturnsSourceFlowTarget() {
        ParticipationKind[] result = ParticipationKind.values();
        assertThat(result[0], is(ParticipationKind.SOURCE));
        assertThat(result[1], is(ParticipationKind.FLOW));
        assertThat(result[2], is(ParticipationKind.TARGET));
    }
}

package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.FlowDirection
 *
 * @author Diffblue Cover
 */

class FlowDirectionTest {

    @Test
    void valuesReturnsInboundOutboundIntra() {
        FlowDirection[] result = FlowDirection.values();
        assertThat(result[0], is(FlowDirection.INBOUND));
        assertThat(result[1], is(FlowDirection.OUTBOUND));
        assertThat(result[2], is(FlowDirection.INTRA));
    }
}

package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.khartec.waltz.model.Criticality
 *
 * @author Diffblue JCover
 */

public class CriticalityTest {

    @Test
    public void valuesReturnsLOWMEDIUMHIGHVERY_HIGHNONEUNKNOWN() {
        Criticality[] result = Criticality.values();
        assertThat(result[0], is(Criticality.LOW));
        assertThat(result[1], is(Criticality.MEDIUM));
        assertThat(result[2], is(Criticality.HIGH));
        assertThat(result[3], is(Criticality.VERY_HIGH));
        assertThat(result[4], is(Criticality.NONE));
        assertThat(result[5], is(Criticality.UNKNOWN));
    }
}

package com.khartec.waltz.model.orphan;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.orphan.OrphanSide
 *
 * @author Diffblue Cover
 */

class OrphanSideTest {

    @Test
    void valuesReturnsABBoth() {
        OrphanSide[] result = OrphanSide.values();
        assertThat(result[0], is(OrphanSide.A));
        assertThat(result[1], is(OrphanSide.B));
        assertThat(result[2], is(OrphanSide.BOTH));
    }
}

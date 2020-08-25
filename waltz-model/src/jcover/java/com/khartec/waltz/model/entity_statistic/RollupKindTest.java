package com.khartec.waltz.model.entity_statistic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.entity_statistic.RollupKind
 *
 * @author Diffblue Cover
 */

class RollupKindTest {

    @Test
    void valuesReturnsCount_by_entitySum_by_valueAvg_by_valueNone() {
        RollupKind[] result = RollupKind.values();
        assertThat(result[0], is(RollupKind.COUNT_BY_ENTITY));
        assertThat(result[1], is(RollupKind.SUM_BY_VALUE));
        assertThat(result[2], is(RollupKind.AVG_BY_VALUE));
        assertThat(result[3], is(RollupKind.NONE));
    }
}

package com.khartec.waltz.model.entity_statistic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.entity_statistic.StatisticType
 *
 * @author Diffblue Cover
 */

class StatisticTypeTest {

    @Test
    void valuesReturnsBooleanDateEnumNumericPercentage() {
        StatisticType[] result = StatisticType.values();
        assertThat(result[0], is(StatisticType.BOOLEAN));
        assertThat(result[1], is(StatisticType.DATE));
        assertThat(result[2], is(StatisticType.ENUM));
        assertThat(result[3], is(StatisticType.NUMERIC));
        assertThat(result[4], is(StatisticType.PERCENTAGE));
    }
}

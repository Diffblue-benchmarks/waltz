package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.Duration
 *
 * @author Diffblue Cover
 */

class DurationTest {

    @Test
    void valuesReturnsDayWeekMonthQuarterHalf_yearYearAll() {
        Duration[] result = Duration.values();
        assertThat(result[0], is(Duration.DAY));
        assertThat(result[1], is(Duration.WEEK));
        assertThat(result[2], is(Duration.MONTH));
        assertThat(result[3], is(Duration.QUARTER));
        assertThat(result[4], is(Duration.HALF_YEAR));
        assertThat(result[5], is(Duration.YEAR));
        assertThat(result[6], is(Duration.ALL));
    }
}

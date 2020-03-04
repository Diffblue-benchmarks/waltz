package com.khartec.waltz.model.physical_flow;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.khartec.waltz.model.physical_flow.FrequencyKind
 *
 * @author Diffblue JCover
 */

public class FrequencyKindTest {

    @Test
    public void valuesReturnsON_DEMANDREAL_TIMEINTRA_DAYDAILYWEEKLYMONTHLYQUARTERLYBIANNUALLYYEARLYUNKNOWN() {
        FrequencyKind[] result = FrequencyKind.values();
        assertThat(result[0], is(FrequencyKind.ON_DEMAND));
        assertThat(result[1], is(FrequencyKind.REAL_TIME));
        assertThat(result[2], is(FrequencyKind.INTRA_DAY));
        assertThat(result[3], is(FrequencyKind.DAILY));
        assertThat(result[4], is(FrequencyKind.WEEKLY));
        assertThat(result[5], is(FrequencyKind.MONTHLY));
        assertThat(result[6], is(FrequencyKind.QUARTERLY));
        assertThat(result[7], is(FrequencyKind.BIANNUALLY));
        assertThat(result[8], is(FrequencyKind.YEARLY));
        assertThat(result[9], is(FrequencyKind.UNKNOWN));
    }
}

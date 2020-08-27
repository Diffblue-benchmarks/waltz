package com.khartec.waltz.model.physical_flow;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.function.Function;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.khartec.waltz.model.physical_flow.FrequencyKind
 *
 * @author Diffblue Cover
 */

class FrequencyKindTest {

    @Test
    void valuesReturnsOn_demandReal_timeIntra_dayDailyWeeklyMonthlyQuarterlyBiannuallyYearlyUnknown() {
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

    @Test
    void parseValueIsValueReturnsOn_demand() {
        @SuppressWarnings("unchecked")
        Function<String, FrequencyKind> failedParseSupplier =
             mock(Function.class);
        when(failedParseSupplier.apply(Mockito.<String>any()))
            .thenReturn(FrequencyKind.ON_DEMAND);
        assertThat(FrequencyKind.parse("value", failedParseSupplier), is(FrequencyKind.ON_DEMAND));
    }
}

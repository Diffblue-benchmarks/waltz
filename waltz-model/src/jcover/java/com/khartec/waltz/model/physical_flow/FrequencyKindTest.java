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
    void parseValueIsValueReturnsOn_demand() {
        @SuppressWarnings("unchecked")
        Function<String, FrequencyKind> failedParseSupplier =
             mock(Function.class);
        when(failedParseSupplier.apply(Mockito.<String>any()))
            .thenReturn(FrequencyKind.ON_DEMAND);
        assertThat(FrequencyKind.parse("value", failedParseSupplier), is(FrequencyKind.ON_DEMAND));
    }
}

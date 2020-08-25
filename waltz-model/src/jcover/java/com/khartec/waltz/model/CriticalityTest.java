package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.function.Function;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.khartec.waltz.model.Criticality
 *
 * @author Diffblue Cover
 */

class CriticalityTest {

    @Test
    void parseValueIsValueReturnsLow() {
        @SuppressWarnings("unchecked")
        Function<String, Criticality> failedParseSupplier =
             mock(Function.class);
        when(failedParseSupplier.apply(Mockito.<String>any()))
            .thenReturn(Criticality.LOW);
        assertThat(Criticality.parse("value", failedParseSupplier), is(Criticality.LOW));
    }
}

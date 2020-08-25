package com.khartec.waltz.model.physical_specification;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.function.Function;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.khartec.waltz.model.physical_specification.DataFormatKind
 *
 * @author Diffblue Cover
 */

class DataFormatKindTest {

    @Test
    void parseValueIsValueReturnsBinary() {
        @SuppressWarnings("unchecked")
        Function<String, DataFormatKind> failedParseSupplier =
             mock(Function.class);
        when(failedParseSupplier.apply(Mockito.<String>any()))
            .thenReturn(DataFormatKind.BINARY);
        assertThat(DataFormatKind.parse("value", failedParseSupplier), is(DataFormatKind.BINARY));
    }
}

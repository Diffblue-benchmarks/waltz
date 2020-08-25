package com.khartec.waltz.common;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.common.DebugUtilities
 *
 * @author Diffblue Cover
 */

class DebugUtilitiesTest {

    @Test
    void logValueResultIsValueReturnsValue() {
        assertThat(DebugUtilities.<String>logValue("value", new Object()), is("value"));
    }

    @Test
    void logValueReturnsFoo() {
        @SuppressWarnings("unchecked")
        Supplier<String> resultFn = mock(Supplier.class);
        when(resultFn.get())
            .thenReturn("foo");
        assertThat(DebugUtilities.<String>logValue(resultFn, new Object()), is("foo"));
    }

    @Test
    void dumpMIsFooReturnsFoo() {

        // arrange
        HashMap<String, String> m = new HashMap<String, String>();
        m.put("foo", "foo");

        // act
        Map<String, String> result = DebugUtilities.<String, String>dump(m);

        // assert
        assertThat(result.get("foo"), is("foo"));
        assertThat(m, instanceOf(Map.class));
        assertThat((Map<String, String>) m, sameInstance(result));
    }

    @Test
    void dumpPreambleIsFoo() {
        @SuppressWarnings("unchecked")
        Predicate<Object> pred = mock(Predicate.class);
        DebugUtilities.dump("foo", new StreamUtilities.Siphon<Object>(pred));
    }
}

package com.khartec.waltz.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.function.Function;
import java.util.function.Predicate;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.khartec.waltz.common.ArrayUtilities
 *
 * @author Diffblue Cover
 */

class ArrayUtilitiesTest {

    @Test
    void all() {
        String[] ts = new String[] { "foo" };
        @SuppressWarnings("unchecked")
        Predicate<String> check = mock(Predicate.class);
        when(check.test(Mockito.<String>any()))
            .thenReturn(true);
        assertThat(ArrayUtilities.<String>all(ts, check), is(true));
    }

    @Test
    void allReturnsFalse() {
        String[] ts = new String[] { "foo" };
        @SuppressWarnings("unchecked")
        Predicate<String> check = mock(Predicate.class);
        when(check.test(Mockito.<String>any()))
            .thenReturn(false);
        assertThat(ArrayUtilities.<String>all(ts, check), is(false));
    }

    @Test
    void allTsIsEmpty() {
        @SuppressWarnings("unchecked")
        Predicate<String> check = mock(Predicate.class);
        assertThat(ArrayUtilities.<String>all(new String[] { }, check), is(true));
    }

    @Test
    void isEmpty() {
        assertThat(ArrayUtilities.<String>isEmpty(new String[] { }), is(true));
        assertThat(ArrayUtilities.<String>isEmpty(null), is(true));
    }

    @Test
    void isEmptyArrIsFooReturnsFalse() {
        String[] arr = new String[] { "foo" };
        assertThat(ArrayUtilities.<String>isEmpty(arr), is(false));
    }

    @Test
    void sumArrIsEmptyReturnsZero() {
        assertThat(ArrayUtilities.sum(new int[] { }), is(0));
    }

    @Test
    void sumArrIsOneReturnsOne() {
        int[] arr = new int[] { 1 };
        assertThat(ArrayUtilities.sum(arr), is(1));
    }

    @Test
    void lastArrIsSmithReturnsSmith() {
        String[] arr = new String[] { "Smith" };
        assertThat(ArrayUtilities.<String>last(arr), is("Smith"));
    }

    @Test
    void initialBitsIsFooReturnsEmpty() {
        String[] bits = new String[] { "foo" };
        assertThat(ArrayUtilities.<String>initial(bits).length, is(0));
    }

    @Test
    void mapArrIsBarReturnsFoo() {
        String[] arr = new String[] { "bar" };
        @SuppressWarnings("unchecked")
        Function<String, String> mapper = mock(Function.class);
        when(mapper.apply(Mockito.<String>any()))
            .thenReturn("foo");
        assertThat(ArrayUtilities.<String, String>map(arr, mapper), Matchers.arrayContaining("foo"));
    }
}

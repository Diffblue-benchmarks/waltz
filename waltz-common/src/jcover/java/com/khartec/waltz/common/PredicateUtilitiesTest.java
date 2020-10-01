package com.khartec.waltz.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.khartec.waltz.common.PredicateUtilities
 *
 * @author Diffblue Cover
 */

class PredicateUtilitiesTest {

    @Test
    void notReturnsFalse() {
        @SuppressWarnings("unchecked")
        Predicate<String> predicate = mock(Predicate.class);
        when(predicate.test(Mockito.<String>any()))
            .thenReturn(false);
        @SuppressWarnings("unchecked")
        Predicate<String> p = mock(Predicate.class);
        when(p.negate())
            .thenReturn(predicate);
        assertThat(PredicateUtilities.<String>not(p).test("foo"), is(false));
    }

    @Test
    void allReturnsFalse2() {
        LinkedList<String> ts = new LinkedList<String>();
        ts.add("foo");
        @SuppressWarnings("unchecked")
        Predicate<String> p = mock(Predicate.class);
        when(p.test(Mockito.<String>any()))
            .thenReturn(false);
        assertThat(PredicateUtilities.<String>all(ts, p), is(false));
    }

    @Test
    void allTsIsEmptyReturnsTrue() {
        @SuppressWarnings("unchecked")
        Predicate<String> p = mock(Predicate.class);
        assertThat(PredicateUtilities.<String>all(new LinkedList<String>(), p), is(true));
    }

    @Test
    void anyReturnsTrue1() {
        LinkedList<String> ts = new LinkedList<String>();
        ts.add("foo");
        @SuppressWarnings("unchecked")
        Predicate<String> p = mock(Predicate.class);
        when(p.test(Mockito.<String>any()))
            .thenReturn(true);
        assertThat(PredicateUtilities.<String>any(ts, p), is(true));
    }

    @Test
    void anyTsIsEmptyReturnsFalse() {
        @SuppressWarnings("unchecked")
        Predicate<String> p = mock(Predicate.class);
        assertThat(PredicateUtilities.<String>any(new LinkedList<String>(), p), is(false));
    }

    @Test
    void noneReturnsFalse2() {
        LinkedList<String> ts = new LinkedList<String>();
        ts.add("foo");
        @SuppressWarnings("unchecked")
        Predicate<String> p = mock(Predicate.class);
        when(p.test(Mockito.<String>any()))
            .thenReturn(true);
        assertThat(PredicateUtilities.<String>none(ts, p), is(false));
    }

    @Test
    void noneTsIsEmptyReturnsTrue() {
        @SuppressWarnings("unchecked")
        Predicate<String> p = mock(Predicate.class);
        assertThat(PredicateUtilities.<String>none(new LinkedList<String>(), p), is(true));
    }

    @Test
    void allReturnsFalse1() {
        String[] ts = new String[] { "foo" };
        @SuppressWarnings("unchecked")
        Predicate<String> p = mock(Predicate.class);
        when(p.test(Mockito.<String>any()))
            .thenReturn(false);
        assertThat(PredicateUtilities.<String>all(ts, p), is(false));
    }

    @Test
    void allReturnsTrue() {
        String[] ts = new String[] { "foo" };
        @SuppressWarnings("unchecked")
        Predicate<String> p = mock(Predicate.class);
        when(p.test(Mockito.<String>any()))
            .thenReturn(true);
        assertThat(PredicateUtilities.<String>all(ts, p), is(true));
    }

    @Test
    void anyReturnsFalse() {
        String[] ts = new String[] { "foo" };
        @SuppressWarnings("unchecked")
        Predicate<String> p = mock(Predicate.class);
        when(p.test(Mockito.<String>any()))
            .thenReturn(false);
        assertThat(PredicateUtilities.<String>any(ts, p), is(false));
    }

    @Test
    void anyReturnsTrue2() {
        String[] ts = new String[] { "foo" };
        @SuppressWarnings("unchecked")
        Predicate<String> p = mock(Predicate.class);
        when(p.test(Mockito.<String>any()))
            .thenReturn(true);
        assertThat(PredicateUtilities.<String>any(ts, p), is(true));
    }

    @Test
    void noneReturnsFalse1() {
        String[] ts = new String[] { "foo" };
        @SuppressWarnings("unchecked")
        Predicate<String> p = mock(Predicate.class);
        when(p.test(Mockito.<String>any()))
            .thenReturn(true);
        assertThat(PredicateUtilities.<String>none(ts, p), is(false));
    }

    @Test
    void noneReturnsTrue() {
        String[] ts = new String[] { "foo" };
        @SuppressWarnings("unchecked")
        Predicate<String> p = mock(Predicate.class);
        when(p.test(Mockito.<String>any()))
            .thenReturn(false);
        assertThat(PredicateUtilities.<String>none(ts, p), is(true));
    }
}

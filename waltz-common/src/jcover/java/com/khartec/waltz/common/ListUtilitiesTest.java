package com.khartec.waltz.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.Function;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.khartec.waltz.common.ListUtilities
 *
 * @author Diffblue Cover
 */

class ListUtilitiesTest {

    @Test
    void appendTIsSmithAndTsIsFooReturnsFooSmith() {
        ArrayList<String> ts = new ArrayList<String>();
        ts.add("foo");
        assertThat(ListUtilities.<String>append(ts, "Smith"), hasSize(2));
        assertThat(ListUtilities.<String>append(ts, "Smith").get(0), is("foo"));
        assertThat(ListUtilities.<String>append(ts, "Smith").get(1), is("Smith"));
    }

    @Test
    void asListTsIsSmithReturnsSmith() {
        assertThat(ListUtilities.<String>asList("Smith"), hasSize(1));
        assertThat(ListUtilities.<String>asList("Smith").get(0), is("Smith"));
    }

    @Test
    void compactTsIsFooReturnsFoo() {
        LinkedList<String> ts = new LinkedList<String>();
        ts.add("foo");
        assertThat(ListUtilities.<String>compact(ts), hasSize(1));
        assertThat(ListUtilities.<String>compact(ts).get(0), is("foo"));
    }

    @Test
    void mapAsIsFooReturnsFoo() {
        LinkedList<String> as = new LinkedList<String>();
        as.add("foo");
        @SuppressWarnings("unchecked")
        Function<String, String> mapper = mock(Function.class);
        when(mapper.apply(Mockito.<String>any()))
            .thenReturn("foo");
        assertThat(ListUtilities.<String, String>map(as, mapper), hasSize(1));
        assertThat(ListUtilities.<String, String>map(as, mapper).get(0), is("foo"));
    }

    @Test
    void isEmpty() {
        assertThat(ListUtilities.<String>isEmpty(new ArrayList<String>()), is(true));
        assertThat(ListUtilities.<String>isEmpty(null), is(true));
    }

    @Test
    void isEmptyTsIsFooReturnsFalse() {
        ArrayList<String> ts = new ArrayList<String>();
        ts.add("foo");
        assertThat(ListUtilities.<String>isEmpty(ts), is(false));
    }

    @Test
    void filterTsIsEmptyReturnsEmpty() {
        @SuppressWarnings("unchecked")
        Predicate<String> predicate = mock(Predicate.class);
        assertThat(ListUtilities.<String>filter(predicate, new ArrayList<String>()), empty());
    }

    @Test
    void dropCountIsOneAndTsIsEmptyReturnsEmpty() {
        assertThat(ListUtilities.<String>drop(new ArrayList<String>(), 1), empty());
    }

    @Test
    void reverseTsIsFooReturnsFoo() {
        ArrayList<String> ts = new ArrayList<String>();
        ts.add("foo");
        assertThat(ListUtilities.<String>reverse(ts), hasSize(1));
        assertThat(ListUtilities.<String>reverse(ts).get(0), is("foo"));
    }

    @Test
    void ensureNotNullTsIsFooReturnsFoo() {
        LinkedList<String> ts = new LinkedList<String>();
        ts.add("foo");
        assertThat(ListUtilities.<String>ensureNotNull(ts), hasSize(1));
        assertThat(ListUtilities.<String>ensureNotNull(ts).get(0), is("foo"));
    }

    @Test
    void ensureNotNullTsIsNullReturnsEmpty() {
        assertThat(ListUtilities.<String>ensureNotNull(null), empty());
    }

    @Test
    void push() {
        assertThat(ListUtilities.<String>push(new ArrayList<String>(), "Smith"), hasSize(1));
        assertThat(ListUtilities.<String>push(new ArrayList<String>(), "Smith").get(0), is("Smith"));
        assertThat(ListUtilities.<String>push(null, "Smith"), hasSize(1));
        assertThat(ListUtilities.<String>push(null, "Smith").get(0), is("Smith"));
    }

    @Test
    void applyToFirstXsIsBarReturnsAnna() {
        ArrayList<String> xs = new ArrayList<String>();
        xs.add("bar");
        @SuppressWarnings("unchecked")
        Function<String, String> mapFn = mock(Function.class);
        when(mapFn.apply(Mockito.<String>any()))
            .thenReturn("Anna");
        assertThat(ListUtilities.<String, String>applyToFirst(xs, mapFn).get(), is("Anna"));
    }

    @Test
    void applyToFirstXsIsEmpty() {
        @SuppressWarnings("unchecked")
        Function<String, String> mapFn = mock(Function.class);
        assertThat(ListUtilities.<String, String>applyToFirst(new ArrayList<String>(), mapFn).isPresent(), is(false));
    }
}
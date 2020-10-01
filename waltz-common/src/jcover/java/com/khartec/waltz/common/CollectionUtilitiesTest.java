package com.khartec.waltz.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

/**
 * Unit tests for com.khartec.waltz.common.CollectionUtilities
 *
 * @author Diffblue Cover
 */

class CollectionUtilitiesTest {

    @Test
    void anyTsIsEmptyReturnsFalse() {
        @SuppressWarnings("unchecked")
        Predicate<String> pred = mock(Predicate.class);
        assertThat(CollectionUtilities.<String>any(new LinkedList<String>(), pred), is(false));
    }

    @Test
    void anyTsIsFooReturnsTrue() {
        LinkedList<String> ts = new LinkedList<String>();
        ts.add("foo");
        @SuppressWarnings("unchecked")
        Predicate<String> pred = mock(Predicate.class);
        when(pred.test(Mockito.<String>any()))
            .thenReturn(true);
        assertThat(CollectionUtilities.<String>any(ts, pred), is(true));
    }

    @Test
    void allTsIsEmptyReturnsTrue() {
        @SuppressWarnings("unchecked")
        Predicate<String> pred = mock(Predicate.class);
        assertThat(CollectionUtilities.<String>all(new LinkedList<String>(), pred), is(true));
    }

    @Test
    void allTsIsFooReturnsFalse() {
        LinkedList<String> ts = new LinkedList<String>();
        ts.add("foo");
        @SuppressWarnings("unchecked")
        Predicate<String> pred = mock(Predicate.class);
        when(pred.test(Mockito.<String>any()))
            .thenReturn(false);
        assertThat(CollectionUtilities.<String>all(ts, pred), is(false));
    }

    @Test
    void firstTsIsAnnaReturnsAnna() {
        LinkedList<String> ts = new LinkedList<String>();
        ts.add("Anna");
        assertThat(CollectionUtilities.<String>first(ts), is("Anna"));
    }

    @Test
    void mapXsIsFooReturnsFoo() {
        LinkedList<String> xs = new LinkedList<String>();
        xs.add("foo");
        @SuppressWarnings("unchecked")
        Function<String, String> fn = mock(Function.class);
        when(fn.apply(Mockito.<String>any()))
            .thenReturn("foo");
        assertThat(CollectionUtilities.<String, String>map(xs, fn), hasSize(1));
        assertTrue(CollectionUtilities.<String, String>map(xs, fn).contains("foo"));
    }

    @Test
    void filterXsIsEmptyReturnsEmpty() {
        @SuppressWarnings("unchecked")
        Predicate<String> pred = mock(Predicate.class);
        assertThat(CollectionUtilities.<String>filter(new LinkedList<String>(), pred), empty());
    }

    @Test
    void maybe() {

        // arrange
        LinkedList<String> xs = new LinkedList<String>();
        xs.add("foo");
        @SuppressWarnings("unchecked")
        Consumer<Collection<String>> fn = mock(Consumer.class);

        // act
        CollectionUtilities.<String>maybe(xs, fn);

        // assert
        Mockito.verify(fn).accept(ArgumentMatchers.<Collection<String>>any());
    }

    @Test
    void maybeXsIsEmpty() {
        @SuppressWarnings("unchecked")
        Consumer<Collection<String>> fn = mock(Consumer.class);
        CollectionUtilities.<String>maybe(new LinkedList<String>(), fn);
    }

    @Test
    void maybeDfltIsFooAndXsIsBarReturnsFoo() {
        LinkedList<String> xs = new LinkedList<String>();
        xs.add("bar");
        @SuppressWarnings("unchecked")
        Function<Collection<String>, String> fn = mock(Function.class);
        when(fn.apply(Mockito.<Collection<String>>any()))
            .thenReturn("foo");
        assertThat(CollectionUtilities.<String, String>maybe(xs, fn, "foo"), is("foo"));
    }

    @Test
    void maybeDfltIsFooAndXsIsEmptyReturnsFoo() {
        @SuppressWarnings("unchecked")
        Function<Collection<String>, String> fn = mock(Function.class);
        assertThat(CollectionUtilities.<String, String>maybe(new LinkedList<String>(), fn, "foo"), is("foo"));
    }

    @Test
    void notEmpty() {
        assertThat(CollectionUtilities.<String>notEmpty(new LinkedList<String>()), is(false));
        assertThat(CollectionUtilities.<String>notEmpty(null), is(false));
    }

    @Test
    void notEmptyTsIsFooReturnsTrue() {
        LinkedList<String> ts = new LinkedList<String>();
        ts.add("foo");
        assertThat(CollectionUtilities.<String>notEmpty(ts), is(true));
    }

    @Test
    void headXsIsEmpty() {
        assertThat(CollectionUtilities.<String>head(new LinkedList<String>()).isPresent(), is(false));
    }

    @Test
    void headXsIsFooReturnsFoo() {
        LinkedList<String> xs = new LinkedList<String>();
        xs.add("foo");
        assertThat(CollectionUtilities.<String>head(xs).get(), is("foo"));
    }

    @Test
    void sortXsIsFooReturnsFoo() {
        LinkedList<String> xs = new LinkedList<String>();
        xs.add("foo");
        @SuppressWarnings("unchecked")
        Comparator<String> comparator = mock(Comparator.class);
        assertThat(CollectionUtilities.<String>sort(xs, comparator), hasSize(1));
        assertThat(CollectionUtilities.<String>sort(xs, comparator).get(0), is("foo"));
    }

    @Test
    void sortXsIsOneReturnsOne() {
        LinkedList<Integer> xs = new LinkedList<Integer>();
        xs.add(1);
        assertThat(CollectionUtilities.<Integer>sort(xs), hasSize(1));
        assertThat(CollectionUtilities.<Integer>sort(xs).get(0), is(1));
    }

    @Test
    void isEmptyXsIsEmptyReturnsTrue() {
        assertThat(CollectionUtilities.<String>isEmpty(new LinkedList<String>()), is(true));
    }

    @Test
    void isEmptyXsIsFooReturnsFalse() {
        LinkedList<String> xs = new LinkedList<String>();
        xs.add("foo");
        assertThat(CollectionUtilities.<String>isEmpty(xs), is(false));
    }

    @Test
    void maybeFirst() {
        assertThat(CollectionUtilities.<String>maybeFirst(new LinkedList<String>()).isPresent(), is(false));
        assertThat(CollectionUtilities.<String>maybeFirst(null).isPresent(), is(false));
    }

    @Test
    void maybeFirstXsIsAnnaReturnsAnna() {
        LinkedList<String> xs = new LinkedList<String>();
        xs.add("Anna");
        assertThat(CollectionUtilities.<String>maybeFirst(xs).get(), is("Anna"));
    }

    @Test
    void maybeFirstXsIsEmpty() {
        @SuppressWarnings("unchecked")
        Predicate<String> predicate = mock(Predicate.class);
        assertThat(CollectionUtilities.<String>maybeFirst(new LinkedList<String>(), predicate).isPresent(), is(false));
    }

    @Test
    void sumByXsIsEmptyReturnsZero() {
        @SuppressWarnings("unchecked")
        ToLongFunction<String> fn = mock(ToLongFunction.class);
        assertThat(CollectionUtilities.<String>sumBy(new LinkedList<String>(), fn), is(0L));
    }

    @Test
    void sumByXsIsFooReturnsOne() {
        LinkedList<String> xs = new LinkedList<String>();
        xs.add("foo");
        @SuppressWarnings("unchecked")
        ToLongFunction<String> fn = mock(ToLongFunction.class);
        when(fn.applyAsLong(Mockito.<String>any()))
            .thenReturn(1L);
        assertThat(CollectionUtilities.<String>sumBy(xs, fn), is(1L));
    }

    @Test
    void sumIntsValuesIsOneReturnsOne() {
        LinkedList<Integer> values = new LinkedList<Integer>();
        values.add(1);
        assertThat(CollectionUtilities.sumInts(values), is(1L));
    }

    @Test
    void sumLongsValuesIsOneReturnsOne() {
        LinkedList<Long> values = new LinkedList<Long>();
        values.add(1L);
        assertThat(CollectionUtilities.sumLongs(values), is(1L));
    }
}

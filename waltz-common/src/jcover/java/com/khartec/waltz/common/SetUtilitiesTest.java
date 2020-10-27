package com.khartec.waltz.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.Function;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.khartec.waltz.common.SetUtilities
 *
 * @author Diffblue Cover
 */

class SetUtilitiesTest {

    @Test
    void asSet() {
        assertThat(SetUtilities.<String>asSet(), empty());
        assertThat(SetUtilities.<String>asSet("foo"), hasSize(1));
        assertThat(SetUtilities.<String>asSet("foo"), hasItem("foo"));
        assertThat(SetUtilities.<String>asSet(null), empty());
    }

    @Test
    void fromCollection() {
        assertThat(SetUtilities.<String>fromCollection(new LinkedList<String>()), empty());
        assertThat(SetUtilities.<String>fromCollection(null), empty());
    }

    @Test
    void fromCollectionTsIsFooReturnsFoo() {
        LinkedList<String> ts = new LinkedList<String>();
        ts.add("foo");
        assertThat(SetUtilities.<String>fromCollection(ts), hasSize(1));
        assertThat(SetUtilities.<String>fromCollection(ts), hasItem("foo"));
    }

    @Test
    void mapXsIsBarReturnsFoo() {
        LinkedList<String> xs = new LinkedList<String>();
        xs.add("bar");
        @SuppressWarnings("unchecked")
        Function<String, String> fn = mock(Function.class);
        when(fn.apply(Mockito.<String>any()))
            .thenReturn("foo");
        assertThat(SetUtilities.<String, String>map(xs, fn), hasSize(1));
        assertThat(SetUtilities.<String, String>map(xs, fn), hasItem("foo"));
    }

    @Test
    void mapXsIsEmpty() {
        @SuppressWarnings("unchecked")
        Function<String, String> fn = mock(Function.class);
        assertThat(SetUtilities.<String, String>map(new LinkedList<String>(), fn), empty());
    }

    @Test
    void mapXsIsNull() {
        @SuppressWarnings("unchecked")
        Function<String, String> fn = mock(Function.class);
        assertThat(SetUtilities.<String, String>map(null, fn), empty());
    }

    @Test
    void unionXssIsFooReturnsFoo() {
        LinkedList<String> collection = new LinkedList<String>();
        collection.add("foo");
        assertThat(SetUtilities.<String>union(collection), hasSize(1));
        assertThat(SetUtilities.<String>union(collection), hasItem("foo"));
    }

    @Test
    void orderedUnionXssIsFooReturnsFoo() {
        LinkedList<String> collection = new LinkedList<String>();
        collection.add("foo");
        assertThat(SetUtilities.<String>orderedUnion(collection), hasSize(1));
        assertThat(SetUtilities.<String>orderedUnion(collection), hasItem("foo"));
    }

    @Test
    void minusReturnsEmpty() {
        assertThat(SetUtilities.<String>minus(new HashSet<String>(), new HashSet<String>()), empty());
    }

    @Test
    void intersectionReturnsEmpty() {
        assertThat(SetUtilities.<String>intersection(new HashSet<String>(), new HashSet<String>()), empty());
    }

    @Test
    void uniqByXsIsBarReturnsBar() {
        LinkedList<String> xs = new LinkedList<String>();
        xs.add("bar");
        @SuppressWarnings("unchecked")
        Function<String, String> comparator = mock(Function.class);
        when(comparator.apply(Mockito.<String>any()))
            .thenReturn("foo");
        assertThat(SetUtilities.<String, String>uniqBy(xs, comparator), hasSize(1));
        assertThat(SetUtilities.<String, String>uniqBy(xs, comparator), hasItem("bar"));
    }

    @Test
    void uniqByXsIsEmptyReturnsEmpty() {
        @SuppressWarnings("unchecked")
        Function<String, String> comparator = mock(Function.class);
        assertThat(SetUtilities.<String, String>uniqBy(new LinkedList<String>(), comparator), empty());
    }

    @Test
    void unionAllReturnsSmith() {
        LinkedList<LinkedList<String>> values =
             new LinkedList<LinkedList<String>>();
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Smith");
        values.add(linkedList);
        assertThat(SetUtilities.<String>unionAll(values), hasSize(1));
        assertTrue(SetUtilities.<String>unionAll(values).contains("Smith"));
    }
}

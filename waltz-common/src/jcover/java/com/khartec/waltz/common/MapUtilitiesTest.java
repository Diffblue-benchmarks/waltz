package com.khartec.waltz.common;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.khartec.waltz.common.MapUtilities
 *
 * @author Diffblue Cover
 */

class MapUtilitiesTest {

    @Test
    void newHashMap() {
        assertThat(MapUtilities.<String, String>newHashMap("HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5").get("HmacMD5"), is("HmacMD5"));
        assertThat(MapUtilities.<String, String>newHashMap("HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5").get("HmacMD5"), is("HmacMD5"));
        assertThat(MapUtilities.<String, String>newHashMap("HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5").get("HmacMD5"), is("HmacMD5"));
        assertThat(MapUtilities.<String, String>newHashMap("HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5").get("HmacMD5"), is("HmacMD5"));
        assertThat(MapUtilities.<String, String>newHashMap("HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5", "HmacMD5").get("HmacMD5"), is("HmacMD5"));
        assertThat(MapUtilities.<String, String>newHashMap("key", "HmacMD5").get("key"), is("HmacMD5"));
        assertThat(MapUtilities.<String, String>newHashMap().isEmpty(), is(true));
    }

    @Test
    void groupByXsIsFooReturnsFoo() {
        @SuppressWarnings("unchecked")
        Function<String, String> keyFn = mock(Function.class);
        when(keyFn.apply(Mockito.<String>any()))
            .thenReturn("foo");
        LinkedList<String> xs = new LinkedList<String>();
        xs.add("foo");
        assertThat(MapUtilities.<String, String>groupBy(keyFn, xs).get("foo"), hasSize(1));
        assertTrue(MapUtilities.<String, String>groupBy(keyFn, xs).get("foo").contains("foo"));
    }

    @Test
    void indexBy1() {
        LinkedList<String> xs = new LinkedList<String>();
        xs.add("foo");
        @SuppressWarnings("unchecked")
        Function<String, String> keyFn = mock(Function.class);
        when(keyFn.apply(Mockito.<String>any()))
            .thenReturn("foo");
        assertThat(MapUtilities.<String, String>indexBy(xs, keyFn).get("foo"), is("foo"));
    }

    @Test
    void indexBy2() {
        LinkedList<String> xs = new LinkedList<String>();
        xs.add("foo");
        @SuppressWarnings("unchecked")
        Function<String, String> keyFn = mock(Function.class);
        when(keyFn.apply(Mockito.<String>any()))
            .thenReturn("foo");
        @SuppressWarnings("unchecked")
        Function<String, String> valueFn = mock(Function.class);
        when(valueFn.apply(Mockito.<String>any()))
            .thenReturn("foo");
        assertThat(MapUtilities.<String, String, String>indexBy(xs, keyFn, valueFn).get("foo"), is("foo"));
    }

    @Test
    void indexBy3() {
        @SuppressWarnings("unchecked")
        Function<String, String> keyFn = mock(Function.class);
        when(keyFn.apply(Mockito.<String>any()))
            .thenReturn("foo");
        @SuppressWarnings("unchecked")
        Function<String, String> valueFn = mock(Function.class);
        when(valueFn.apply(Mockito.<String>any()))
            .thenReturn("foo");
        LinkedList<String> xs = new LinkedList<String>();
        xs.add("foo");
        @SuppressWarnings("unchecked")
        BinaryOperator<String> mergeFunction = mock(BinaryOperator.class);
        assertThat(MapUtilities.<String, String, String>indexBy(keyFn, valueFn, xs, mergeFunction).get("foo"), is("foo"));
    }

    @Test
    void countByXsIsEmpty() {
        @SuppressWarnings("unchecked")
        Function<String, String> keyFn = mock(Function.class);
        assertThat(MapUtilities.<String, String>countBy(keyFn, new LinkedList<String>()).isEmpty(), is(true));
    }

    @Test
    void countByXsIsNull() {
        @SuppressWarnings("unchecked")
        Function<String, String> keyFn = mock(Function.class);
        assertThat(MapUtilities.<String, String>countBy(keyFn, null).isEmpty(), is(true));
    }

    @Test
    void ensureNotNullMaybeMapIsFooReturnsFoo() {

        // arrange
        HashMap<String, String> maybeMap = new HashMap<String, String>();
        maybeMap.put("bar", "foo");

        // act
        Map<String, String> result =
             MapUtilities.<String, String>ensureNotNull(maybeMap);

        // assert
        assertThat(result.get("bar"), is("foo"));
        assertThat(maybeMap, instanceOf(Map.class));
        assertThat((Map<String, String>) maybeMap, sameInstance(result));
    }

    @Test
    void ensureNotNullMaybeMapIsNullReturnsEmpty() {
        assertThat(MapUtilities.<String, String>ensureNotNull(null).isEmpty(), is(true));
    }

    @Test
    void isEmptyMapIsFooReturnsFalse() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("bar", "foo");
        assertThat(MapUtilities.<String, String>isEmpty(map), is(false));
    }

    @Test
    void isEmptyMapIsNullReturnsTrue() {
        assertThat(MapUtilities.<String, String>isEmpty(null), is(true));
    }

    @Test
    void maybeGet() {
        assertThat(MapUtilities.<String, String>maybeGet(new HashMap<String, String>(), "key").isPresent(), is(false));
        assertThat(MapUtilities.<String, String>maybeGet(null, "key").isPresent(), is(false));
    }

    @Test
    void groupAndThenXsIsFooReturnsFoo() {
        @SuppressWarnings("unchecked")
        Function<String, String> keyFn = mock(Function.class);
        when(keyFn.apply(Mockito.<String>any()))
            .thenReturn("foo");
        @SuppressWarnings("unchecked")
        Function<Collection<String>, String> valueFn = mock(Function.class);
        when(valueFn.apply(Mockito.<Collection<String>>any()))
            .thenReturn("foo");
        LinkedList<String> xs = new LinkedList<String>();
        xs.add("foo");
        assertThat(MapUtilities.<String, String, String>groupAndThen(keyFn, valueFn, xs).get("foo"), is("foo"));
    }

    @Test
    void transformKeysOriginalIsFooReturnsFoo() {
        HashMap<String, String> original = new HashMap<String, String>();
        original.put("foo", "foo");
        @SuppressWarnings("unchecked")
        Function<String, String> transformation = mock(Function.class);
        when(transformation.apply(Mockito.<String>any()))
            .thenReturn("foo");
        assertThat(MapUtilities.<String, String, String>transformKeys(original, transformation).get("foo"), is("foo"));
    }

    @Test
    void composeMap1IsFooAndMap2IsFooReturnsFoo() {
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("foo", "foo");
        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("foo", "foo");
        assertThat(MapUtilities.<String, String, String>compose(map1, map2).get("foo"), is("foo"));
    }
}

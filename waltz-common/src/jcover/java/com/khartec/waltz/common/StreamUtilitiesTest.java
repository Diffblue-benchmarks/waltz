package com.khartec.waltz.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

/**
 * Unit tests for com.khartec.waltz.common.StreamUtilities
 *
 * @author Diffblue Cover
 */

class StreamUtilitiesTest {

    @Test
    void batchProcessingCollectorBatchSizeIsOne() {
        @SuppressWarnings("unchecked")
        Consumer<List<String>> batchProcessor = mock(Consumer.class);
        // pojo java.util.stream.Collector<String, List<String>, Integer>
    }

    @Test
    void concat1() {
        Collection<String> element = new LinkedList<String>();
        element.add("foo");
        String[] array =
             StreamUtilities.<String>concat(element).toArray(String[]::new);
    }

    @Test
    void tapReturnsFoo() {
        assertThat(StreamUtilities.<String>tap().apply("foo"), is("foo"));
    }

    @Test
    void tap() {
        @SuppressWarnings("unchecked")
        Consumer<String> consumer = mock(Consumer.class);
        assertThat(StreamUtilities.<String>tap(consumer).apply("foo"), is("foo"));
        Mockito.verify(consumer).accept(ArgumentMatchers.eq("foo"));
    }

    @Test
    void ofNullableArrayArrIsBroadway() {
        String[] arr = new String[] { "Broadway" };
        String[] array =
             StreamUtilities.<String>ofNullableArray(arr).toArray(String[]::new);
    }

    @Test
    void ofNullableArrayArrIsNull() {
        String[] array =
             StreamUtilities.<String>ofNullableArray(null).toArray(String[]::new);
    }

    @Test
    void concat2() {
        String[] array =
             StreamUtilities.<String>concat(Stream.<String>of("Broadway")).toArray(String[]::new);
    }

    @Test
    void mkSiphon() {
        @SuppressWarnings("unchecked")
        Predicate<String> pred = mock(Predicate.class);
        assertThat(StreamUtilities.<String>mkSiphon(pred).getResults(), empty());
    }
}
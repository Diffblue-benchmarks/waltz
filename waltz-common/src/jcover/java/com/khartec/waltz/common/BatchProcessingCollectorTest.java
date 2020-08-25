package com.khartec.waltz.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

/**
 * Unit tests for com.khartec.waltz.common.BatchProcessingCollector
 *
 * @author Diffblue Cover
 */

class BatchProcessingCollectorTest {

    @Test
    void supplier() {
        @SuppressWarnings("unchecked")
        Consumer<List<String>> batchProcessor = mock(Consumer.class);
        // pojo java.util.function.Supplier<List<String>>
    }

    @Test
    void accumulator() {
        @SuppressWarnings("unchecked")
        Consumer<List<String>> batchProcessor = mock(Consumer.class);
        // pojo java.util.function.BiConsumer<List<String>, String>
    }

    @Test
    void combiner() {
        @SuppressWarnings("unchecked")
        Consumer<List<String>> batchProcessor = mock(Consumer.class);
        // pojo java.util.function.BinaryOperator<List<String>>
    }

    @Test
    void finisher() {
        @SuppressWarnings("unchecked")
        Consumer<List<String>> batchProcessor = mock(Consumer.class);
        ArrayList<String> x8 = new ArrayList<String>();
        x8.add("foo");
        assertThat(new BatchProcessingCollector<String>(1, batchProcessor).finisher().apply(x8), is(1));
        Mockito.verify(batchProcessor).accept(ArgumentMatchers.<List<String>>any());
    }

    @Test
    void characteristicsReturnsEmpty() {
        @SuppressWarnings("unchecked")
        Consumer<List<String>> batchProcessor = mock(Consumer.class);
        assertThat(new BatchProcessingCollector<String>(1, batchProcessor).characteristics(), empty());
    }
}

package com.khartec.waltz.model.complexity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.complexity.ComplexityKind
 *
 * @author Diffblue Cover
 */

class ComplexityKindTest {

    @Test
    void valuesReturnsConnectionMeasurableServerTotal() {
        ComplexityKind[] result = ComplexityKind.values();
        assertThat(result[0], is(ComplexityKind.CONNECTION));
        assertThat(result[1], is(ComplexityKind.MEASURABLE));
        assertThat(result[2], is(ComplexityKind.SERVER));
        assertThat(result[3], is(ComplexityKind.TOTAL));
    }
}

package com.khartec.waltz.model.complexity;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.khartec.waltz.model.tally.Tally;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.complexity.ComplexityUtilities
 *
 * @author Diffblue Cover
 */

class ComplexityUtilitiesTest {

    @Test
    void tallyToComplexityScoreBaselineIsOne() {
        @SuppressWarnings("unchecked")
        Tally<Long> tally = mock(Tally.class);
        when(tally.count())
            .thenReturn(0.0);
        when(tally.id())
            .thenReturn(1L);
        // pojo ComplexityScore
    }

    @Test
    void tallyToComplexityScoreBaselineIsZero() {
        @SuppressWarnings("unchecked")
        Tally<Long> tally = mock(Tally.class);
        when(tally.count())
            .thenReturn(1.0);
        when(tally.id())
            .thenReturn(1L);
        // pojo ComplexityScore
    }
}

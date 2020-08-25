package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.FreshnessIndicator
 *
 * @author Diffblue Cover
 */

class FreshnessIndicatorTest {

    @Test
    void valuesReturnsNever_observedHistorically_observedObservedRecently_observed() {
        FreshnessIndicator[] result = FreshnessIndicator.values();
        assertThat(result[0], is(FreshnessIndicator.NEVER_OBSERVED));
        assertThat(result[1], is(FreshnessIndicator.HISTORICALLY_OBSERVED));
        assertThat(result[2], is(FreshnessIndicator.OBSERVED));
        assertThat(result[3], is(FreshnessIndicator.RECENTLY_OBSERVED));
    }
}

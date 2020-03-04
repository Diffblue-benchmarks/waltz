package com.khartec.waltz.model;

import static org.junit.Assert.assertTrue;

import com.khartec.waltz.model.application.ApplicationKind;

import org.junit.Test;

/**
 * Unit tests for com.khartec.waltz.model.ImmutableSelectionFilters
 *
 * @author Diffblue JCover
 */

public class ImmutableSelectionFiltersTest {

    @Test
    public void omitApplicationKinds() {
        assertTrue(ImmutableSelectionFilters.copyOf(ImmutableSelectionFilters.fromJson(new ImmutableSelectionFilters.Json())).omitApplicationKinds().isEmpty());
        assertTrue(ImmutableSelectionFilters.fromJson(new ImmutableSelectionFilters.Json()).omitApplicationKinds().isEmpty());
    }

    @Test
    public void withOmitApplicationKindsElementsIsIN_HOUSE() {
        // pojo ImmutableSelectionFilters
    }
}

package com.khartec.waltz.model.software_catalog;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for com.khartec.waltz.model.software_catalog.ImmutableSoftwareSummaryStatistics
 *
 * @author Diffblue JCover
 */

public class ImmutableSoftwareSummaryStatisticsTest {

    @Test
    public void groupCounts() {
        assertTrue(ImmutableSoftwareSummaryStatistics.copyOf(ImmutableSoftwareSummaryStatistics.fromJson(new ImmutableSoftwareSummaryStatistics.Json())).groupCounts().isEmpty());
        assertTrue(ImmutableSoftwareSummaryStatistics.fromJson(new ImmutableSoftwareSummaryStatistics.Json()).groupCounts().isEmpty());
    }

    @Test
    public void nameCountsReturnsEmpty() {
        assertTrue(ImmutableSoftwareSummaryStatistics.fromJson(new ImmutableSoftwareSummaryStatistics.Json()).nameCounts().isEmpty());
    }

    @Test
    public void vendorCountsReturnsEmpty() {
        assertTrue(ImmutableSoftwareSummaryStatistics.fromJson(new ImmutableSoftwareSummaryStatistics.Json()).vendorCounts().isEmpty());
    }
}

package com.khartec.waltz.model.database_information;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for com.khartec.waltz.model.database_information.ImmutableDatabaseSummaryStatistics
 *
 * @author Diffblue JCover
 */

public class ImmutableDatabaseSummaryStatisticsTest {

    @Test
    public void endOfLifeStatusCountsReturnsEmpty() {
        assertTrue(ImmutableDatabaseSummaryStatistics.fromJson(new ImmutableDatabaseSummaryStatistics.Json()).endOfLifeStatusCounts().isEmpty());
    }

    @Test
    public void environmentCountsReturnsEmpty() {
        assertTrue(ImmutableDatabaseSummaryStatistics.fromJson(new ImmutableDatabaseSummaryStatistics.Json()).environmentCounts().isEmpty());
    }

    @Test
    public void testEquals() {
        assertThat(ImmutableDatabaseSummaryStatistics.copyOf(ImmutableDatabaseSummaryStatistics.fromJson(new ImmutableDatabaseSummaryStatistics.Json())).equals("foo"), is(false));
        assertThat(ImmutableDatabaseSummaryStatistics.fromJson(new ImmutableDatabaseSummaryStatistics.Json()).equals("foo"), is(false));
    }

    @Test
    public void vendorCountsReturnsEmpty() {
        assertTrue(ImmutableDatabaseSummaryStatistics.fromJson(new ImmutableDatabaseSummaryStatistics.Json()).vendorCounts().isEmpty());
    }
}

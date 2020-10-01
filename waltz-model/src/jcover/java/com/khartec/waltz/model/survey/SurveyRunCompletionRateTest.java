package com.khartec.waltz.model.survey;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.survey.SurveyRunCompletionRate
 *
 * @author Diffblue Cover
 */

class SurveyRunCompletionRateTest {

    @Test
    void notStartedCountReturnsZero() {
        assertThat(SurveyRunCompletionRate.mkNoData(1L).notStartedCount(), is(0));
    }

    @Test
    void inProgressCountReturnsZero() {
        assertThat(SurveyRunCompletionRate.mkNoData(1L).inProgressCount(), is(0));
    }

    @Test
    void completedCountReturnsZero() {
        assertThat(SurveyRunCompletionRate.mkNoData(1L).completedCount(), is(0));
    }

    @Test
    void totalCountReturnsZero() {
        assertThat(SurveyRunCompletionRate.mkNoData(1L).totalCount(), is(0));
    }
}

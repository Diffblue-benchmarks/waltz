package com.khartec.waltz.model.survey;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.survey.SurveyRunStatus
 *
 * @author Diffblue Cover
 */

class SurveyRunStatusTest {

    @Test
    void valuesReturnsDraftIssuedCompleted() {
        SurveyRunStatus[] result = SurveyRunStatus.values();
        assertThat(result[0], is(SurveyRunStatus.DRAFT));
        assertThat(result[1], is(SurveyRunStatus.ISSUED));
        assertThat(result[2], is(SurveyRunStatus.COMPLETED));
    }
}

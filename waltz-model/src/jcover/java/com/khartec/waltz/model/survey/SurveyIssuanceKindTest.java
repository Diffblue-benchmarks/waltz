package com.khartec.waltz.model.survey;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.survey.SurveyIssuanceKind
 *
 * @author Diffblue Cover
 */

class SurveyIssuanceKindTest {

    @Test
    void valuesReturnsGroupIndividual() {
        SurveyIssuanceKind[] result = SurveyIssuanceKind.values();
        assertThat(result[0], is(SurveyIssuanceKind.GROUP));
        assertThat(result[1], is(SurveyIssuanceKind.INDIVIDUAL));
    }
}

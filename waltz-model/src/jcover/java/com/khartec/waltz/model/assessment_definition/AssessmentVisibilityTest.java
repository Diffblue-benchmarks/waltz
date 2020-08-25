package com.khartec.waltz.model.assessment_definition;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.assessment_definition.AssessmentVisibility
 *
 * @author Diffblue Cover
 */

class AssessmentVisibilityTest {

    @Test
    void valuesReturnsPrimarySecondary() {
        AssessmentVisibility[] result = AssessmentVisibility.values();
        assertThat(result[0], is(AssessmentVisibility.PRIMARY));
        assertThat(result[1], is(AssessmentVisibility.SECONDARY));
    }
}

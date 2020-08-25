package com.khartec.waltz.model.rating;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.rating.AuthoritativenessRating
 *
 * @author Diffblue Cover
 */

class AuthoritativenessRatingTest {

    @Test
    void valuesReturnsPrimarySecondaryNo_opinionDiscouraged() {
        AuthoritativenessRating[] result = AuthoritativenessRating.values();
        assertThat(result[0], is(AuthoritativenessRating.PRIMARY));
        assertThat(result[1], is(AuthoritativenessRating.SECONDARY));
        assertThat(result[2], is(AuthoritativenessRating.NO_OPINION));
        assertThat(result[3], is(AuthoritativenessRating.DISCOURAGED));
    }
}

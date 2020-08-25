package com.khartec.waltz.model.rating;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.rating.RatingScheme
 *
 * @author Diffblue Cover
 */

class RatingSchemeTest {

    @Test
    void toList() {
        List<RagName> result = RatingScheme.toList();
        assertThat(result.size(), is(6));
        // pojo RagName
        // pojo RagName
        // pojo RagName
        // pojo RagName
        // pojo RagName
        // pojo RagName
    }

    @Test
    void mkDflt() {
        // pojo RatingScheme
    }
}

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
    void ratings() {
        List<RagName> result = RatingScheme.mkDflt().ratings();
        assertThat(result.size(), is(6));
        // pojo RagName result.get(0)
        // pojo RagName result.get(1)
        // pojo RagName result.get(2)
        // pojo RagName result.get(3)
        // pojo RagName result.get(4)
        // pojo RagName result.get(5)
    }

    @Test
    void toList() {
        List<RagName> result = RatingScheme.toList();
        assertThat(result.size(), is(6));
        // pojo RagName result.get(0)
        // pojo RagName result.get(1)
        // pojo RagName result.get(2)
        // pojo RagName result.get(3)
        // pojo RagName result.get(4)
        // pojo RagName result.get(5)
    }
}

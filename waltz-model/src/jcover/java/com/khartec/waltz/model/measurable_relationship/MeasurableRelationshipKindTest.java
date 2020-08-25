package com.khartec.waltz.model.measurable_relationship;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.measurable_relationship.MeasurableRelationshipKind
 *
 * @author Diffblue Cover
 */

class MeasurableRelationshipKindTest {

    @Test
    void valuesReturnsWeakly_relates_toStrongly_relates_to() {
        MeasurableRelationshipKind[] result =
             MeasurableRelationshipKind.values();
        assertThat(result[0], is(MeasurableRelationshipKind.WEAKLY_RELATES_TO));
        assertThat(result[1], is(MeasurableRelationshipKind.STRONGLY_RELATES_TO));
    }
}

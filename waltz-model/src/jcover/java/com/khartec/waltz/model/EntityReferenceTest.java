package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.EntityReference
 *
 * @author Diffblue Cover
 */

class EntityReferenceTest {

    @Test
    void entityLifecycleStatusReturnsActive() {
        assertThat(EntityReference.mkRef(EntityKind.ACTOR, 1L).entityLifecycleStatus(), is(EntityLifecycleStatus.ACTIVE));
    }
}

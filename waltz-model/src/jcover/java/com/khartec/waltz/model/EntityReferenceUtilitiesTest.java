package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.EntityReferenceUtilities
 *
 * @author Diffblue Cover
 */

class EntityReferenceUtilitiesTest {

    @Test
    void pretty() {
        EntityReference ref = mock(EntityReference.class);
        when(ref.id())
            .thenReturn(1L);
        when(ref.kind())
            .thenReturn(EntityKind.ACTOR);
        when(ref.name())
            .thenReturn(Optional.<String>empty());
        assertThat(EntityReferenceUtilities.pretty(ref), is("? [ACTOR/1]"));
    }

    @Test
    void safeName() {
        EntityReference ref = mock(EntityReference.class);
        when(ref.id())
            .thenReturn(1L);
        when(ref.name())
            .thenReturn(Optional.<String>empty());
        assertThat(EntityReferenceUtilities.safeName(ref), is("[1]"));
    }
}

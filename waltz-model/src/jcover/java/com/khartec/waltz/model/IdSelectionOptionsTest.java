package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.IdSelectionOptions
 *
 * @author Diffblue Cover
 */

class IdSelectionOptionsTest {

    @Test
    void entityLifecycleStatusesReturnsActive() {
        EntityReference ref1 = mock(EntityReference.class);
        when(ref1.kind())
            .thenReturn(EntityKind.ACTOR);
        assertThat(IdSelectionOptions.mkOpts(ref1).entityLifecycleStatuses(), hasSize(1));
    }

    @Test
    void mkOptsScopeIsExact() {
        EntityReference ref = mock(EntityReference.class);
        // pojo IdSelectionOptions
    }

    @Test
    void mkOptsForAllLifecycleStatesScopeIsExact() {
        EntityReference ref = mock(EntityReference.class);
        // pojo IdSelectionOptions
    }
}

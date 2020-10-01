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
    void entityLifecycleStatuses1() {
        EntityReference ref = mock(EntityReference.class);
        assertThat(IdSelectionOptions.mkOpts(ref, HierarchyQueryScope.EXACT).entityLifecycleStatuses(), hasSize(1));
    }

    @Test
    void entityLifecycleStatuses2() {
        EntityReference ref1 = mock(EntityReference.class);
        when(ref1.kind())
            .thenReturn(EntityKind.ACTOR);
        assertThat(IdSelectionOptions.mkOpts(ref1).entityLifecycleStatuses(), hasSize(1));
    }

    @Test
    void entityLifecycleStatusesReturnsActivePendingRemoved() {
        EntityReference ref = mock(EntityReference.class);
        assertThat(IdSelectionOptions.mkOptsForAllLifecycleStates(ref, HierarchyQueryScope.EXACT).entityLifecycleStatuses(), hasSize(3));
    }
}

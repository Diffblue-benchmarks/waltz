package com.khartec.waltz.model.application;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityLifecycleStatus;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.HierarchyQueryScope;
import com.khartec.waltz.model.IdSelectionOptions;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.application.ApplicationIdSelectionOptions
 *
 * @author Diffblue Cover
 */

class ApplicationIdSelectionOptionsTest {

    @Test
    void applicationKinds1() {
        EntityReference ref1 = mock(EntityReference.class);
        when(ref1.kind())
            .thenReturn(EntityKind.ACTOR);
        assertThat(ApplicationIdSelectionOptions.mkOpts(ref1).applicationKinds(), hasSize(7));
    }

    @Test
    void applicationKinds2() {
        EntityReference entityReference = mock(EntityReference.class);
        IdSelectionOptions options = mock(IdSelectionOptions.class);
        when(options.entityLifecycleStatuses())
            .thenReturn(new HashSet<EntityLifecycleStatus>());
        when(options.entityReference())
            .thenReturn(entityReference);
        when(options.scope())
            .thenReturn(HierarchyQueryScope.EXACT);
        assertThat(ApplicationIdSelectionOptions.mkOpts(options).applicationKinds(), hasSize(7));
    }

    @Test
    void applicationKindsReturnsEmpty() {
        EntityReference ref = mock(EntityReference.class);
        assertThat(ApplicationIdSelectionOptions.mkOpts(ref, HierarchyQueryScope.EXACT, new HashSet<EntityLifecycleStatus>(), new HashSet<ApplicationKind>()).applicationKinds(), empty());
    }
}

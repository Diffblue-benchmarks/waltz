package com.khartec.waltz.model.entity_search;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityLifecycleStatus;

import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.entity_search.EntitySearchOptions
 *
 * @author Diffblue Cover
 */

class EntitySearchOptionsTest {

    @Test
    void entityLifecycleStatusesReturnsActivePending() {
        List<EntityLifecycleStatus> result =
             EntitySearchOptions.mkForEntity(EntityKind.ACTOR, "entity").entityLifecycleStatuses();
        assertThat(result.size(), is(2));
        assertThat(result.get(0), is(EntityLifecycleStatus.ACTIVE));
        assertThat(result.get(1), is(EntityLifecycleStatus.PENDING));
    }

    @Test
    void limit() {
        assertThat(EntitySearchOptions.mkForEntity(EntityKind.ACTOR, "entity").limit(), is(40));
    }
}

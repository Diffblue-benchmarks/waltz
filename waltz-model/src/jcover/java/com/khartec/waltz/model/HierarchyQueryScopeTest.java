package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.HierarchyQueryScope
 *
 * @author Diffblue Cover
 */

class HierarchyQueryScopeTest {

    @Test
    void valuesReturnsExactParentsChildren() {
        HierarchyQueryScope[] result = HierarchyQueryScope.values();
        assertThat(result[0], is(HierarchyQueryScope.EXACT));
        assertThat(result[1], is(HierarchyQueryScope.PARENTS));
        assertThat(result[2], is(HierarchyQueryScope.CHILDREN));
    }

    @Test
    void determineUpwardsScopeForKindKindIsActorReturnsExact() {
        assertThat(HierarchyQueryScope.determineUpwardsScopeForKind(EntityKind.ACTOR), is(HierarchyQueryScope.EXACT));
    }

    @Test
    void determineDownwardsScopeForKindKindIsActorReturnsExact() {
        assertThat(HierarchyQueryScope.determineDownwardsScopeForKind(EntityKind.ACTOR), is(HierarchyQueryScope.EXACT));
    }
}

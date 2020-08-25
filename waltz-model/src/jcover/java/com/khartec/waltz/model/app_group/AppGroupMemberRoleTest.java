package com.khartec.waltz.model.app_group;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.app_group.AppGroupMemberRole
 *
 * @author Diffblue Cover
 */

class AppGroupMemberRoleTest {

    @Test
    void valuesReturnsViewerOwner() {
        AppGroupMemberRole[] result = AppGroupMemberRole.values();
        assertThat(result[0], is(AppGroupMemberRole.VIEWER));
        assertThat(result[1], is(AppGroupMemberRole.OWNER));
    }
}

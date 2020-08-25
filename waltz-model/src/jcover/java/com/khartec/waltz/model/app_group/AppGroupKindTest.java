package com.khartec.waltz.model.app_group;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.app_group.AppGroupKind
 *
 * @author Diffblue Cover
 */

class AppGroupKindTest {

    @Test
    void valuesReturnsPublicPrivate() {
        AppGroupKind[] result = AppGroupKind.values();
        assertThat(result[0], is(AppGroupKind.PUBLIC));
        assertThat(result[1], is(AppGroupKind.PRIVATE));
    }
}

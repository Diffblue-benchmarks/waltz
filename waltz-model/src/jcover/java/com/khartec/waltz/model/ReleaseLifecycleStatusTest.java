package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.ReleaseLifecycleStatus
 *
 * @author Diffblue Cover
 */

class ReleaseLifecycleStatusTest {

    @Test
    void valuesReturnsDraftActiveDeprecatedObsolete() {
        ReleaseLifecycleStatus[] result = ReleaseLifecycleStatus.values();
        assertThat(result[0], is(ReleaseLifecycleStatus.DRAFT));
        assertThat(result[1], is(ReleaseLifecycleStatus.ACTIVE));
        assertThat(result[2], is(ReleaseLifecycleStatus.DEPRECATED));
        assertThat(result[3], is(ReleaseLifecycleStatus.OBSOLETE));
    }
}

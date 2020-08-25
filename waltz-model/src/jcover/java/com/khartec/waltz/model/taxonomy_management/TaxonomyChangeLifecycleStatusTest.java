package com.khartec.waltz.model.taxonomy_management;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.taxonomy_management.TaxonomyChangeLifecycleStatus
 *
 * @author Diffblue Cover
 */

class TaxonomyChangeLifecycleStatusTest {

    @Test
    void valuesReturnsDraftAbortedExecutedFailed() {
        TaxonomyChangeLifecycleStatus[] result =
             TaxonomyChangeLifecycleStatus.values();
        assertThat(result[0], is(TaxonomyChangeLifecycleStatus.DRAFT));
        assertThat(result[1], is(TaxonomyChangeLifecycleStatus.ABORTED));
        assertThat(result[2], is(TaxonomyChangeLifecycleStatus.EXECUTED));
        assertThat(result[3], is(TaxonomyChangeLifecycleStatus.FAILED));
    }
}

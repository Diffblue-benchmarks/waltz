package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.ApprovalStatus
 *
 * @author Diffblue Cover
 */

class ApprovalStatusTest {

    @Test
    void valuesReturnsPending_approvalApproved_allInternal_onlyRejected_allRequires_exception() {
        ApprovalStatus[] result = ApprovalStatus.values();
        assertThat(result[0], is(ApprovalStatus.PENDING_APPROVAL));
        assertThat(result[1], is(ApprovalStatus.APPROVED_ALL));
        assertThat(result[2], is(ApprovalStatus.INTERNAL_ONLY));
        assertThat(result[3], is(ApprovalStatus.REJECTED_ALL));
        assertThat(result[4], is(ApprovalStatus.REQUIRES_EXCEPTION));
    }
}

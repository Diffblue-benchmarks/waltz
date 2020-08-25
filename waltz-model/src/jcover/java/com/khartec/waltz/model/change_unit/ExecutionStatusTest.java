package com.khartec.waltz.model.change_unit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.change_unit.ExecutionStatus
 *
 * @author Diffblue Cover
 */

class ExecutionStatusTest {

    @Test
    void valuesReturnsPendingCompleteDiscarded() {
        ExecutionStatus[] result = ExecutionStatus.values();
        assertThat(result[0], is(ExecutionStatus.PENDING));
        assertThat(result[1], is(ExecutionStatus.COMPLETE));
        assertThat(result[2], is(ExecutionStatus.DISCARDED));
    }
}

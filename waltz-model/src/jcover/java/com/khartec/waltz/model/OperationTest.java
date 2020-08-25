package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.Operation
 *
 * @author Diffblue Cover
 */

class OperationTest {

    @Test
    void valuesReturnsAddAttestRemoveUpdateUnknown() {
        Operation[] result = Operation.values();
        assertThat(result[0], is(Operation.ADD));
        assertThat(result[1], is(Operation.ATTEST));
        assertThat(result[2], is(Operation.REMOVE));
        assertThat(result[3], is(Operation.UPDATE));
        assertThat(result[4], is(Operation.UNKNOWN));
    }
}

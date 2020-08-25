package com.khartec.waltz.model.change_unit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.change_unit.ChangeAction
 *
 * @author Diffblue Cover
 */

class ChangeActionTest {

    @Test
    void valuesReturnsActivateRetireModify() {
        ChangeAction[] result = ChangeAction.values();
        assertThat(result[0], is(ChangeAction.ACTIVATE));
        assertThat(result[1], is(ChangeAction.RETIRE));
        assertThat(result[2], is(ChangeAction.MODIFY));
    }
}

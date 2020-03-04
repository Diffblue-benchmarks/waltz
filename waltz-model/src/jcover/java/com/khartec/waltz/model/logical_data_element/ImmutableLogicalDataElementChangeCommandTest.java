package com.khartec.waltz.model.logical_data_element;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.Optional;

import org.junit.Test;

/**
 * Unit tests for com.khartec.waltz.model.logical_data_element.ImmutableLogicalDataElementChangeCommand
 *
 * @author Diffblue JCover
 */

public class ImmutableLogicalDataElementChangeCommandTest {

    @Test
    public void isPresent() {
        assertThat(ImmutableLogicalDataElementChangeCommand.copyOf(ImmutableLogicalDataElementChangeCommand.fromJson(new ImmutableLogicalDataElementChangeCommand.Json())).newLogicalDataElement().isPresent(), is(false));
        assertThat(ImmutableLogicalDataElementChangeCommand.fromJson(new ImmutableLogicalDataElementChangeCommand.Json()).newLogicalDataElement().isPresent(), is(false));
    }

    @Test
    public void withNewLogicalDataElement() {
        ImmutableLogicalDataElementChangeCommand immutableLogicalDataElementChangeCommand = ImmutableLogicalDataElementChangeCommand.fromJson(new ImmutableLogicalDataElementChangeCommand.Json());
        assertThat(immutableLogicalDataElementChangeCommand.withNewLogicalDataElement(Optional.<com.khartec.waltz.model.ImmutableEntityReference>empty()), sameInstance(immutableLogicalDataElementChangeCommand));
    }
}

package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for com.khartec.waltz.model.ImmutableUpdateDescriptionCommand
 *
 * @author Diffblue JCover
 */

public class ImmutableUpdateDescriptionCommandTest {

    @Test
    public void newDescription() {
        assertThat(ImmutableUpdateDescriptionCommand.copyOf(ImmutableUpdateDescriptionCommand.fromJson(new ImmutableUpdateDescriptionCommand.Json())).newDescription(), is(nullValue()));
        assertThat(ImmutableUpdateDescriptionCommand.fromJson(new ImmutableUpdateDescriptionCommand.Json()).newDescription(), is(nullValue()));
    }

    @Test
    public void withNewDescription() {
        // pojo ImmutableUpdateDescriptionCommand
    }

    @Test
    public void withNewDescriptionValueIsNull() {
        ImmutableUpdateDescriptionCommand immutableUpdateDescriptionCommand = ImmutableUpdateDescriptionCommand.fromJson(new ImmutableUpdateDescriptionCommand.Json());
        assertThat(immutableUpdateDescriptionCommand.withNewDescription(null), sameInstance(immutableUpdateDescriptionCommand));
    }
}

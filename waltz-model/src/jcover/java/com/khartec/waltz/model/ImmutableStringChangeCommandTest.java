package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.Optional;

import org.junit.Test;

/**
 * Unit tests for com.khartec.waltz.model.ImmutableStringChangeCommand
 *
 * @author Diffblue JCover
 */

public class ImmutableStringChangeCommandTest {

    @Test
    public void isPresent() {
        assertThat(ImmutableStringChangeCommand.copyOf(ImmutableStringChangeCommand.fromJson(new ImmutableStringChangeCommand.Json())).newStringVal().isPresent(), is(false));
        assertThat(ImmutableStringChangeCommand.fromJson(new ImmutableStringChangeCommand.Json()).newStringVal().isPresent(), is(false));
    }

    @Test
    public void withNewStringVal1() {
        ImmutableStringChangeCommand immutableStringChangeCommand = ImmutableStringChangeCommand.fromJson(new ImmutableStringChangeCommand.Json());
        assertThat(immutableStringChangeCommand.withNewStringVal(Optional.<String>empty()), sameInstance(immutableStringChangeCommand));
    }
}

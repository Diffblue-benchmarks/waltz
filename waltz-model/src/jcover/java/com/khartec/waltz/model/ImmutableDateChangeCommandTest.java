package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.Test;

/**
 * Unit tests for com.khartec.waltz.model.ImmutableDateChangeCommand
 *
 * @author Diffblue JCover
 */

public class ImmutableDateChangeCommandTest {

    @Test
    public void isPresent() {
        assertThat(ImmutableDateChangeCommand.copyOf(ImmutableDateChangeCommand.fromJson(new ImmutableDateChangeCommand.Json())).newDateVal().isPresent(), is(false));
        assertThat(ImmutableDateChangeCommand.fromJson(new ImmutableDateChangeCommand.Json()).newDateVal().isPresent(), is(false));
    }

    @Test
    public void withNewDateVal1() {
        // pojo ImmutableDateChangeCommand
    }

    @Test
    public void withNewDateVal2() {
        ImmutableDateChangeCommand immutableDateChangeCommand = ImmutableDateChangeCommand.fromJson(new ImmutableDateChangeCommand.Json());
        assertThat(immutableDateChangeCommand.withNewDateVal(Optional.<LocalDate>empty()), sameInstance(immutableDateChangeCommand));
    }
}

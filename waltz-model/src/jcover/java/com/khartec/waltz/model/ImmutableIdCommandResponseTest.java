package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.Optional;

import org.junit.Test;

/**
 * Unit tests for com.khartec.waltz.model.ImmutableIdCommandResponse
 *
 * @author Diffblue JCover
 */

public class ImmutableIdCommandResponseTest {

    @Test
    public void isPresent() {
        assertThat(ImmutableIdCommandResponse.copyOf(ImmutableIdCommandResponse.fromJson(new ImmutableIdCommandResponse.Json())).id().isPresent(), is(false));
        assertThat(ImmutableIdCommandResponse.fromJson(new ImmutableIdCommandResponse.Json()).id().isPresent(), is(false));
    }

    @Test
    public void withId1() {
        ImmutableIdCommandResponse immutableIdCommandResponse = ImmutableIdCommandResponse.fromJson(new ImmutableIdCommandResponse.Json());
        assertThat(immutableIdCommandResponse.withId(Optional.<Long>empty()), sameInstance(immutableIdCommandResponse));
    }
}

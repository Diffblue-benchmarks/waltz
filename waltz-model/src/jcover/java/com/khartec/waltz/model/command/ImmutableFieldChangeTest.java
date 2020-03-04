package com.khartec.waltz.model.command;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for com.khartec.waltz.model.command.ImmutableFieldChange
 *
 * @author Diffblue JCover
 */

public class ImmutableFieldChangeTest {

    @Test
    public void description() {
        assertThat(ImmutableFieldChange.copyOf(ImmutableFieldChange.fromJson(new ImmutableFieldChange.Json<String>())).description(), is(nullValue()));
        assertThat(ImmutableFieldChange.fromJson(new ImmutableFieldChange.Json<String>()).description(), is(nullValue()));
    }

    @Test
    public void newValReturnsNull() {
        assertThat(ImmutableFieldChange.fromJson(new ImmutableFieldChange.Json<String>()).newVal(), is(nullValue()));
    }

    @Test
    public void oldValReturnsNull() {
        assertThat(ImmutableFieldChange.fromJson(new ImmutableFieldChange.Json<String>()).oldVal(), is(nullValue()));
    }

    @Test
    public void withDescriptionValueIsNull() {
        ImmutableFieldChange<String> immutableFieldChange = ImmutableFieldChange.fromJson(new ImmutableFieldChange.Json<String>());
        assertThat(immutableFieldChange.withDescription(null), sameInstance(immutableFieldChange));
    }

    @Test
    public void withNewValValueIsNull() {
        ImmutableFieldChange<String> immutableFieldChange = ImmutableFieldChange.fromJson(new ImmutableFieldChange.Json<String>());
        assertThat(immutableFieldChange.withNewVal(null), sameInstance(immutableFieldChange));
    }

    @Test
    public void withOldValValueIsNull() {
        ImmutableFieldChange<String> immutableFieldChange = ImmutableFieldChange.fromJson(new ImmutableFieldChange.Json<String>());
        assertThat(immutableFieldChange.withOldVal(null), sameInstance(immutableFieldChange));
    }
}

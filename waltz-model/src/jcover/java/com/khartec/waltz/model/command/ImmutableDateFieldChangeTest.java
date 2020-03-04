package com.khartec.waltz.model.command;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.Date;

import org.junit.Test;

/**
 * Unit tests for com.khartec.waltz.model.command.ImmutableDateFieldChange
 *
 * @author Diffblue JCover
 */

public class ImmutableDateFieldChangeTest {

    @Test
    public void description() {
        assertThat(ImmutableDateFieldChange.copyOf(ImmutableDateFieldChange.fromJson(new ImmutableDateFieldChange.Json())).description(), is(nullValue()));
        assertThat(ImmutableDateFieldChange.fromJson(new ImmutableDateFieldChange.Json()).description(), is(nullValue()));
    }

    @Test
    public void newValReturnsNull() {
        assertThat(ImmutableDateFieldChange.fromJson(new ImmutableDateFieldChange.Json()).newVal(), is(nullValue()));
    }

    @Test
    public void oldValReturnsNull() {
        assertThat(ImmutableDateFieldChange.fromJson(new ImmutableDateFieldChange.Json()).oldVal(), is(nullValue()));
    }

    @Test
    public void withDescriptionValueIsNull() {
        ImmutableDateFieldChange immutableDateFieldChange = ImmutableDateFieldChange.fromJson(new ImmutableDateFieldChange.Json());
        assertThat(immutableDateFieldChange.withDescription(null), sameInstance(immutableDateFieldChange));
    }

    @Test
    public void withNewValValueIsNull() {
        ImmutableDateFieldChange immutableDateFieldChange = ImmutableDateFieldChange.fromJson(new ImmutableDateFieldChange.Json());
        assertThat(immutableDateFieldChange.withNewVal(null), sameInstance(immutableDateFieldChange));
    }

    @Test
    public void withOldValValueIsNull() {
        ImmutableDateFieldChange immutableDateFieldChange = ImmutableDateFieldChange.fromJson(new ImmutableDateFieldChange.Json());
        assertThat(immutableDateFieldChange.withOldVal(null), sameInstance(immutableDateFieldChange));
    }
}

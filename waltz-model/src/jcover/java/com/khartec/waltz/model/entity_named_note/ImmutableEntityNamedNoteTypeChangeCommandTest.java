package com.khartec.waltz.model.entity_named_note;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.khartec.waltz.model.EntityKind;

import java.util.HashSet;
import java.util.Optional;

import org.junit.Test;

/**
 * Unit tests for com.khartec.waltz.model.entity_named_note.ImmutableEntityNamedNoteTypeChangeCommand
 *
 * @author Diffblue JCover
 */

public class ImmutableEntityNamedNoteTypeChangeCommandTest {

    @Test
    public void copyOf() {
        EntityNamedNoteTypeChangeCommand instance = ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json());
        ImmutableEntityNamedNoteTypeChangeCommand result = ImmutableEntityNamedNoteTypeChangeCommand.copyOf(instance);
        assertThat(result.isReadOnly().isPresent(), is(false));
        assertThat(instance, instanceOf(ImmutableEntityNamedNoteTypeChangeCommand.class));
        assertThat(((ImmutableEntityNamedNoteTypeChangeCommand)instance), sameInstance(result));
    }

    @Test
    public void get() {
        assertThat(ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).withIsReadOnly(Optional.of(false)).isReadOnly().get(), is(false));
        assertThat(ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).withIsReadOnly(false).isReadOnly().get(), is(false));
    }

    @Test
    public void isPresent() {
        assertThat(ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).applicableEntityKinds().isPresent(), is(false));
        assertThat(ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).description().isPresent(), is(false));
        assertThat(ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).isReadOnly().isPresent(), is(false));
        assertThat(ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).name().isPresent(), is(false));
        assertThat(ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).position().isPresent(), is(false));
        assertThat(ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).withApplicableEntityKinds(new HashSet<EntityKind>()).isReadOnly().isPresent(), is(false));
        assertThat(ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).withDescription(Optional.of("foo")).isReadOnly().isPresent(), is(false));
        assertThat(ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).withDescription("int").isReadOnly().isPresent(), is(false));
        assertThat(ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).withName(Optional.of("foo")).isReadOnly().isPresent(), is(false));
        assertThat(ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).withName("int").isReadOnly().isPresent(), is(false));
        assertThat(ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).withPosition(Optional.of(1)).isReadOnly().isPresent(), is(false));
        assertThat(ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).withPosition(1).isReadOnly().isPresent(), is(false));
    }

    @Test
    public void withApplicableEntityKinds() {
        ImmutableEntityNamedNoteTypeChangeCommand immutableEntityNamedNoteTypeChangeCommand = ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json());
        assertThat(immutableEntityNamedNoteTypeChangeCommand.withApplicableEntityKinds(Optional.<HashSet<EntityKind>>empty()), sameInstance(immutableEntityNamedNoteTypeChangeCommand));
    }

    @Test
    public void withDescription() {
        ImmutableEntityNamedNoteTypeChangeCommand immutableEntityNamedNoteTypeChangeCommand = ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json());
        assertThat(immutableEntityNamedNoteTypeChangeCommand.withDescription(Optional.<String>empty()), sameInstance(immutableEntityNamedNoteTypeChangeCommand));
    }

    @Test
    public void withIsReadOnly() {
        ImmutableEntityNamedNoteTypeChangeCommand immutableEntityNamedNoteTypeChangeCommand = ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json());
        Optional<Boolean> optional = Optional.<Boolean>empty();
        assertThat(immutableEntityNamedNoteTypeChangeCommand.withIsReadOnly(optional), sameInstance(immutableEntityNamedNoteTypeChangeCommand));
        assertThat(immutableEntityNamedNoteTypeChangeCommand.isReadOnly(), sameInstance(optional));
    }

    @Test
    public void withName() {
        ImmutableEntityNamedNoteTypeChangeCommand immutableEntityNamedNoteTypeChangeCommand = ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json());
        assertThat(immutableEntityNamedNoteTypeChangeCommand.withName(Optional.<String>empty()), sameInstance(immutableEntityNamedNoteTypeChangeCommand));
    }

    @Test
    public void withPosition() {
        ImmutableEntityNamedNoteTypeChangeCommand immutableEntityNamedNoteTypeChangeCommand = ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json());
        assertThat(immutableEntityNamedNoteTypeChangeCommand.withPosition(Optional.<Integer>empty()), sameInstance(immutableEntityNamedNoteTypeChangeCommand));
    }
}

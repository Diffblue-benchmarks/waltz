package com.khartec.waltz.model.entity_named_note;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.EntityKind;
import java.util.HashSet;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityNamedNoteTypeChangeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void isReadOnlyTest2() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityNamedNoteTypeChangeCommand.Json()).isReadOnly();
  }

  @Test
  public void descriptionTest2() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityNamedNoteTypeChangeCommand.Json()).description();
  }

  @Test
  public void nameTest2() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityNamedNoteTypeChangeCommand.Json()).name();
  }

  @Test
  public void positionTest2() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityNamedNoteTypeChangeCommand.Json()).position();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntityNamedNoteTypeChangeCommand.Json actualJson = new ImmutableEntityNamedNoteTypeChangeCommand.Json();

    // Assert
    Optional<Boolean> optional = actualJson.isReadOnly;
    assertSame(actualJson.position, optional);
    assertSame(optional, actualJson.position);
    assertSame(optional, actualJson.description);
    assertSame(optional, actualJson.name);
    assertSame(optional, actualJson.applicableEntityKinds);
  }

  @Test
  public void applicableEntityKindsTest2() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityNamedNoteTypeChangeCommand.Json()).applicableEntityKinds();
  }

  @Test
  public void withNameTest() {
    // Arrange, Act and Assert
    assertEquals("EntityNamedNoteTypeChangeCommand{name=value}", ImmutableEntityNamedNoteTypeChangeCommand
        .fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).withName("value").toString());
  }

  @Test
  public void isReadOnlyTest() {
    // Arrange
    ImmutableEntityNamedNoteTypeChangeCommand.Json json = new ImmutableEntityNamedNoteTypeChangeCommand.Json();

    // Act and Assert
    assertSame(json.position, ImmutableEntityNamedNoteTypeChangeCommand.fromJson(json).isReadOnly());
  }

  @Test
  public void nameTest() {
    // Arrange
    ImmutableEntityNamedNoteTypeChangeCommand.Json json = new ImmutableEntityNamedNoteTypeChangeCommand.Json();

    // Act and Assert
    assertSame(json.position, ImmutableEntityNamedNoteTypeChangeCommand.fromJson(json).name());
  }

  @Test
  public void withPositionTest() {
    // Arrange, Act and Assert
    assertEquals("EntityNamedNoteTypeChangeCommand{position=42}", ImmutableEntityNamedNoteTypeChangeCommand
        .fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).withPosition(42).toString());
  }

  @Test
  public void withIsReadOnlyTest() {
    // Arrange, Act and Assert
    assertEquals("EntityNamedNoteTypeChangeCommand{isReadOnly=true}", ImmutableEntityNamedNoteTypeChangeCommand
        .fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).withIsReadOnly(true).toString());
  }

  @Test
  public void positionTest() {
    // Arrange
    ImmutableEntityNamedNoteTypeChangeCommand.Json json = new ImmutableEntityNamedNoteTypeChangeCommand.Json();

    // Act and Assert
    assertSame(json.position, ImmutableEntityNamedNoteTypeChangeCommand.fromJson(json).position());
  }

  @Test
  public void withDescriptionTest() {
    // Arrange, Act and Assert
    assertEquals("EntityNamedNoteTypeChangeCommand{description" + "=value}", ImmutableEntityNamedNoteTypeChangeCommand
        .fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).withDescription("value").toString());
  }

  @Test
  public void applicableEntityKindsTest() {
    // Arrange
    ImmutableEntityNamedNoteTypeChangeCommand.Json json = new ImmutableEntityNamedNoteTypeChangeCommand.Json();

    // Act and Assert
    assertSame(json.position, ImmutableEntityNamedNoteTypeChangeCommand.fromJson(json).applicableEntityKinds());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    assertEquals("EntityNamedNoteTypeChangeCommand{}", ImmutableEntityNamedNoteTypeChangeCommand
        .fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).toString());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(ImmutableEntityNamedNoteTypeChangeCommand.fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json())
        .equals("EntityNamedNoteTypeChangeCommand{"));
  }

  @Test
  public void descriptionTest() {
    // Arrange
    ImmutableEntityNamedNoteTypeChangeCommand.Json json = new ImmutableEntityNamedNoteTypeChangeCommand.Json();

    // Act and Assert
    assertSame(json.position, ImmutableEntityNamedNoteTypeChangeCommand.fromJson(json).description());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityNamedNoteTypeChangeCommand.copyOf(new ImmutableEntityNamedNoteTypeChangeCommand.Json());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(134152229, ImmutableEntityNamedNoteTypeChangeCommand
        .fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).hashCode());
  }

  @Test
  public void withApplicableEntityKindsTest() {
    // Arrange
    ImmutableEntityNamedNoteTypeChangeCommand fromJsonResult = ImmutableEntityNamedNoteTypeChangeCommand
        .fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json());
    HashSet<EntityKind> entityKindSet = new HashSet<EntityKind>();
    entityKindSet.add(EntityKind.ACTOR);

    // Act and Assert
    assertEquals("EntityNamedNoteTypeChangeCommand{applicableEntityKinds" + "=[ACTOR]}",
        fromJsonResult.withApplicableEntityKinds(entityKindSet).toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("EntityNamedNoteTypeChangeCommand{}", ImmutableEntityNamedNoteTypeChangeCommand
        .fromJson(new ImmutableEntityNamedNoteTypeChangeCommand.Json()).toString());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityNamedNoteTypeChangeCommand.Builder builderResult = ImmutableEntityNamedNoteTypeChangeCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityNamedNoteTypeChangeCommand.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    assertEquals("EntityNamedNoteTypeChangeCommand{}",
        ImmutableEntityNamedNoteTypeChangeCommand.builder().build().toString());
  }
}


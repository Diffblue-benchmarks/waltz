package com.khartec.waltz.model.actor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.command.EntityChangeCommand;
import com.khartec.waltz.model.command.FieldChange;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableActorChangeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableActorChangeCommand.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableActorChangeCommand.Json actualJson = new ImmutableActorChangeCommand.Json();

    // Assert
    Optional<FieldChange<Boolean>> optional = actualJson.isExternal;
    assertSame(actualJson.description, optional);
    assertSame(optional, actualJson.lastUpdate);
    assertSame(optional, actualJson.name);
    assertSame(optional, actualJson.description);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableActorChangeCommand.copyOf(new ImmutableActorChangeCommand.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableActorChangeCommand.Json()).description();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableActorChangeCommand.fromJson(new ImmutableActorChangeCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableActorChangeCommand.Builder builderResult = ImmutableActorChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableActorChangeCommand.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableActorChangeCommand.Builder builderResult = ImmutableActorChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityChangeCommand) new ImmutableActorChangeCommand.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableActorChangeCommand.Json()).id();
  }
  @Test
  public void isExternalTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableActorChangeCommand.Json()).isExternal();
  }
  @Test
  public void lastUpdateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableActorChangeCommand.Json()).lastUpdate();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableActorChangeCommand.Json()).name();
  }
  @Test
  public void setIdTest() {
    // Arrange
    ImmutableActorChangeCommand.Json json = new ImmutableActorChangeCommand.Json();

    // Act
    json.setId(123L);

    // Assert
    assertEquals(123L, json.id);
    assertTrue(json.idIsSet);
  }
}


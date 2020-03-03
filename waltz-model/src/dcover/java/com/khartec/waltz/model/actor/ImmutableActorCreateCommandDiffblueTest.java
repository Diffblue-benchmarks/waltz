package com.khartec.waltz.model.actor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableActorCreateCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableActorCreateCommand.copyOf(new ImmutableActorCreateCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableActorCreateCommand.fromJson(new ImmutableActorCreateCommand.Json());
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableActorCreateCommand.Json json = new ImmutableActorCreateCommand.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableActorCreateCommand.Json()).name();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableActorCreateCommand.Json()).description();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableActorCreateCommand.Json json = new ImmutableActorCreateCommand.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setIsExternalTest() {
    // Arrange
    ImmutableActorCreateCommand.Json json = new ImmutableActorCreateCommand.Json();

    // Act
    json.setIsExternal(true);

    // Assert
    assertTrue(json.isExternalIsSet);
    assertTrue(json.isExternal);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableActorCreateCommand.Json actualJson = new ImmutableActorCreateCommand.Json();

    // Assert
    assertFalse(actualJson.isExternalIsSet);
    assertFalse(actualJson.isExternal);
    assertNull(actualJson.name);
    assertNull(actualJson.description);
  }
  @Test
  public void isExternalTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableActorCreateCommand.Json()).isExternal();
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableActorCreateCommand.Builder builderResult = ImmutableActorCreateCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableActorCreateCommand.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableActorCreateCommand.Builder builderResult = ImmutableActorCreateCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableActor.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableActorCreateCommand.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableActorCreateCommand.Builder builderResult = ImmutableActorCreateCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableActor.Json());
  }
}


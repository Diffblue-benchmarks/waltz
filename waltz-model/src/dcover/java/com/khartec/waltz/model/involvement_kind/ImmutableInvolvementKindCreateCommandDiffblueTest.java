package com.khartec.waltz.model.involvement_kind;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableInvolvementKindCreateCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableInvolvementKindCreateCommand.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableInvolvementKindCreateCommand.Json actualJson = new ImmutableInvolvementKindCreateCommand.Json();

    // Assert
    assertNull(actualJson.name);
    assertNull(actualJson.description);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableInvolvementKindCreateCommand.copyOf(new ImmutableInvolvementKindCreateCommand.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableInvolvementKindCreateCommand.Json()).description();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableInvolvementKindCreateCommand.fromJson(new ImmutableInvolvementKindCreateCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableInvolvementKindCreateCommand.Builder builderResult = ImmutableInvolvementKindCreateCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableInvolvementKind.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableInvolvementKindCreateCommand.Builder builderResult = ImmutableInvolvementKindCreateCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableInvolvementKindCreateCommand.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableInvolvementKindCreateCommand.Builder builderResult = ImmutableInvolvementKindCreateCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableInvolvementKind.Json());
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableInvolvementKindCreateCommand.Json()).name();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableInvolvementKindCreateCommand.Json json = new ImmutableInvolvementKindCreateCommand.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableInvolvementKindCreateCommand.Json json = new ImmutableInvolvementKindCreateCommand.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
}


package com.khartec.waltz.model.involvement_kind;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.command.EntityChangeCommand;
import com.khartec.waltz.model.command.FieldChange;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableInvolvementKindChangeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableInvolvementKindChangeCommand.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableInvolvementKindChangeCommand.Json actualJson = new ImmutableInvolvementKindChangeCommand.Json();

    // Assert
    Optional<FieldChange<String>> optional = actualJson.description;
    assertSame(actualJson.lastUpdate, optional);
    assertSame(optional, actualJson.name);
    assertSame(optional, actualJson.lastUpdate);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableInvolvementKindChangeCommand.copyOf(new ImmutableInvolvementKindChangeCommand.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableInvolvementKindChangeCommand.Json()).description();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableInvolvementKindChangeCommand.fromJson(new ImmutableInvolvementKindChangeCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableInvolvementKindChangeCommand.Builder builderResult = ImmutableInvolvementKindChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityChangeCommand) new ImmutableInvolvementKindChangeCommand.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableInvolvementKindChangeCommand.Builder builderResult = ImmutableInvolvementKindChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableInvolvementKindChangeCommand.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableInvolvementKindChangeCommand.Json()).id();
  }
  @Test
  public void lastUpdateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableInvolvementKindChangeCommand.Json()).lastUpdate();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableInvolvementKindChangeCommand.Json()).name();
  }
  @Test
  public void setIdTest() {
    // Arrange
    ImmutableInvolvementKindChangeCommand.Json json = new ImmutableInvolvementKindChangeCommand.Json();

    // Act
    json.setId(123L);

    // Assert
    assertTrue(json.idIsSet);
    assertEquals(123L, json.id);
  }
}


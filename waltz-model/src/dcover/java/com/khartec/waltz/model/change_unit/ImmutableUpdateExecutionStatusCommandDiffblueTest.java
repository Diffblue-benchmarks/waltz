package com.khartec.waltz.model.change_unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.command.EntityChangeCommand;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableUpdateExecutionStatusCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUpdateExecutionStatusCommand.fromJson(new ImmutableUpdateExecutionStatusCommand.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableUpdateExecutionStatusCommand.copyOf(new ImmutableUpdateExecutionStatusCommand.Json());
  }
  @Test
  public void executionStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUpdateExecutionStatusCommand.Json()).executionStatus();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUpdateExecutionStatusCommand.Json()).id();
  }
  @Test
  public void setIdTest() {
    // Arrange
    ImmutableUpdateExecutionStatusCommand.Json json = new ImmutableUpdateExecutionStatusCommand.Json();

    // Act
    json.setId(123L);

    // Assert
    assertEquals(123L, json.id);
    assertTrue(json.idIsSet);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableUpdateExecutionStatusCommand.Json actualJson = new ImmutableUpdateExecutionStatusCommand.Json();

    // Assert
    assertEquals(0L, actualJson.id);
    assertNull(actualJson.executionStatus);
    assertFalse(actualJson.idIsSet);
  }
  @Test
  public void lastUpdateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUpdateExecutionStatusCommand.Json()).lastUpdate();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUpdateExecutionStatusCommand.builder().build();
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableUpdateExecutionStatusCommand.Builder builderResult = ImmutableUpdateExecutionStatusCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableUpdateExecutionStatusCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableUpdateExecutionStatusCommand.Builder builderResult = ImmutableUpdateExecutionStatusCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityChangeCommand) new ImmutableUpdateExecutionStatusCommand.Json());
  }
}


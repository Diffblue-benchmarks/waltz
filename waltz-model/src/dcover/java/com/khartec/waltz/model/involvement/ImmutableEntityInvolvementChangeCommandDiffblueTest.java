package com.khartec.waltz.model.involvement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.Operation;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityInvolvementChangeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityInvolvementChangeCommand.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntityInvolvementChangeCommand.Json actualJson = new ImmutableEntityInvolvementChangeCommand.Json();

    // Assert
    assertNull(actualJson.operation);
    assertNull(actualJson.personEntityRef);
    assertEquals(0, actualJson.involvementKindId);
    assertFalse(actualJson.involvementKindIdIsSet);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityInvolvementChangeCommand.copyOf(new ImmutableEntityInvolvementChangeCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityInvolvementChangeCommand.fromJson(new ImmutableEntityInvolvementChangeCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityInvolvementChangeCommand.Builder builderResult = ImmutableEntityInvolvementChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityInvolvementChangeCommand.Json());
  }
  @Test
  public void involvementKindIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityInvolvementChangeCommand.Json()).involvementKindId();
  }
  @Test
  public void operationTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityInvolvementChangeCommand.Json()).operation();
  }
  @Test
  public void personEntityRefTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityInvolvementChangeCommand.Json()).personEntityRef();
  }
  @Test
  public void setInvolvementKindIdTest() {
    // Arrange
    ImmutableEntityInvolvementChangeCommand.Json json = new ImmutableEntityInvolvementChangeCommand.Json();

    // Act
    json.setInvolvementKindId(123);

    // Assert
    assertEquals(123, json.involvementKindId);
    assertTrue(json.involvementKindIdIsSet);
  }
  @Test
  public void setOperationTest() {
    // Arrange
    ImmutableEntityInvolvementChangeCommand.Json json = new ImmutableEntityInvolvementChangeCommand.Json();

    // Act
    json.setOperation(Operation.ADD);

    // Assert
    assertEquals(Operation.ADD, json.operation);
  }
}


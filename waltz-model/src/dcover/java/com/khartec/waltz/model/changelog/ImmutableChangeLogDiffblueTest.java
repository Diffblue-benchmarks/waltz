package com.khartec.waltz.model.changelog;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.Operation;
import com.khartec.waltz.model.Severity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableChangeLogDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableChangeLog.builder().build();
  }
  @Test
  public void childKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeLog.Json()).childKind();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableChangeLog.Json actualJson = new ImmutableChangeLog.Json();

    // Assert
    assertNull(actualJson.parentReference);
    assertNull(actualJson.message);
    assertNull(actualJson.operation);
    assertNull(actualJson.userId);
    assertNull(actualJson.severity);
    assertNull(actualJson.createdAt);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableChangeLog.copyOf(new ImmutableChangeLog.Json());
  }
  @Test
  public void createdAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeLog.Json()).createdAt();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableChangeLog.fromJson(new ImmutableChangeLog.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableChangeLog.Builder builderResult = ImmutableChangeLog.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableChangeLog.Json());
  }
  @Test
  public void messageTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeLog.Json()).message();
  }
  @Test
  public void operationTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeLog.Json()).operation();
  }
  @Test
  public void parentReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeLog.Json()).parentReference();
  }
  @Test
  public void setMessageTest() {
    // Arrange
    ImmutableChangeLog.Json json = new ImmutableChangeLog.Json();

    // Act
    json.setMessage("message");

    // Assert
    assertEquals("message", json.message);
  }
  @Test
  public void setOperationTest() {
    // Arrange
    ImmutableChangeLog.Json json = new ImmutableChangeLog.Json();

    // Act
    json.setOperation(Operation.ADD);

    // Assert
    assertEquals(Operation.ADD, json.operation);
  }
  @Test
  public void setSeverityTest() {
    // Arrange
    ImmutableChangeLog.Json json = new ImmutableChangeLog.Json();

    // Act
    json.setSeverity(Severity.INFORMATION);

    // Assert
    assertEquals(Severity.INFORMATION, json.severity);
  }
  @Test
  public void setUserIdTest() {
    // Arrange
    ImmutableChangeLog.Json json = new ImmutableChangeLog.Json();

    // Act
    json.setUserId("123");

    // Assert
    assertEquals("123", json.userId);
  }
  @Test
  public void severityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeLog.Json()).severity();
  }
  @Test
  public void userIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeLog.Json()).userId();
  }
}


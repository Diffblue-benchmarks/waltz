package com.khartec.waltz.model.notification;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.EntityKind;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableNotificationSummaryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableNotificationSummary.copyOf(new ImmutableNotificationSummary.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableNotificationSummary.fromJson(new ImmutableNotificationSummary.Json());
  }
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableNotificationSummary.Json()).kind();
  }
  @Test
  public void countTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableNotificationSummary.Json()).count();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableNotificationSummary.Json actualJson = new ImmutableNotificationSummary.Json();

    // Assert
    assertNull(actualJson.kind);
    assertEquals(0, actualJson.count);
    assertFalse(actualJson.countIsSet);
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableNotificationSummary.Json json = new ImmutableNotificationSummary.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void setCountTest() {
    // Arrange
    ImmutableNotificationSummary.Json json = new ImmutableNotificationSummary.Json();

    // Act
    json.setCount(3);

    // Assert
    assertEquals(3, json.count);
    assertTrue(json.countIsSet);
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableNotificationSummary.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableNotificationSummary.Builder builderResult = ImmutableNotificationSummary.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableNotificationSummary.Json());
  }
}


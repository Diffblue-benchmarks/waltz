package com.khartec.waltz.model.usage_info;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableUsageInfoDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUsageInfo.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableUsageInfo.Json actualJson = new ImmutableUsageInfo.Json();

    // Assert
    assertNull(actualJson.kind);
    assertFalse(actualJson.isSelected);
    assertNull(actualJson.description);
    assertFalse(actualJson.isSelectedIsSet);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableUsageInfo.copyOf(new ImmutableUsageInfo.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUsageInfo.Json()).description();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUsageInfo.fromJson(new ImmutableUsageInfo.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableUsageInfo.Builder builderResult = ImmutableUsageInfo.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableUsageInfo.Json());
  }
  @Test
  public void isSelectedTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUsageInfo.Json()).isSelected();
  }
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUsageInfo.Json()).kind();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableUsageInfo.Json json = new ImmutableUsageInfo.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setIsSelectedTest() {
    // Arrange
    ImmutableUsageInfo.Json json = new ImmutableUsageInfo.Json();

    // Act
    json.setIsSelected(true);

    // Assert
    assertTrue(json.isSelected);
    assertTrue(json.isSelectedIsSet);
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableUsageInfo.Json json = new ImmutableUsageInfo.Json();

    // Act
    json.setKind(UsageKind.CONSUMER);

    // Assert
    assertEquals(UsageKind.CONSUMER, json.kind);
  }
}


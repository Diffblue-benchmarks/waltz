package com.khartec.waltz.model.checkpoint;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Quarter;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableCheckpointDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableCheckpoint.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableCheckpoint.Json actualJson = new ImmutableCheckpoint.Json();

    // Assert
    assertEquals(0, actualJson.year);
    assertNull(actualJson.quarter);
    assertNull(actualJson.description);
    assertFalse(actualJson.yearIsSet);
    assertNull(actualJson.name);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableCheckpoint.copyOf(new ImmutableCheckpoint.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCheckpoint.Json()).description();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableCheckpoint.fromJson(new ImmutableCheckpoint.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableCheckpoint.Builder builderResult = ImmutableCheckpoint.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableCheckpoint.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableCheckpoint.Builder builderResult = ImmutableCheckpoint.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableCheckpoint.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableCheckpoint.Builder builderResult = ImmutableCheckpoint.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableCheckpoint.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableCheckpoint.Builder builderResult = ImmutableCheckpoint.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableCheckpoint.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCheckpoint.Json()).id();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCheckpoint.Json()).name();
  }
  @Test
  public void quarterTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCheckpoint.Json()).quarter();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableCheckpoint.Json json = new ImmutableCheckpoint.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableCheckpoint.Json json = new ImmutableCheckpoint.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setQuarterTest() {
    // Arrange
    ImmutableCheckpoint.Json json = new ImmutableCheckpoint.Json();

    // Act
    json.setQuarter(Quarter.Q1);

    // Assert
    assertEquals(Quarter.Q1, json.quarter);
  }
  @Test
  public void setYearTest() {
    // Arrange
    ImmutableCheckpoint.Json json = new ImmutableCheckpoint.Json();

    // Act
    json.setYear(1);

    // Assert
    assertEquals(1, json.year);
    assertTrue(json.yearIsSet);
  }
  @Test
  public void yearTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCheckpoint.Json()).year();
  }
}


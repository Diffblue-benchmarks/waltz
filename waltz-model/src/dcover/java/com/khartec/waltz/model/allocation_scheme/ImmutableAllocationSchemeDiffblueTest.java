package com.khartec.waltz.model.allocation_scheme;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAllocationSchemeDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAllocationScheme.copyOf(new ImmutableAllocationScheme.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAllocationScheme.fromJson(new ImmutableAllocationScheme.Json());
  }

  @Test
  public void fromTest4() {
    // Arrange
    ImmutableAllocationScheme.Builder builderResult = ImmutableAllocationScheme.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableAllocationScheme.Json());
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableAllocationScheme.Builder builderResult = ImmutableAllocationScheme.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableAllocationScheme.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableAllocationScheme.Builder builderResult = ImmutableAllocationScheme.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableAllocationScheme.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableAllocationScheme.Builder builderResult = ImmutableAllocationScheme.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAllocationScheme.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAllocationScheme.builder().build();
  }

  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableAllocationScheme.Json json = new ImmutableAllocationScheme.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }

  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAllocationScheme.Json()).name();
  }

  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAllocationScheme.Json()).description();
  }

  @Test
  public void setNameTest() {
    // Arrange
    ImmutableAllocationScheme.Json json = new ImmutableAllocationScheme.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAllocationScheme.Json()).id();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAllocationScheme.Json actualJson = new ImmutableAllocationScheme.Json();

    // Assert
    assertFalse(actualJson.measurableCategoryIdIsSet);
    assertNull(actualJson.description);
    assertEquals(0L, actualJson.measurableCategoryId);
    assertNull(actualJson.name);
  }

  @Test
  public void measurableCategoryIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAllocationScheme.Json()).measurableCategoryId();
  }

  @Test
  public void setMeasurableCategoryIdTest() {
    // Arrange
    ImmutableAllocationScheme.Json json = new ImmutableAllocationScheme.Json();

    // Act
    json.setMeasurableCategoryId(123L);

    // Assert
    assertTrue(json.measurableCategoryIdIsSet);
    assertEquals(123L, json.measurableCategoryId);
  }
}


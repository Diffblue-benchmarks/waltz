package com.khartec.waltz.model.physical_specification;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalSpecificationAddCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void owningEntityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecificationAddCommand.Json()).owningEntity();
  }
  @Test
  public void formatTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecificationAddCommand.Json()).format();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutablePhysicalSpecificationAddCommand.Json json = new ImmutablePhysicalSpecificationAddCommand.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecificationAddCommand.Json()).name();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecificationAddCommand.Json()).description();
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecificationAddCommand.Json()).externalId();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutablePhysicalSpecificationAddCommand.Json json = new ImmutablePhysicalSpecificationAddCommand.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setFormatTest() {
    // Arrange
    ImmutablePhysicalSpecificationAddCommand.Json json = new ImmutablePhysicalSpecificationAddCommand.Json();

    // Act
    json.setFormat(DataFormatKind.BINARY);

    // Assert
    assertEquals(DataFormatKind.BINARY, json.format);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalSpecificationAddCommand.Json actualJson = new ImmutablePhysicalSpecificationAddCommand.Json();

    // Assert
    assertNull(actualJson.owningEntity);
    assertNull(actualJson.format);
    assertNull(actualJson.name);
    assertNull(actualJson.description);
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecificationAddCommand.fromJson(new ImmutablePhysicalSpecificationAddCommand.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalSpecificationAddCommand.copyOf(new ImmutablePhysicalSpecificationAddCommand.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutablePhysicalSpecificationAddCommand.Builder builderResult = ImmutablePhysicalSpecificationAddCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutablePhysicalSpecification.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutablePhysicalSpecificationAddCommand.Builder builderResult = ImmutablePhysicalSpecificationAddCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutablePhysicalSpecification.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutablePhysicalSpecificationAddCommand.Builder builderResult = ImmutablePhysicalSpecificationAddCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalSpecificationAddCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalSpecificationAddCommand.Builder builderResult = ImmutablePhysicalSpecificationAddCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutablePhysicalSpecification.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecificationAddCommand.builder().build();
  }
}


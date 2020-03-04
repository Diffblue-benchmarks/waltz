package com.khartec.waltz.model.physical_specification_data_type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalSpecificationDataTypeDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecificationDataType.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalSpecificationDataType.Json actualJson = new ImmutablePhysicalSpecificationDataType.Json();

    // Assert
    assertEquals(0L, actualJson.dataTypeId);
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.provenance);
    assertFalse(actualJson.dataTypeIdIsSet);
    assertNull(actualJson.lastUpdatedBy);
    assertEquals(0L, actualJson.specificationId);
    assertFalse(actualJson.specificationIdIsSet);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalSpecificationDataType.copyOf(new ImmutablePhysicalSpecificationDataType.Json());
  }
  @Test
  public void dataTypeIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecificationDataType.Json()).dataTypeId();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecificationDataType.fromJson(new ImmutablePhysicalSpecificationDataType.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalSpecificationDataType.Builder builderResult = ImmutablePhysicalSpecificationDataType.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalSpecificationDataType.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutablePhysicalSpecificationDataType.Builder builderResult = ImmutablePhysicalSpecificationDataType.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutablePhysicalSpecificationDataType.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutablePhysicalSpecificationDataType.Builder builderResult = ImmutablePhysicalSpecificationDataType.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutablePhysicalSpecificationDataType.Json());
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecificationDataType.Json()).lastUpdatedAt();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecificationDataType.Json()).lastUpdatedBy();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecificationDataType.Json()).provenance();
  }
  @Test
  public void setDataTypeIdTest() {
    // Arrange
    ImmutablePhysicalSpecificationDataType.Json json = new ImmutablePhysicalSpecificationDataType.Json();

    // Act
    json.setDataTypeId(123L);

    // Assert
    assertEquals(123L, json.dataTypeId);
    assertTrue(json.dataTypeIdIsSet);
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutablePhysicalSpecificationDataType.Json json = new ImmutablePhysicalSpecificationDataType.Json();

    // Act
    json.setLastUpdatedBy("lastUpdatedBy");

    // Assert
    assertEquals("lastUpdatedBy", json.lastUpdatedBy);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutablePhysicalSpecificationDataType.Json json = new ImmutablePhysicalSpecificationDataType.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }
  @Test
  public void setSpecificationIdTest() {
    // Arrange
    ImmutablePhysicalSpecificationDataType.Json json = new ImmutablePhysicalSpecificationDataType.Json();

    // Act
    json.setSpecificationId(123L);

    // Assert
    assertEquals(123L, json.specificationId);
    assertTrue(json.specificationIdIsSet);
  }
  @Test
  public void specificationIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecificationDataType.Json()).specificationId();
  }
}


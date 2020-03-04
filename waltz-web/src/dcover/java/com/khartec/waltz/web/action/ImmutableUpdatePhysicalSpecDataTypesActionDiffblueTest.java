package com.khartec.waltz.web.action;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import java.util.Set;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableUpdatePhysicalSpecDataTypesActionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void addedDataTypeIdsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUpdatePhysicalSpecDataTypesAction.Json()).addedDataTypeIds();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUpdatePhysicalSpecDataTypesAction.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableUpdatePhysicalSpecDataTypesAction.Json actualJson = new ImmutableUpdatePhysicalSpecDataTypesAction.Json();

    // Assert
    Set<Long> actualResultLongSet = actualJson.addedDataTypeIds;
    Set<Long> resultLongSet = actualJson.removedDataTypeIds;
    assertEquals(0, resultLongSet.size());
    assertSame(resultLongSet, actualResultLongSet);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableUpdatePhysicalSpecDataTypesAction.copyOf(new ImmutableUpdatePhysicalSpecDataTypesAction.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUpdatePhysicalSpecDataTypesAction.fromJson(new ImmutableUpdatePhysicalSpecDataTypesAction.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableUpdatePhysicalSpecDataTypesAction.Builder builderResult = ImmutableUpdatePhysicalSpecDataTypesAction
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableUpdatePhysicalSpecDataTypesAction.Json());
  }
  @Test
  public void removedDataTypeIdsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUpdatePhysicalSpecDataTypesAction.Json()).removedDataTypeIds();
  }
  @Test
  public void setAddedDataTypeIdsTest() {
    // Arrange
    ImmutableUpdatePhysicalSpecDataTypesAction.Json json = new ImmutableUpdatePhysicalSpecDataTypesAction.Json();
    HashSet<Long> resultLongSet = new HashSet<Long>();
    resultLongSet.add(Long.valueOf(1L));

    // Act
    json.setAddedDataTypeIds(resultLongSet);

    // Assert
    assertSame(resultLongSet, json.addedDataTypeIds);
  }
  @Test
  public void setRemovedDataTypeIdsTest() {
    // Arrange
    ImmutableUpdatePhysicalSpecDataTypesAction.Json json = new ImmutableUpdatePhysicalSpecDataTypesAction.Json();
    HashSet<Long> resultLongSet = new HashSet<Long>();
    resultLongSet.add(Long.valueOf(1L));

    // Act
    json.setRemovedDataTypeIds(resultLongSet);

    // Assert
    assertSame(resultLongSet, json.removedDataTypeIds);
  }
  @Test
  public void setSpecificationIdTest() {
    // Arrange
    ImmutableUpdatePhysicalSpecDataTypesAction.Json json = new ImmutableUpdatePhysicalSpecDataTypesAction.Json();

    // Act
    json.setSpecificationId(123L);

    // Assert
    assertTrue(json.specificationIdIsSet);
    assertEquals(123L, json.specificationId);
  }
  @Test
  public void specificationIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUpdatePhysicalSpecDataTypesAction.Json()).specificationId();
  }
}


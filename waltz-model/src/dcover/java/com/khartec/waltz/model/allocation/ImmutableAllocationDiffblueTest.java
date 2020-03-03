package com.khartec.waltz.model.allocation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAllocationDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAllocation.builder().build();
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableAllocation.Builder builderResult = ImmutableAllocation.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableAllocation.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableAllocation.Builder builderResult = ImmutableAllocation.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableAllocation.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableAllocation.Builder builderResult = ImmutableAllocation.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAllocation.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAllocation.Builder builderResult = ImmutableAllocation.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableAllocation.Json());
  }
  @Test
  public void percentageTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAllocation.Json()).percentage();
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAllocation.Json()).entityReference();
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableAllocation.Json json = new ImmutableAllocation.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void setSchemeIdTest() {
    // Arrange
    ImmutableAllocation.Json json = new ImmutableAllocation.Json();

    // Act
    json.setSchemeId(123L);

    // Assert
    assertEquals(123L, json.schemeId);
    assertTrue(json.schemeIdIsSet);
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAllocation.Json()).lastUpdatedBy();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAllocation.Json()).provenance();
  }
  @Test
  public void setPercentageTest() {
    // Arrange
    ImmutableAllocation.Json json = new ImmutableAllocation.Json();

    // Act
    json.setPercentage(1);

    // Assert
    assertTrue(json.percentageIsSet);
    assertEquals(1, json.percentage);
  }
  @Test
  public void schemeIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAllocation.Json()).schemeId();
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAllocation.Json()).externalId();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAllocation.Json()).lastUpdatedAt();
  }
  @Test
  public void setMeasurableIdTest() {
    // Arrange
    ImmutableAllocation.Json json = new ImmutableAllocation.Json();

    // Act
    json.setMeasurableId(123L);

    // Assert
    assertTrue(json.measurableIdIsSet);
    assertEquals(123L, json.measurableId);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAllocation.Json actualJson = new ImmutableAllocation.Json();

    // Assert
    assertNull(actualJson.lastUpdatedBy);
    assertFalse(actualJson.measurableIdIsSet);
    assertEquals(0L, actualJson.schemeId);
    assertFalse(actualJson.schemeIdIsSet);
    assertNull(actualJson.entityReference);
    assertEquals(0L, actualJson.measurableId);
    assertFalse(actualJson.percentageIsSet);
    assertEquals(0, actualJson.percentage);
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.provenance);
  }
  @Test
  public void measurableIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAllocation.Json()).measurableId();
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableAllocation.Json json = new ImmutableAllocation.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAllocation.fromJson(new ImmutableAllocation.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAllocation.copyOf(new ImmutableAllocation.Json());
  }
}


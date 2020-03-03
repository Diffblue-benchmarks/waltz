package com.khartec.waltz.model.entity_enum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityEnumValueDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableEntityEnumValue.Builder builderResult = ImmutableEntityEnumValue.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableEntityEnumValue.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableEntityEnumValue.Builder builderResult = ImmutableEntityEnumValue.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableEntityEnumValue.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityEnumValue.Builder builderResult = ImmutableEntityEnumValue.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityEnumValue.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityEnumValue.builder().build();
  }
  @Test
  public void setDefinitionIdTest() {
    // Arrange
    ImmutableEntityEnumValue.Json json = new ImmutableEntityEnumValue.Json();

    // Act
    json.setDefinitionId(123L);

    // Assert
    assertEquals(123L, json.definitionId);
    assertTrue(json.definitionIdIsSet);
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityEnumValue.Json()).entityReference();
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableEntityEnumValue.Json json = new ImmutableEntityEnumValue.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityEnumValue.Json()).lastUpdatedBy();
  }
  @Test
  public void enumValueKeyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityEnumValue.Json()).enumValueKey();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityEnumValue.Json()).provenance();
  }
  @Test
  public void definitionIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityEnumValue.Json()).definitionId();
  }
  @Test
  public void setEnumValueKeyTest() {
    // Arrange
    ImmutableEntityEnumValue.Json json = new ImmutableEntityEnumValue.Json();

    // Act
    json.setEnumValueKey("foo");

    // Assert
    assertEquals("foo", json.enumValueKey);
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityEnumValue.Json()).lastUpdatedAt();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntityEnumValue.Json actualJson = new ImmutableEntityEnumValue.Json();

    // Assert
    assertEquals(0L, actualJson.definitionId);
    assertFalse(actualJson.definitionIdIsSet);
    assertNull(actualJson.provenance);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.entityReference);
    assertNull(actualJson.enumValueKey);
    assertNull(actualJson.lastUpdatedAt);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableEntityEnumValue.Json json = new ImmutableEntityEnumValue.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityEnumValue.copyOf(new ImmutableEntityEnumValue.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityEnumValue.fromJson(new ImmutableEntityEnumValue.Json());
  }
}


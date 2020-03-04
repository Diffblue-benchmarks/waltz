package com.khartec.waltz.model.involvement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableInvolvementDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableInvolvement.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableInvolvement.Json actualJson = new ImmutableInvolvement.Json();

    // Assert
    assertEquals(0L, actualJson.kindId);
    assertFalse(actualJson.kindIdIsSet);
    assertNull(actualJson.provenance);
    assertFalse(actualJson.isReadOnly);
    assertNull(actualJson.entityReference);
    assertFalse(actualJson.isReadOnlyIsSet);
    assertNull(actualJson.employeeId);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableInvolvement.copyOf(new ImmutableInvolvement.Json());
  }
  @Test
  public void employeeIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableInvolvement.Json()).employeeId();
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableInvolvement.Json()).entityReference();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableInvolvement.fromJson(new ImmutableInvolvement.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableInvolvement.Builder builderResult = ImmutableInvolvement.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableInvolvement.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableInvolvement.Builder builderResult = ImmutableInvolvement.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableInvolvement.Json());
  }
  @Test
  public void isReadOnlyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableInvolvement.Json()).isReadOnly();
  }
  @Test
  public void kindIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableInvolvement.Json()).kindId();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableInvolvement.Json()).provenance();
  }
  @Test
  public void setEmployeeIdTest() {
    // Arrange
    ImmutableInvolvement.Json json = new ImmutableInvolvement.Json();

    // Act
    json.setEmployeeId("123");

    // Assert
    assertEquals("123", json.employeeId);
  }
  @Test
  public void setIsReadOnlyTest() {
    // Arrange
    ImmutableInvolvement.Json json = new ImmutableInvolvement.Json();

    // Act
    json.setIsReadOnly(true);

    // Assert
    assertTrue(json.isReadOnly);
    assertTrue(json.isReadOnlyIsSet);
  }
  @Test
  public void setKindIdTest() {
    // Arrange
    ImmutableInvolvement.Json json = new ImmutableInvolvement.Json();

    // Act
    json.setKindId(123L);

    // Assert
    assertEquals(123L, json.kindId);
    assertTrue(json.kindIdIsSet);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableInvolvement.Json json = new ImmutableInvolvement.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }
}


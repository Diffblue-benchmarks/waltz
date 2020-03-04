package com.khartec.waltz.model.data_type_usage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableDataTypeUsageDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableDataTypeUsage.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableDataTypeUsage.Json actualJson = new ImmutableDataTypeUsage.Json();

    // Assert
    assertNull(actualJson.dataTypeId);
    assertNull(actualJson.usage);
    assertNull(actualJson.entityReference);
    assertNull(actualJson.provenance);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableDataTypeUsage.copyOf(new ImmutableDataTypeUsage.Json());
  }

  @Test
  public void dataTypeIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDataTypeUsage.Json()).dataTypeId();
  }

  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDataTypeUsage.Json()).entityReference();
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableDataTypeUsage.fromJson(new ImmutableDataTypeUsage.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableDataTypeUsage.Builder builderResult = ImmutableDataTypeUsage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableDataTypeUsage.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableDataTypeUsage.Builder builderResult = ImmutableDataTypeUsage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableDataTypeUsage.Json());
  }

  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDataTypeUsage.Json()).provenance();
  }

  @Test
  public void setDataTypeIdTest() {
    // Arrange
    ImmutableDataTypeUsage.Json json = new ImmutableDataTypeUsage.Json();

    // Act
    json.setDataTypeId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.dataTypeId);
  }

  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableDataTypeUsage.Json json = new ImmutableDataTypeUsage.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }

  @Test
  public void usageTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDataTypeUsage.Json()).usage();
  }
}


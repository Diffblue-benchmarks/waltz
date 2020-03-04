package com.khartec.waltz.model.authoritativesource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.rating.AuthoritativenessRating;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAuthoritativeSourceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void appOrgUnitReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeSource.Json()).appOrgUnitReference();
  }
  @Test
  public void applicationReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeSource.Json()).applicationReference();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAuthoritativeSource.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAuthoritativeSource.Json actualJson = new ImmutableAuthoritativeSource.Json();

    // Assert
    assertNull(actualJson.appOrgUnitReference);
    assertNull(actualJson.applicationReference);
    assertNull(actualJson.dataType);
    assertNull(actualJson.provenance);
    assertNull(actualJson.description);
    assertNull(actualJson.rating);
    assertNull(actualJson.parentReference);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAuthoritativeSource.copyOf(new ImmutableAuthoritativeSource.Json());
  }
  @Test
  public void dataTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeSource.Json()).dataType();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeSource.Json()).description();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAuthoritativeSource.fromJson(new ImmutableAuthoritativeSource.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAuthoritativeSource.Builder builderResult = ImmutableAuthoritativeSource.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableAuthoritativeSource.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableAuthoritativeSource.Builder builderResult = ImmutableAuthoritativeSource.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableAuthoritativeSource.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableAuthoritativeSource.Builder builderResult = ImmutableAuthoritativeSource.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableAuthoritativeSource.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableAuthoritativeSource.Builder builderResult = ImmutableAuthoritativeSource.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAuthoritativeSource.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeSource.Json()).id();
  }
  @Test
  public void parentReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeSource.Json()).parentReference();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeSource.Json()).provenance();
  }
  @Test
  public void ratingTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeSource.Json()).rating();
  }
  @Test
  public void setDataTypeTest() {
    // Arrange
    ImmutableAuthoritativeSource.Json json = new ImmutableAuthoritativeSource.Json();

    // Act
    json.setDataType("dataType");

    // Assert
    assertEquals("dataType", json.dataType);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableAuthoritativeSource.Json json = new ImmutableAuthoritativeSource.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableAuthoritativeSource.Json json = new ImmutableAuthoritativeSource.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }
  @Test
  public void setRatingTest() {
    // Arrange
    ImmutableAuthoritativeSource.Json json = new ImmutableAuthoritativeSource.Json();

    // Act
    json.setRating(AuthoritativenessRating.PRIMARY);

    // Assert
    assertEquals(AuthoritativenessRating.PRIMARY, json.rating);
  }
}


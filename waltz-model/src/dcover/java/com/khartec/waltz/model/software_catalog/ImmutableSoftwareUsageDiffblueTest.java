package com.khartec.waltz.model.software_catalog;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSoftwareUsageDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSoftwareUsage.Builder builderResult = ImmutableSoftwareUsage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSoftwarePackage.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSoftwareUsage.Builder builderResult = ImmutableSoftwareUsage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSoftwareUsage.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSoftwareUsage.builder().build();
  }
  @Test
  public void setApplicationIdTest() {
    // Arrange
    ImmutableSoftwareUsage.Json json = new ImmutableSoftwareUsage.Json();

    // Act
    json.setApplicationId(123L);

    // Assert
    assertTrue(json.applicationIdIsSet);
    assertEquals(123L, json.applicationId);
  }
  @Test
  public void setLicenceIdTest() {
    // Arrange
    ImmutableSoftwareUsage.Json json = new ImmutableSoftwareUsage.Json();

    // Act
    json.setLicenceId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.licenceId);
  }
  @Test
  public void applicationIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwareUsage.Json()).applicationId();
  }
  @Test
  public void softwareVersionIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwareUsage.Json()).softwareVersionId();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwareUsage.Json()).provenance();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSoftwareUsage.Json actualJson = new ImmutableSoftwareUsage.Json();

    // Assert
    assertEquals(0L, actualJson.softwareVersionId);
    assertNull(actualJson.licenceId);
    assertEquals(0L, actualJson.softwarePackageId);
    assertFalse(actualJson.softwarePackageIdIsSet);
    assertNull(actualJson.provenance);
    assertFalse(actualJson.applicationIdIsSet);
    assertEquals(0L, actualJson.applicationId);
    assertFalse(actualJson.softwareVersionIdIsSet);
  }
  @Test
  public void setSoftwarePackageIdTest() {
    // Arrange
    ImmutableSoftwareUsage.Json json = new ImmutableSoftwareUsage.Json();

    // Act
    json.setSoftwarePackageId(123L);

    // Assert
    assertEquals(123L, json.softwarePackageId);
    assertTrue(json.softwarePackageIdIsSet);
  }
  @Test
  public void setSoftwareVersionIdTest() {
    // Arrange
    ImmutableSoftwareUsage.Json json = new ImmutableSoftwareUsage.Json();

    // Act
    json.setSoftwareVersionId(123L);

    // Assert
    assertEquals(123L, json.softwareVersionId);
    assertTrue(json.softwareVersionIdIsSet);
  }
  @Test
  public void licenceIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwareUsage.Json()).licenceId();
  }
  @Test
  public void softwarePackageIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwareUsage.Json()).softwarePackageId();
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableSoftwareUsage.Json json = new ImmutableSoftwareUsage.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSoftwareUsage.fromJson(new ImmutableSoftwareUsage.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSoftwareUsage.copyOf(new ImmutableSoftwareUsage.Json());
  }
}


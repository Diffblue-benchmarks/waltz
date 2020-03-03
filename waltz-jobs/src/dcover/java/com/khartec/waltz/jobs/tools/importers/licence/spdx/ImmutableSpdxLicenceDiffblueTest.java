package com.khartec.waltz.jobs.tools.importers.licence.spdx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSpdxLicenceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSpdxLicence.Builder builderResult = ImmutableSpdxLicence.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSpdxLicence.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSpdxLicence.builder().build();
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSpdxLicence.copyOf(new ImmutableSpdxLicence.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSpdxLicence.fromJson(new ImmutableSpdxLicence.Json());
  }
  @Test
  public void setLicenseTextTest() {
    // Arrange
    ImmutableSpdxLicence.Json json = new ImmutableSpdxLicence.Json();

    // Act
    json.setLicenseText("foo");

    // Assert
    assertEquals("foo", json.licenseText);
  }
  @Test
  public void licenseIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSpdxLicence.Json()).licenseId();
  }
  @Test
  public void setLicenseIdTest() {
    // Arrange
    ImmutableSpdxLicence.Json json = new ImmutableSpdxLicence.Json();

    // Act
    json.setLicenseId("123");

    // Assert
    assertEquals("123", json.licenseId);
  }
  @Test
  public void setIsDeprecatedLicenseIdTest() {
    // Arrange
    ImmutableSpdxLicence.Json json = new ImmutableSpdxLicence.Json();

    // Act
    json.setIsDeprecatedLicenseId(true);

    // Assert
    assertTrue(json.isDeprecatedLicenseIdIsSet);
    assertTrue(json.isDeprecatedLicenseId);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSpdxLicence.Json()).name();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableSpdxLicence.Json json = new ImmutableSpdxLicence.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSpdxLicence.Json actualJson = new ImmutableSpdxLicence.Json();

    // Assert
    assertFalse(actualJson.isDeprecatedLicenseIdIsSet);
    assertNull(actualJson.seeAlso);
    assertNull(actualJson.licenseId);
    assertNull(actualJson.name);
    assertNull(actualJson.licenseText);
    assertFalse(actualJson.isDeprecatedLicenseId);
  }
  @Test
  public void licenseTextTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSpdxLicence.Json()).licenseText();
  }
  @Test
  public void setSeeAlsoTest() {
    // Arrange
    String[] stringArray = new String[]{"foo", "foo", "foo"};
    ImmutableSpdxLicence.Json json = new ImmutableSpdxLicence.Json();

    // Act
    json.setSeeAlso(stringArray);

    // Assert
    assertSame(stringArray, json.seeAlso);
  }
  @Test
  public void isDeprecatedLicenseIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSpdxLicence.Json()).isDeprecatedLicenseId();
  }
  @Test
  public void seeAlsoTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSpdxLicence.Json()).seeAlso();
  }
}


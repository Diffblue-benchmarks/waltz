package com.khartec.waltz.jobs.tools.importers.licence.finos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableLicenceComplianceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLicenceCompliance.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableLicenceCompliance.Json actualJson = new ImmutableLicenceCompliance.Json();

    // Assert
    assertNull(actualJson.name);
    assertNull(actualJson.terms);
    assertNull(actualJson.notes);
    assertNull(actualJson.licenseId);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableLicenceCompliance.copyOf(new ImmutableLicenceCompliance.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLicenceCompliance.fromJson(new ImmutableLicenceCompliance.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableLicenceCompliance.Builder builderResult = ImmutableLicenceCompliance.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableLicenceCompliance.Json());
  }
  @Test
  public void licenseIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLicenceCompliance.Json()).licenseId();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLicenceCompliance.Json()).name();
  }
  @Test
  public void notesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLicenceCompliance.Json()).notes();
  }
  @Test
  public void setLicenseIdTest() {
    // Arrange
    String[] stringArray = new String[]{"foo", "foo", "foo"};
    ImmutableLicenceCompliance.Json json = new ImmutableLicenceCompliance.Json();

    // Act
    json.setLicenseId(stringArray);

    // Assert
    assertSame(stringArray, json.licenseId);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableLicenceCompliance.Json json = new ImmutableLicenceCompliance.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setNotesTest() {
    // Arrange
    ImmutableLicenceCompliance.Json json = new ImmutableLicenceCompliance.Json();

    // Act
    json.setNotes("notes");

    // Assert
    assertEquals("notes", json.notes);
  }
  @Test
  public void setTermsTest() {
    // Arrange
    ImmutableLicenceCompliance.Json json = new ImmutableLicenceCompliance.Json();
    ComplianceTerm[] complianceTermArray = new ComplianceTerm[]{new ImmutableComplianceTerm.Json(),
        new ImmutableComplianceTerm.Json(), new ImmutableComplianceTerm.Json()};

    // Act
    json.setTerms(complianceTermArray);

    // Assert
    assertSame(complianceTermArray, json.terms);
  }
  @Test
  public void termsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLicenceCompliance.Json()).terms();
  }
}


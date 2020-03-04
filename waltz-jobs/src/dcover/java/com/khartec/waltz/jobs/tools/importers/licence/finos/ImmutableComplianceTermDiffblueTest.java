package com.khartec.waltz.jobs.tools.importers.licence.finos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableComplianceTermDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableComplianceTerm.builder().build();
  }
  @Test
  public void complianceNotesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableComplianceTerm.Json()).complianceNotes();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableComplianceTerm.Json actualJson = new ImmutableComplianceTerm.Json();

    // Assert
    assertNull(actualJson.useCases);
    assertNull(actualJson.type);
    assertNull(actualJson.description);
    assertNull(actualJson.complianceNotes);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableComplianceTerm.copyOf(new ImmutableComplianceTerm.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableComplianceTerm.Json()).description();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableComplianceTerm.fromJson(new ImmutableComplianceTerm.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableComplianceTerm.Builder builderResult = ImmutableComplianceTerm.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableComplianceTerm.Json());
  }
  @Test
  public void setComplianceNotesTest() {
    // Arrange
    ImmutableComplianceTerm.Json json = new ImmutableComplianceTerm.Json();

    // Act
    json.setComplianceNotes("complianceNotes");

    // Assert
    assertEquals("complianceNotes", json.complianceNotes);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableComplianceTerm.Json json = new ImmutableComplianceTerm.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setTypeTest() {
    // Arrange
    ImmutableComplianceTerm.Json json = new ImmutableComplianceTerm.Json();

    // Act
    json.setType(ComplianceType.CONDITION);

    // Assert
    assertEquals(ComplianceType.CONDITION, json.type);
  }
  @Test
  public void setUseCasesTest() {
    // Arrange
    ComplianceUseCase[] complianceUseCaseArray = new ComplianceUseCase[]{ComplianceUseCase.UB, ComplianceUseCase.UB,
        ComplianceUseCase.UB};
    ImmutableComplianceTerm.Json json = new ImmutableComplianceTerm.Json();

    // Act
    json.setUseCases(complianceUseCaseArray);

    // Assert
    assertSame(complianceUseCaseArray, json.useCases);
  }
  @Test
  public void typeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableComplianceTerm.Json()).type();
  }
  @Test
  public void useCasesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableComplianceTerm.Json()).useCases();
  }
}


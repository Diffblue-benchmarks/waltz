package com.khartec.waltz.model.assessment_definition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAssessmentDefinitionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAssessmentDefinition.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAssessmentDefinition.Json actualJson = new ImmutableAssessmentDefinition.Json();

    // Assert
    Optional<String> optional = actualJson.externalId;
    assertSame(actualJson.permittedRole, optional);
    assertSame(optional, actualJson.id);
    assertSame(optional, actualJson.permittedRole);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAssessmentDefinition.copyOf(new ImmutableAssessmentDefinition.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentDefinition.Json()).description();
  }
  @Test
  public void entityKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentDefinition.Json()).entityKind();
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentDefinition.Json()).externalId();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAssessmentDefinition.fromJson(new ImmutableAssessmentDefinition.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAssessmentDefinition.Builder builderResult = ImmutableAssessmentDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableAssessmentDefinition.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableAssessmentDefinition.Builder builderResult = ImmutableAssessmentDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAssessmentDefinition.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableAssessmentDefinition.Builder builderResult = ImmutableAssessmentDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableAssessmentDefinition.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableAssessmentDefinition.Builder builderResult = ImmutableAssessmentDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableAssessmentDefinition.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableAssessmentDefinition.Builder builderResult = ImmutableAssessmentDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableAssessmentDefinition.Json());
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutableAssessmentDefinition.Builder builderResult = ImmutableAssessmentDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableAssessmentDefinition.Json());
  }
  @Test
  public void fromTest7() {
    // Arrange
    ImmutableAssessmentDefinition.Builder builderResult = ImmutableAssessmentDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableAssessmentDefinition.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentDefinition.Json()).id();
  }
  @Test
  public void isReadOnlyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentDefinition.Json()).isReadOnly();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentDefinition.Json()).lastUpdatedAt();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentDefinition.Json()).lastUpdatedBy();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentDefinition.Json()).name();
  }
  @Test
  public void permittedRoleTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentDefinition.Json()).permittedRole();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentDefinition.Json()).provenance();
  }
  @Test
  public void ratingSchemeIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentDefinition.Json()).ratingSchemeId();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableAssessmentDefinition.Json json = new ImmutableAssessmentDefinition.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setEntityKindTest() {
    // Arrange
    ImmutableAssessmentDefinition.Json json = new ImmutableAssessmentDefinition.Json();

    // Act
    json.setEntityKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.entityKind);
  }
  @Test
  public void setIsReadOnlyTest() {
    // Arrange
    ImmutableAssessmentDefinition.Json json = new ImmutableAssessmentDefinition.Json();

    // Act
    json.setIsReadOnly(true);

    // Assert
    assertTrue(json.isReadOnlyIsSet);
    assertTrue(json.isReadOnly);
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableAssessmentDefinition.Json json = new ImmutableAssessmentDefinition.Json();

    // Act
    json.setLastUpdatedBy("lastUpdatedBy");

    // Assert
    assertEquals("lastUpdatedBy", json.lastUpdatedBy);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableAssessmentDefinition.Json json = new ImmutableAssessmentDefinition.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableAssessmentDefinition.Json json = new ImmutableAssessmentDefinition.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }
  @Test
  public void setRatingSchemeIdTest() {
    // Arrange
    ImmutableAssessmentDefinition.Json json = new ImmutableAssessmentDefinition.Json();

    // Act
    json.setRatingSchemeId(123L);

    // Assert
    assertTrue(json.ratingSchemeIdIsSet);
    assertEquals(123L, json.ratingSchemeId);
  }
  @Test
  public void setVisibilityTest() {
    // Arrange
    ImmutableAssessmentDefinition.Json json = new ImmutableAssessmentDefinition.Json();

    // Act
    json.setVisibility(AssessmentVisibility.PRIMARY);

    // Assert
    assertEquals(AssessmentVisibility.PRIMARY, json.visibility);
  }
  @Test
  public void visibilityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentDefinition.Json()).visibility();
  }
}


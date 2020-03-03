package com.khartec.waltz.model.taxonomy_management;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.Severity;
import java.util.HashSet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableTaxonomyChangeImpactDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void setSeverityTest() {
    // Arrange
    ImmutableTaxonomyChangeImpact.Json json = new ImmutableTaxonomyChangeImpact.Json();

    // Act
    json.setSeverity(Severity.INFORMATION);

    // Assert
    assertEquals(Severity.INFORMATION, json.severity);
  }
  @Test
  public void severityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTaxonomyChangeImpact.Json()).severity();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableTaxonomyChangeImpact.Json json = new ImmutableTaxonomyChangeImpact.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTaxonomyChangeImpact.Json()).description();
  }
  @Test
  public void setImpactedReferencesTest() {
    // Arrange
    ImmutableTaxonomyChangeImpact.Json json = new ImmutableTaxonomyChangeImpact.Json();
    HashSet<EntityReference> entityReferenceSet = new HashSet<EntityReference>();
    entityReferenceSet.add(null);

    // Act
    json.setImpactedReferences(entityReferenceSet);

    // Assert
    assertSame(entityReferenceSet, json.impactedReferences);
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableTaxonomyChangeImpact.Json()).impactedReferences.size());
  }
  @Test
  public void impactedReferencesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTaxonomyChangeImpact.Json()).impactedReferences();
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableTaxonomyChangeImpact.Builder builderResult = ImmutableTaxonomyChangeImpact.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableTaxonomyChangeImpact.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableTaxonomyChangeImpact.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableTaxonomyChangeImpact.Builder builderResult = ImmutableTaxonomyChangeImpact.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableTaxonomyChangeImpact.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableTaxonomyChangeImpact.fromJson(new ImmutableTaxonomyChangeImpact.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableTaxonomyChangeImpact.copyOf(new ImmutableTaxonomyChangeImpact.Json());
  }
}


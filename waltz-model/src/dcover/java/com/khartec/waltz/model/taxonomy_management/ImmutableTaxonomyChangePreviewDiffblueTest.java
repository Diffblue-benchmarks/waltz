package com.khartec.waltz.model.taxonomy_management;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableTaxonomyChangePreviewDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableTaxonomyChangePreview.builder().build();
  }

  @Test
  public void commandTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTaxonomyChangePreview.Json()).command();
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableTaxonomyChangePreview.Json()).impacts.size());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableTaxonomyChangePreview.copyOf(new ImmutableTaxonomyChangePreview.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableTaxonomyChangePreview.fromJson(new ImmutableTaxonomyChangePreview.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableTaxonomyChangePreview.Builder builderResult = ImmutableTaxonomyChangePreview.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableTaxonomyChangePreview.Json());
  }

  @Test
  public void impactsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTaxonomyChangePreview.Json()).impacts();
  }

  @Test
  public void setCommandTest() {
    // Arrange
    ImmutableTaxonomyChangePreview.Json json = new ImmutableTaxonomyChangePreview.Json();
    ImmutableTaxonomyChangeCommand.Json json1 = new ImmutableTaxonomyChangeCommand.Json();

    // Act
    json.setCommand(json1);

    // Assert
    assertSame(json1, json.command);
  }

  @Test
  public void setImpactsTest() {
    // Arrange
    ImmutableTaxonomyChangePreview.Json json = new ImmutableTaxonomyChangePreview.Json();
    ArrayList<TaxonomyChangeImpact> taxonomyChangeImpactList = new ArrayList<TaxonomyChangeImpact>();
    taxonomyChangeImpactList.add(new ImmutableTaxonomyChangeImpact.Json());

    // Act
    json.setImpacts(taxonomyChangeImpactList);

    // Assert
    assertSame(taxonomyChangeImpactList, json.impacts);
  }
}


package com.khartec.waltz.model.measurable_category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.RagNamesProvider;
import com.khartec.waltz.model.rating.RagName;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableMeasurableCategoryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest8() {
    // Arrange
    ImmutableMeasurableCategory.Builder builderResult = ImmutableMeasurableCategory.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((RagNamesProvider) new ImmutableMeasurableCategory.Json());
  }
  @Test
  public void fromTest7() {
    // Arrange
    ImmutableMeasurableCategory.Builder builderResult = ImmutableMeasurableCategory.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableMeasurableCategory.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurableCategory.builder().build();
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutableMeasurableCategory.Builder builderResult = ImmutableMeasurableCategory.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableMeasurableCategory.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableMeasurableCategory.Builder builderResult = ImmutableMeasurableCategory.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableMeasurableCategory.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableMeasurableCategory.Builder builderResult = ImmutableMeasurableCategory.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableMeasurableCategory.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableMeasurableCategory.Builder builderResult = ImmutableMeasurableCategory.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableMeasurableCategory.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableMeasurableCategory.Builder builderResult = ImmutableMeasurableCategory.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableMeasurableCategory.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableMeasurableCategory.Builder builderResult = ImmutableMeasurableCategory.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableMeasurableCategory.Json());
  }
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableCategory.Json()).kind();
  }
  @Test
  public void setRatingSchemeIdTest() {
    // Arrange
    ImmutableMeasurableCategory.Json json = new ImmutableMeasurableCategory.Json();

    // Act
    json.setRatingSchemeId(123L);

    // Assert
    assertEquals(123L, json.ratingSchemeId);
    assertTrue(json.ratingSchemeIdIsSet);
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableMeasurableCategory.Json json = new ImmutableMeasurableCategory.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void setRagNamesTest() {
    // Arrange
    ImmutableMeasurableCategory.Json json = new ImmutableMeasurableCategory.Json();
    ArrayList<RagName> ragNameList = new ArrayList<RagName>();
    ragNameList.add(null);

    // Act
    json.setRagNames(ragNameList);

    // Assert
    assertSame(ragNameList, json.ragNames);
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableCategory.Json()).description();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableCategory.Json()).lastUpdatedBy();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableCategory.Json()).id();
  }
  @Test
  public void setEditableTest() {
    // Arrange
    ImmutableMeasurableCategory.Json json = new ImmutableMeasurableCategory.Json();

    // Act
    json.setEditable(true);

    // Assert
    assertTrue(json.editable);
    assertTrue(json.editableIsSet);
  }
  @Test
  public void ragNamesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableCategory.Json()).ragNames();
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableMeasurableCategory.Json json = new ImmutableMeasurableCategory.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void editableTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableCategory.Json()).editable();
  }
  @Test
  public void ratingSchemeIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableCategory.Json()).ratingSchemeId();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableMeasurableCategory.Json json = new ImmutableMeasurableCategory.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableCategory.Json()).name();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableCategory.Json()).lastUpdatedAt();
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableCategory.Json()).externalId();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableMeasurableCategory.Json json = new ImmutableMeasurableCategory.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableMeasurableCategory.Json actualJson = new ImmutableMeasurableCategory.Json();

    // Assert
    assertSame(actualJson.externalId, actualJson.id);
    assertEquals(0, actualJson.ragNames.size());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableMeasurableCategory.copyOf(new ImmutableMeasurableCategory.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurableCategory.fromJson(new ImmutableMeasurableCategory.Json());
  }
}


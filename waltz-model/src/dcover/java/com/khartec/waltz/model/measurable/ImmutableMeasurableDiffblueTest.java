package com.khartec.waltz.model.measurable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.EntityLifecycleStatus;
import com.khartec.waltz.model.EntityLifecycleStatusProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.ExternalParentIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.ParentIdProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableMeasurableDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableMeasurable.copyOf(new ImmutableMeasurable.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurable.fromJson(new ImmutableMeasurable.Json());
  }
  @Test
  public void fromTest11() {
    // Arrange
    ImmutableMeasurable.Builder builderResult = ImmutableMeasurable.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalParentIdProvider) new ImmutableMeasurable.Json());
  }
  @Test
  public void fromTest10() {
    // Arrange
    ImmutableMeasurable.Builder builderResult = ImmutableMeasurable.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityLifecycleStatusProvider) new ImmutableMeasurable.Json());
  }
  @Test
  public void fromTest9() {
    // Arrange
    ImmutableMeasurable.Builder builderResult = ImmutableMeasurable.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ParentIdProvider) new ImmutableMeasurable.Json());
  }
  @Test
  public void fromTest8() {
    // Arrange
    ImmutableMeasurable.Builder builderResult = ImmutableMeasurable.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableMeasurable.Json());
  }
  @Test
  public void fromTest7() {
    // Arrange
    ImmutableMeasurable.Builder builderResult = ImmutableMeasurable.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableMeasurable.Json());
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutableMeasurable.Builder builderResult = ImmutableMeasurable.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableMeasurable.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableMeasurable.Builder builderResult = ImmutableMeasurable.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableMeasurable.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableMeasurable.Builder builderResult = ImmutableMeasurable.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableMeasurable.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableMeasurable.Builder builderResult = ImmutableMeasurable.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableMeasurable.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableMeasurable.Builder builderResult = ImmutableMeasurable.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableMeasurable.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurable.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableMeasurable.Builder builderResult = ImmutableMeasurable.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableMeasurable.Json());
  }
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurable.Json()).kind();
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableMeasurable.Json json = new ImmutableMeasurable.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void categoryIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurable.Json()).categoryId();
  }
  @Test
  public void concreteTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurable.Json()).concrete();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurable.Json()).lastUpdatedBy();
  }
  @Test
  public void externalParentIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurable.Json()).externalParentId();
  }
  @Test
  public void entityLifecycleStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurable.Json()).entityLifecycleStatus();
  }
  @Test
  public void setEntityLifecycleStatusTest() {
    // Arrange
    ImmutableMeasurable.Json json = new ImmutableMeasurable.Json();

    // Act
    json.setEntityLifecycleStatus(EntityLifecycleStatus.ACTIVE);

    // Assert
    assertEquals(EntityLifecycleStatus.ACTIVE, json.entityLifecycleStatus);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurable.Json()).name();
  }
  @Test
  public void parentIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurable.Json()).parentId();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableMeasurable.Json json = new ImmutableMeasurable.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableMeasurable.Json actualJson = new ImmutableMeasurable.Json();

    // Assert
    Optional<Long> optional = actualJson.id;
    assertSame(optional, actualJson.externalId);
    assertSame(optional, actualJson.externalParentId);
    assertSame(optional, actualJson.parentId);
  }
  @Test
  public void setCategoryIdTest() {
    // Arrange
    ImmutableMeasurable.Json json = new ImmutableMeasurable.Json();

    // Act
    json.setCategoryId(123L);

    // Assert
    assertTrue(json.categoryIdIsSet);
    assertEquals(123L, json.categoryId);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableMeasurable.Json json = new ImmutableMeasurable.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurable.Json()).description();
  }
  @Test
  public void setConcreteTest() {
    // Arrange
    ImmutableMeasurable.Json json = new ImmutableMeasurable.Json();

    // Act
    json.setConcrete(true);

    // Assert
    assertTrue(json.concreteIsSet);
    assertTrue(json.concrete);
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurable.Json()).provenance();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurable.Json()).id();
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableMeasurable.Json json = new ImmutableMeasurable.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableMeasurable.Json json = new ImmutableMeasurable.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurable.Json()).lastUpdatedAt();
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurable.Json()).externalId();
  }
}


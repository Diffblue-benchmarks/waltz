package com.khartec.waltz.model.change_set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.EntityLifecycleStatus;
import com.khartec.waltz.model.EntityLifecycleStatusProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableChangeSetDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeSet.Json()).kind();
  }
  @Test
  public void parentEntityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeSet.Json()).parentEntity();
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableChangeSet.Json json = new ImmutableChangeSet.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeSet.Json()).description();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeSet.Json()).lastUpdatedBy();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeSet.Json()).provenance();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeSet.Json()).id();
  }
  @Test
  public void entityLifecycleStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeSet.Json()).entityLifecycleStatus();
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableChangeSet.Json json = new ImmutableChangeSet.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void setEntityLifecycleStatusTest() {
    // Arrange
    ImmutableChangeSet.Json json = new ImmutableChangeSet.Json();

    // Act
    json.setEntityLifecycleStatus(EntityLifecycleStatus.ACTIVE);

    // Assert
    assertEquals(EntityLifecycleStatus.ACTIVE, json.entityLifecycleStatus);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableChangeSet.Json json = new ImmutableChangeSet.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeSet.Json()).name();
  }
  @Test
  public void plannedDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeSet.Json()).plannedDate();
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeSet.Json()).externalId();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeSet.Json()).lastUpdatedAt();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableChangeSet.Json json = new ImmutableChangeSet.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableChangeSet.Json actualJson = new ImmutableChangeSet.Json();

    // Assert
    Optional<EntityReference> optional = actualJson.parentEntity;
    assertSame(optional, actualJson.id);
    assertSame(optional, actualJson.plannedDate);
    assertSame(optional, actualJson.externalId);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableChangeSet.Json json = new ImmutableChangeSet.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableChangeSet.fromJson(new ImmutableChangeSet.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableChangeSet.copyOf(new ImmutableChangeSet.Json());
  }
  @Test
  public void fromTest9() {
    // Arrange
    ImmutableChangeSet.Builder builderResult = ImmutableChangeSet.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableChangeSet.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableChangeSet.builder().build();
  }
  @Test
  public void fromTest8() {
    // Arrange
    ImmutableChangeSet.Builder builderResult = ImmutableChangeSet.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableChangeSet.Json());
  }
  @Test
  public void fromTest7() {
    // Arrange
    ImmutableChangeSet.Builder builderResult = ImmutableChangeSet.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityLifecycleStatusProvider) new ImmutableChangeSet.Json());
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutableChangeSet.Builder builderResult = ImmutableChangeSet.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableChangeSet.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableChangeSet.Builder builderResult = ImmutableChangeSet.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableChangeSet.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableChangeSet.Builder builderResult = ImmutableChangeSet.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableChangeSet.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableChangeSet.Builder builderResult = ImmutableChangeSet.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableChangeSet.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableChangeSet.Builder builderResult = ImmutableChangeSet.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableChangeSet.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableChangeSet.Builder builderResult = ImmutableChangeSet.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableChangeSet.Json());
  }
}


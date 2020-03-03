package com.khartec.waltz.model.change_unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.EntityLifecycleStatus;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableChangeUnitDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeUnit.Json()).kind();
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableChangeUnit.Json json = new ImmutableChangeUnit.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeUnit.Json()).lastUpdatedBy();
  }
  @Test
  public void setSubjectInitialStatusTest() {
    // Arrange
    ImmutableChangeUnit.Json json = new ImmutableChangeUnit.Json();

    // Act
    json.setSubjectInitialStatus(EntityLifecycleStatus.ACTIVE);

    // Assert
    assertEquals(EntityLifecycleStatus.ACTIVE, json.subjectInitialStatus);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeUnit.Json()).name();
  }
  @Test
  public void setExecutionStatusTest() {
    // Arrange
    ImmutableChangeUnit.Json json = new ImmutableChangeUnit.Json();

    // Act
    json.setExecutionStatus(ExecutionStatus.PENDING);

    // Assert
    assertEquals(ExecutionStatus.PENDING, json.executionStatus);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableChangeUnit.Json json = new ImmutableChangeUnit.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableChangeUnit.Json actualJson = new ImmutableChangeUnit.Json();

    // Assert
    Optional<Long> optional = actualJson.id;
    assertSame(actualJson.externalId, optional);
    assertSame(optional, actualJson.changeSetId);
    assertSame(optional, actualJson.externalId);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableChangeUnit.Json json = new ImmutableChangeUnit.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
  @Test
  public void subjectInitialStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeUnit.Json()).subjectInitialStatus();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeUnit.Json()).description();
  }
  @Test
  public void executionStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeUnit.Json()).executionStatus();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeUnit.Json()).provenance();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeUnit.Json()).id();
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableChangeUnit.Json json = new ImmutableChangeUnit.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void changeSetIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeUnit.Json()).changeSetId();
  }
  @Test
  public void setActionTest() {
    // Arrange
    ImmutableChangeUnit.Json json = new ImmutableChangeUnit.Json();

    // Act
    json.setAction(ChangeAction.ACTIVATE);

    // Assert
    assertEquals(ChangeAction.ACTIVATE, json.action);
  }
  @Test
  public void actionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeUnit.Json()).action();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableChangeUnit.Json json = new ImmutableChangeUnit.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void subjectEntityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeUnit.Json()).subjectEntity();
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeUnit.Json()).externalId();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeUnit.Json()).lastUpdatedAt();
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableChangeUnit.copyOf(new ImmutableChangeUnit.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableChangeUnit.fromJson(new ImmutableChangeUnit.Json());
  }
  @Test
  public void fromTest8() {
    // Arrange
    ImmutableChangeUnit.Builder builderResult = ImmutableChangeUnit.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableChangeUnit.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableChangeUnit.builder().build();
  }
  @Test
  public void fromTest7() {
    // Arrange
    ImmutableChangeUnit.Builder builderResult = ImmutableChangeUnit.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableChangeUnit.Json());
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutableChangeUnit.Builder builderResult = ImmutableChangeUnit.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableChangeUnit.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableChangeUnit.Builder builderResult = ImmutableChangeUnit.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableChangeUnit.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableChangeUnit.Builder builderResult = ImmutableChangeUnit.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableChangeUnit.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableChangeUnit.Builder builderResult = ImmutableChangeUnit.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableChangeUnit.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableChangeUnit.Builder builderResult = ImmutableChangeUnit.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableChangeUnit.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableChangeUnit.Builder builderResult = ImmutableChangeUnit.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableChangeUnit.Json());
  }
}


package com.khartec.waltz.model.change_initiative;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.OrganisationalUnitIdProvider;
import com.khartec.waltz.model.ParentIdProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.application.LifecyclePhase;
import java.util.Date;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableChangeInitiativeDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void setChangeInitiativeKindTest() {
    // Arrange
    ImmutableChangeInitiative.Json json = new ImmutableChangeInitiative.Json();

    // Act
    json.setChangeInitiativeKind(ChangeInitiativeKind.INITIATIVE);

    // Assert
    assertEquals(ChangeInitiativeKind.INITIATIVE, json.changeInitiativeKind);
  }
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeInitiative.Json()).kind();
  }
  @Test
  public void endDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeInitiative.Json()).endDate();
  }
  @Test
  public void startDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeInitiative.Json()).startDate();
  }
  @Test
  public void setOrganisationalUnitIdTest() {
    // Arrange
    ImmutableChangeInitiative.Json json = new ImmutableChangeInitiative.Json();

    // Act
    json.setOrganisationalUnitId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.organisationalUnitId);
  }
  @Test
  public void organisationalUnitIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeInitiative.Json()).organisationalUnitId();
  }
  @Test
  public void setStartDateTest() {
    // Arrange
    Date date = new Date(1L);
    ImmutableChangeInitiative.Json json = new ImmutableChangeInitiative.Json();

    // Act
    json.setStartDate(date);

    // Assert
    assertSame(date, json.startDate);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeInitiative.Json()).name();
  }
  @Test
  public void parentIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeInitiative.Json()).parentId();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableChangeInitiative.Json json = new ImmutableChangeInitiative.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setLifecyclePhaseTest() {
    // Arrange
    ImmutableChangeInitiative.Json json = new ImmutableChangeInitiative.Json();

    // Act
    json.setLifecyclePhase(LifecyclePhase.PRODUCTION);

    // Assert
    assertEquals(LifecyclePhase.PRODUCTION, json.lifecyclePhase);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableChangeInitiative.Json actualJson = new ImmutableChangeInitiative.Json();

    // Assert
    Optional<Long> optional = actualJson.id;
    assertSame(optional, actualJson.parentId);
    assertSame(optional, actualJson.lastUpdate);
    assertSame(optional, actualJson.externalId);
  }
  @Test
  public void lastUpdateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeInitiative.Json()).lastUpdate();
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableChangeInitiative.Json json = new ImmutableChangeInitiative.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeInitiative.Json()).description();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeInitiative.Json()).provenance();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeInitiative.Json()).id();
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableChangeInitiative.Json json = new ImmutableChangeInitiative.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void changeInitiativeKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeInitiative.Json()).changeInitiativeKind();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableChangeInitiative.Json json = new ImmutableChangeInitiative.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void lifecyclePhaseTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeInitiative.Json()).lifecyclePhase();
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableChangeInitiative.Json()).externalId();
  }
  @Test
  public void setEndDateTest() {
    // Arrange
    Date date = new Date(1L);
    ImmutableChangeInitiative.Json json = new ImmutableChangeInitiative.Json();

    // Act
    json.setEndDate(date);

    // Assert
    assertSame(date, json.endDate);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableChangeInitiative.copyOf(new ImmutableChangeInitiative.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableChangeInitiative.fromJson(new ImmutableChangeInitiative.Json());
  }
  @Test
  public void fromTest9() {
    // Arrange
    ImmutableChangeInitiative.Builder builderResult = ImmutableChangeInitiative.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableChangeInitiative.Json());
  }
  @Test
  public void fromTest8() {
    // Arrange
    ImmutableChangeInitiative.Builder builderResult = ImmutableChangeInitiative.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableChangeInitiative.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableChangeInitiative.builder().build();
  }
  @Test
  public void fromTest7() {
    // Arrange
    ImmutableChangeInitiative.Builder builderResult = ImmutableChangeInitiative.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((OrganisationalUnitIdProvider) new ImmutableChangeInitiative.Json());
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutableChangeInitiative.Builder builderResult = ImmutableChangeInitiative.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ParentIdProvider) new ImmutableChangeInitiative.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableChangeInitiative.Builder builderResult = ImmutableChangeInitiative.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableChangeInitiative.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableChangeInitiative.Builder builderResult = ImmutableChangeInitiative.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableChangeInitiative.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableChangeInitiative.Builder builderResult = ImmutableChangeInitiative.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableChangeInitiative.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableChangeInitiative.Builder builderResult = ImmutableChangeInitiative.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableChangeInitiative.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableChangeInitiative.Builder builderResult = ImmutableChangeInitiative.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableChangeInitiative.Json());
  }
}


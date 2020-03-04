package com.khartec.waltz.model.enduserapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.Criticality;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.application.LifecyclePhase;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEndUserApplicationDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void applicationKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEndUserApplication.Json()).applicationKind();
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEndUserApplication.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEndUserApplication.Json actualJson = new ImmutableEndUserApplication.Json();

    // Assert
    assertSame(actualJson.id, actualJson.externalId);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEndUserApplication.copyOf(new ImmutableEndUserApplication.Json());
  }

  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEndUserApplication.Json()).description();
  }

  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEndUserApplication.Json()).externalId();
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEndUserApplication.fromJson(new ImmutableEndUserApplication.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableEndUserApplication.Builder builderResult = ImmutableEndUserApplication.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableEndUserApplication.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableEndUserApplication.Builder builderResult = ImmutableEndUserApplication.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableEndUserApplication.Json());
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableEndUserApplication.Builder builderResult = ImmutableEndUserApplication.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableEndUserApplication.Json());
  }

  @Test
  public void fromTest4() {
    // Arrange
    ImmutableEndUserApplication.Builder builderResult = ImmutableEndUserApplication.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableEndUserApplication.Json());
  }

  @Test
  public void fromTest5() {
    // Arrange
    ImmutableEndUserApplication.Builder builderResult = ImmutableEndUserApplication.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableEndUserApplication.Json());
  }

  @Test
  public void fromTest6() {
    // Arrange
    ImmutableEndUserApplication.Builder builderResult = ImmutableEndUserApplication.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableEndUserApplication.Json());
  }

  @Test
  public void fromTest7() {
    // Arrange
    ImmutableEndUserApplication.Builder builderResult = ImmutableEndUserApplication.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEndUserApplication.Json());
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEndUserApplication.Json()).id();
  }

  @Test
  public void isPromotedTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEndUserApplication.Json()).isPromoted();
  }

  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEndUserApplication.Json()).kind();
  }

  @Test
  public void lifecyclePhaseTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEndUserApplication.Json()).lifecyclePhase();
  }

  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEndUserApplication.Json()).name();
  }

  @Test
  public void organisationalUnitIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEndUserApplication.Json()).organisationalUnitId();
  }

  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEndUserApplication.Json()).provenance();
  }

  @Test
  public void riskRatingTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEndUserApplication.Json()).riskRating();
  }

  @Test
  public void setApplicationKindTest() {
    // Arrange
    ImmutableEndUserApplication.Json json = new ImmutableEndUserApplication.Json();

    // Act
    json.setApplicationKind("applicationKind");

    // Assert
    assertEquals("applicationKind", json.applicationKind);
  }

  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableEndUserApplication.Json json = new ImmutableEndUserApplication.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }

  @Test
  public void setIsPromotedTest() {
    // Arrange
    ImmutableEndUserApplication.Json json = new ImmutableEndUserApplication.Json();

    // Act
    json.setIsPromoted(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), json.isPromoted);
  }

  @Test
  public void setKindTest() {
    // Arrange
    ImmutableEndUserApplication.Json json = new ImmutableEndUserApplication.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }

  @Test
  public void setLifecyclePhaseTest() {
    // Arrange
    ImmutableEndUserApplication.Json json = new ImmutableEndUserApplication.Json();

    // Act
    json.setLifecyclePhase(LifecyclePhase.PRODUCTION);

    // Assert
    assertEquals(LifecyclePhase.PRODUCTION, json.lifecyclePhase);
  }

  @Test
  public void setNameTest() {
    // Arrange
    ImmutableEndUserApplication.Json json = new ImmutableEndUserApplication.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }

  @Test
  public void setOrganisationalUnitIdTest() {
    // Arrange
    ImmutableEndUserApplication.Json json = new ImmutableEndUserApplication.Json();

    // Act
    json.setOrganisationalUnitId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.organisationalUnitId);
  }

  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableEndUserApplication.Json json = new ImmutableEndUserApplication.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }

  @Test
  public void setRiskRatingTest() {
    // Arrange
    ImmutableEndUserApplication.Json json = new ImmutableEndUserApplication.Json();

    // Act
    json.setRiskRating(Criticality.LOW);

    // Assert
    assertEquals(Criticality.LOW, json.riskRating);
  }
}


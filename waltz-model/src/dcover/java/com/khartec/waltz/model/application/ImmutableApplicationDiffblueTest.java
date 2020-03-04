package com.khartec.waltz.model.application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.Criticality;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.EntityLifecycleStatus;
import com.khartec.waltz.model.EntityLifecycleStatusProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.IsRemovedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.OrganisationalUnitIdProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.rating.RagRating;
import java.time.LocalDateTime;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableApplicationDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void actualRetirementDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplication.Json()).actualRetirementDate();
  }
  @Test
  public void applicationKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplication.Json()).applicationKind();
  }
  @Test
  public void assetCodeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplication.Json()).assetCode();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableApplication.builder().build();
  }
  @Test
  public void businessCriticalityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplication.Json()).businessCriticality();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableApplication.Json actualJson = new ImmutableApplication.Json();

    // Assert
    Optional<LocalDateTime> optional = actualJson.plannedRetirementDate;
    assertSame(optional, actualJson.parentAssetCode);
    assertSame(optional, actualJson.assetCode);
    assertSame(optional, actualJson.id);
    assertSame(optional, actualJson.actualRetirementDate);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableApplication.copyOf(new ImmutableApplication.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplication.Json()).description();
  }
  @Test
  public void entityLifecycleStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplication.Json()).entityLifecycleStatus();
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplication.Json()).externalId();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableApplication.fromJson(new ImmutableApplication.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableApplication.Builder builderResult = ImmutableApplication.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableApplication.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableApplication.Builder builderResult = ImmutableApplication.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityLifecycleStatusProvider) new ImmutableApplication.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableApplication.Builder builderResult = ImmutableApplication.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((OrganisationalUnitIdProvider) new ImmutableApplication.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableApplication.Builder builderResult = ImmutableApplication.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableApplication.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableApplication.Builder builderResult = ImmutableApplication.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableApplication.Json());
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutableApplication.Builder builderResult = ImmutableApplication.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableApplication.Json());
  }
  @Test
  public void fromTest7() {
    // Arrange
    ImmutableApplication.Builder builderResult = ImmutableApplication.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableApplication.Json());
  }
  @Test
  public void fromTest8() {
    // Arrange
    ImmutableApplication.Builder builderResult = ImmutableApplication.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IsRemovedProvider) new ImmutableApplication.Json());
  }
  @Test
  public void fromTest9() {
    // Arrange
    ImmutableApplication.Builder builderResult = ImmutableApplication.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableApplication.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplication.Json()).id();
  }
  @Test
  public void isRemovedTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplication.Json()).isRemoved();
  }
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplication.Json()).kind();
  }
  @Test
  public void lifecyclePhaseTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplication.Json()).lifecyclePhase();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplication.Json()).name();
  }
  @Test
  public void organisationalUnitIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplication.Json()).organisationalUnitId();
  }
  @Test
  public void overallRatingTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplication.Json()).overallRating();
  }
  @Test
  public void parentAssetCodeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplication.Json()).parentAssetCode();
  }
  @Test
  public void plannedRetirementDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplication.Json()).plannedRetirementDate();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplication.Json()).provenance();
  }
  @Test
  public void setApplicationKindTest() {
    // Arrange
    ImmutableApplication.Json json = new ImmutableApplication.Json();

    // Act
    json.setApplicationKind(ApplicationKind.IN_HOUSE);

    // Assert
    assertEquals(ApplicationKind.IN_HOUSE, json.applicationKind);
  }
  @Test
  public void setBusinessCriticalityTest() {
    // Arrange
    ImmutableApplication.Json json = new ImmutableApplication.Json();

    // Act
    json.setBusinessCriticality(Criticality.LOW);

    // Assert
    assertEquals(Criticality.LOW, json.businessCriticality);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableApplication.Json json = new ImmutableApplication.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setEntityLifecycleStatusTest() {
    // Arrange
    ImmutableApplication.Json json = new ImmutableApplication.Json();

    // Act
    json.setEntityLifecycleStatus(EntityLifecycleStatus.ACTIVE);

    // Assert
    assertEquals(EntityLifecycleStatus.ACTIVE, json.entityLifecycleStatus);
  }
  @Test
  public void setIsRemovedTest() {
    // Arrange
    ImmutableApplication.Json json = new ImmutableApplication.Json();

    // Act
    json.setIsRemoved(true);

    // Assert
    assertTrue(json.isRemoved);
    assertTrue(json.isRemovedIsSet);
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableApplication.Json json = new ImmutableApplication.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void setLifecyclePhaseTest() {
    // Arrange
    ImmutableApplication.Json json = new ImmutableApplication.Json();

    // Act
    json.setLifecyclePhase(LifecyclePhase.PRODUCTION);

    // Assert
    assertEquals(LifecyclePhase.PRODUCTION, json.lifecyclePhase);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableApplication.Json json = new ImmutableApplication.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setOrganisationalUnitIdTest() {
    // Arrange
    ImmutableApplication.Json json = new ImmutableApplication.Json();

    // Act
    json.setOrganisationalUnitId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.organisationalUnitId);
  }
  @Test
  public void setOverallRatingTest() {
    // Arrange
    ImmutableApplication.Json json = new ImmutableApplication.Json();

    // Act
    json.setOverallRating(RagRating.R);

    // Assert
    assertEquals(RagRating.R, json.overallRating);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableApplication.Json json = new ImmutableApplication.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }
}


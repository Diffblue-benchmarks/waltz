package com.khartec.waltz.model.physical_flow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.CreatedUserTimestampProvider;
import com.khartec.waltz.model.Criticality;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.EntityLifecycleStatus;
import com.khartec.waltz.model.EntityLifecycleStatusProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.FreshnessIndicator;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.IsRemovedProvider;
import com.khartec.waltz.model.LastAttestedProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import java.time.LocalDateTime;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalFlowDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest11() {
    // Arrange
    ImmutablePhysicalFlow.Builder builderResult = ImmutablePhysicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutablePhysicalFlow.Json());
  }
  @Test
  public void fromTest10() {
    // Arrange
    ImmutablePhysicalFlow.Builder builderResult = ImmutablePhysicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutablePhysicalFlow.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlow.builder().build();
  }
  @Test
  public void fromTest9() {
    // Arrange
    ImmutablePhysicalFlow.Builder builderResult = ImmutablePhysicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalFlow.Json());
  }
  @Test
  public void fromTest8() {
    // Arrange
    ImmutablePhysicalFlow.Builder builderResult = ImmutablePhysicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutablePhysicalFlow.Json());
  }
  @Test
  public void fromTest7() {
    // Arrange
    ImmutablePhysicalFlow.Builder builderResult = ImmutablePhysicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastAttestedProvider) new ImmutablePhysicalFlow.Json());
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutablePhysicalFlow.Builder builderResult = ImmutablePhysicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IsRemovedProvider) new ImmutablePhysicalFlow.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutablePhysicalFlow.Builder builderResult = ImmutablePhysicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((CreatedUserTimestampProvider) new ImmutablePhysicalFlow.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutablePhysicalFlow.Builder builderResult = ImmutablePhysicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableFlowAttributes.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutablePhysicalFlow.Builder builderResult = ImmutablePhysicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutablePhysicalFlow.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutablePhysicalFlow.Builder builderResult = ImmutablePhysicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutablePhysicalFlow.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalFlow.Builder builderResult = ImmutablePhysicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityLifecycleStatusProvider) new ImmutablePhysicalFlow.Json());
  }
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).kind();
  }
  @Test
  public void criticalityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).criticality();
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutablePhysicalFlow.Json json = new ImmutablePhysicalFlow.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void setBasisOffsetTest() {
    // Arrange
    ImmutablePhysicalFlow.Json json = new ImmutablePhysicalFlow.Json();

    // Act
    json.setBasisOffset(1);

    // Assert
    assertEquals(1, json.basisOffset);
    assertTrue(json.basisOffsetIsSet);
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).lastUpdatedBy();
  }
  @Test
  public void setSpecificationIdTest() {
    // Arrange
    ImmutablePhysicalFlow.Json json = new ImmutablePhysicalFlow.Json();

    // Act
    json.setSpecificationId(123L);

    // Assert
    assertTrue(json.specificationIdIsSet);
    assertEquals(123L, json.specificationId);
  }
  @Test
  public void entityLifecycleStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).entityLifecycleStatus();
  }
  @Test
  public void setIsRemovedTest() {
    // Arrange
    ImmutablePhysicalFlow.Json json = new ImmutablePhysicalFlow.Json();

    // Act
    json.setIsRemoved(true);

    // Assert
    assertTrue(json.isRemoved);
    assertTrue(json.isRemovedIsSet);
  }
  @Test
  public void setFrequencyTest() {
    // Arrange
    ImmutablePhysicalFlow.Json json = new ImmutablePhysicalFlow.Json();

    // Act
    json.setFrequency(FrequencyKind.ON_DEMAND);

    // Assert
    assertEquals(FrequencyKind.ON_DEMAND, json.frequency);
  }
  @Test
  public void setEntityLifecycleStatusTest() {
    // Arrange
    ImmutablePhysicalFlow.Json json = new ImmutablePhysicalFlow.Json();

    // Act
    json.setEntityLifecycleStatus(EntityLifecycleStatus.ACTIVE);

    // Assert
    assertEquals(EntityLifecycleStatus.ACTIVE, json.entityLifecycleStatus);
  }
  @Test
  public void setTransportTest() {
    // Arrange
    ImmutablePhysicalFlow.Json json = new ImmutablePhysicalFlow.Json();

    // Act
    json.setTransport("foo");

    // Assert
    assertEquals("foo", json.transport);
  }
  @Test
  public void transportTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).transport();
  }
  @Test
  public void frequencyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).frequency();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalFlow.Json actualJson = new ImmutablePhysicalFlow.Json();

    // Assert
    Optional<LocalDateTime> optional = actualJson.lastAttestedAt;
    assertSame(optional, actualJson.lastAttestedBy);
    assertSame(optional, actualJson.id);
    assertSame(optional, actualJson.specificationDefinitionId);
    assertSame(optional, actualJson.created);
    assertSame(optional, actualJson.externalId);
  }
  @Test
  public void lastAttestedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).lastAttestedBy();
  }
  @Test
  public void setFreshnessIndicatorTest() {
    // Arrange
    ImmutablePhysicalFlow.Json json = new ImmutablePhysicalFlow.Json();

    // Act
    json.setFreshnessIndicator(FreshnessIndicator.NEVER_OBSERVED);

    // Assert
    assertEquals(FreshnessIndicator.NEVER_OBSERVED, json.freshnessIndicator);
  }
  @Test
  public void freshnessIndicatorTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).freshnessIndicator();
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutablePhysicalFlow.Json json = new ImmutablePhysicalFlow.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).description();
  }
  @Test
  public void logicalFlowIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).logicalFlowId();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).provenance();
  }
  @Test
  public void createdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).created();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).id();
  }
  @Test
  public void basisOffsetTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).basisOffset();
  }
  @Test
  public void specificationDefinitionIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).specificationDefinitionId();
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutablePhysicalFlow.Json json = new ImmutablePhysicalFlow.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void setCriticalityTest() {
    // Arrange
    ImmutablePhysicalFlow.Json json = new ImmutablePhysicalFlow.Json();

    // Act
    json.setCriticality(Criticality.LOW);

    // Assert
    assertEquals(Criticality.LOW, json.criticality);
  }
  @Test
  public void setLogicalFlowIdTest() {
    // Arrange
    ImmutablePhysicalFlow.Json json = new ImmutablePhysicalFlow.Json();

    // Act
    json.setLogicalFlowId(123L);

    // Assert
    assertTrue(json.logicalFlowIdIsSet);
    assertEquals(123L, json.logicalFlowId);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutablePhysicalFlow.Json json = new ImmutablePhysicalFlow.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void specificationIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).specificationId();
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).externalId();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).lastUpdatedAt();
  }
  @Test
  public void lastAttestedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).lastAttestedAt();
  }
  @Test
  public void isRemovedTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlow.Json()).isRemoved();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlow.fromJson(new ImmutablePhysicalFlow.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalFlow.copyOf(new ImmutablePhysicalFlow.Json());
  }
}


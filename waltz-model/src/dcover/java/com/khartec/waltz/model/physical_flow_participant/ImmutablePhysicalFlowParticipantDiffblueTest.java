package com.khartec.waltz.model.physical_flow_participant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalFlowParticipantDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalFlowParticipant.copyOf(new ImmutablePhysicalFlowParticipant.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowParticipant.fromJson(new ImmutablePhysicalFlowParticipant.Json());
  }
  @Test
  public void setPhysicalFlowIdTest() {
    // Arrange
    ImmutablePhysicalFlowParticipant.Json json = new ImmutablePhysicalFlowParticipant.Json();

    // Act
    json.setPhysicalFlowId(123L);

    // Assert
    assertTrue(json.physicalFlowIdIsSet);
    assertEquals(123L, json.physicalFlowId);
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutablePhysicalFlowParticipant.Json json = new ImmutablePhysicalFlowParticipant.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParticipant.Json()).description();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParticipant.Json()).lastUpdatedBy();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParticipant.Json()).provenance();
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutablePhysicalFlowParticipant.Json json = new ImmutablePhysicalFlowParticipant.Json();

    // Act
    json.setKind(ParticipationKind.SOURCE);

    // Assert
    assertEquals(ParticipationKind.SOURCE, json.kind);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutablePhysicalFlowParticipant.Json json = new ImmutablePhysicalFlowParticipant.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void participantTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParticipant.Json()).participant();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParticipant.Json()).lastUpdatedAt();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalFlowParticipant.Json actualJson = new ImmutablePhysicalFlowParticipant.Json();

    // Assert
    assertNull(actualJson.participant);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.provenance);
    assertNull(actualJson.lastUpdatedAt);
    assertFalse(actualJson.physicalFlowIdIsSet);
    assertNull(actualJson.kind);
    assertEquals(0L, actualJson.physicalFlowId);
    assertNull(actualJson.description);
  }
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParticipant.Json()).kind();
  }
  @Test
  public void physicalFlowIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParticipant.Json()).physicalFlowId();
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutablePhysicalFlowParticipant.Json json = new ImmutablePhysicalFlowParticipant.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutablePhysicalFlowParticipant.Builder builderResult = ImmutablePhysicalFlowParticipant.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutablePhysicalFlowParticipant.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutablePhysicalFlowParticipant.Builder builderResult = ImmutablePhysicalFlowParticipant.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutablePhysicalFlowParticipant.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowParticipant.builder().build();
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutablePhysicalFlowParticipant.Builder builderResult = ImmutablePhysicalFlowParticipant.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalFlowParticipant.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalFlowParticipant.Builder builderResult = ImmutablePhysicalFlowParticipant.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutablePhysicalFlowParticipant.Json());
  }
}


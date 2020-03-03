package com.khartec.waltz.model.logical_flow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.CreatedUserTimestampProvider;
import com.khartec.waltz.model.EntityLifecycleStatus;
import com.khartec.waltz.model.EntityLifecycleStatusProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastAttestedProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.UserTimestamp;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableLogicalFlowDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void sourceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlow.Json()).source();
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableLogicalFlow.Json json = new ImmutableLogicalFlow.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void targetTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlow.Json()).target();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlow.Json()).lastUpdatedBy();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlow.Json()).provenance();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlow.Json()).id();
  }
  @Test
  public void createdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlow.Json()).created();
  }
  @Test
  public void entityLifecycleStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlow.Json()).entityLifecycleStatus();
  }
  @Test
  public void setEntityLifecycleStatusTest() {
    // Arrange
    ImmutableLogicalFlow.Json json = new ImmutableLogicalFlow.Json();

    // Act
    json.setEntityLifecycleStatus(EntityLifecycleStatus.ACTIVE);

    // Assert
    assertEquals(EntityLifecycleStatus.ACTIVE, json.entityLifecycleStatus);
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlow.Json()).lastUpdatedAt();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableLogicalFlow.Json actualJson = new ImmutableLogicalFlow.Json();

    // Assert
    Optional<UserTimestamp> optional = actualJson.created;
    assertSame(actualJson.lastAttestedBy, optional);
    assertSame(optional, actualJson.lastAttestedBy);
    assertSame(optional, actualJson.id);
    assertSame(optional, actualJson.lastAttestedAt);
  }
  @Test
  public void lastAttestedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlow.Json()).lastAttestedAt();
  }
  @Test
  public void lastAttestedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlow.Json()).lastAttestedBy();
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableLogicalFlow.Json json = new ImmutableLogicalFlow.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
  @Test
  public void fromTest7() {
    // Arrange
    ImmutableLogicalFlow.Builder builderResult = ImmutableLogicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastAttestedProvider) new ImmutableLogicalFlow.Json());
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutableLogicalFlow.Builder builderResult = ImmutableLogicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableLogicalFlow.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableLogicalFlow.Builder builderResult = ImmutableLogicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((CreatedUserTimestampProvider) new ImmutableLogicalFlow.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLogicalFlow.builder().build();
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableLogicalFlow.Builder builderResult = ImmutableLogicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableLogicalFlow.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableLogicalFlow.Builder builderResult = ImmutableLogicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityLifecycleStatusProvider) new ImmutableLogicalFlow.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableLogicalFlow.Builder builderResult = ImmutableLogicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableLogicalFlow.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableLogicalFlow.Builder builderResult = ImmutableLogicalFlow.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableLogicalFlow.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableLogicalFlow.copyOf(new ImmutableLogicalFlow.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLogicalFlow.fromJson(new ImmutableLogicalFlow.Json());
  }
}


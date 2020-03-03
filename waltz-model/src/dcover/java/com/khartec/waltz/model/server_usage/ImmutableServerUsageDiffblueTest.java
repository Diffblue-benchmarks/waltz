package com.khartec.waltz.model.server_usage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableServerUsageDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableServerUsage.Builder builderResult = ImmutableServerUsage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableServerUsage.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableServerUsage.Builder builderResult = ImmutableServerUsage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableServerUsage.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableServerUsage.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableServerUsage.Builder builderResult = ImmutableServerUsage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableServerUsage.Json());
  }
  @Test
  public void setServerIdTest() {
    // Arrange
    ImmutableServerUsage.Json json = new ImmutableServerUsage.Json();

    // Act
    json.setServerId(123L);

    // Assert
    assertEquals(123L, json.serverId);
    assertTrue(json.serverIdIsSet);
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerUsage.Json()).entityReference();
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableServerUsage.Json json = new ImmutableServerUsage.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void setEnvironmentTest() {
    // Arrange
    ImmutableServerUsage.Json json = new ImmutableServerUsage.Json();

    // Act
    json.setEnvironment("foo");

    // Assert
    assertEquals("foo", json.environment);
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerUsage.Json()).lastUpdatedBy();
  }
  @Test
  public void serverIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerUsage.Json()).serverId();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerUsage.Json()).provenance();
  }
  @Test
  public void environmentTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerUsage.Json()).environment();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerUsage.Json()).lastUpdatedAt();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableServerUsage.Json actualJson = new ImmutableServerUsage.Json();

    // Assert
    assertEquals(0L, actualJson.serverId);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.environment);
    assertNull(actualJson.provenance);
    assertFalse(actualJson.serverIdIsSet);
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.entityReference);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableServerUsage.Json json = new ImmutableServerUsage.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableServerUsage.fromJson(new ImmutableServerUsage.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableServerUsage.copyOf(new ImmutableServerUsage.Json());
  }
}


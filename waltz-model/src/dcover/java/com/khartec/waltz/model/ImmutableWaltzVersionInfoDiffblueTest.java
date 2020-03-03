package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableWaltzVersionInfoDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void timestampTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableWaltzVersionInfo.Json()).timestamp();
  }
  @Test
  public void setTimestampTest() {
    // Arrange
    ImmutableWaltzVersionInfo.Json json = new ImmutableWaltzVersionInfo.Json();

    // Act
    json.setTimestamp("foo");

    // Assert
    assertEquals("foo", json.timestamp);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableWaltzVersionInfo.Json actualJson = new ImmutableWaltzVersionInfo.Json();

    // Assert
    assertNull(actualJson.pomVersion);
    assertNull(actualJson.revision);
    assertNull(actualJson.timestamp);
  }
  @Test
  public void setPomVersionTest() {
    // Arrange
    ImmutableWaltzVersionInfo.Json json = new ImmutableWaltzVersionInfo.Json();

    // Act
    json.setPomVersion("foo");

    // Assert
    assertEquals("foo", json.pomVersion);
  }
  @Test
  public void setRevisionTest() {
    // Arrange
    ImmutableWaltzVersionInfo.Json json = new ImmutableWaltzVersionInfo.Json();

    // Act
    json.setRevision("foo");

    // Assert
    assertEquals("foo", json.revision);
  }
  @Test
  public void pomVersionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableWaltzVersionInfo.Json()).pomVersion();
  }
  @Test
  public void revisionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableWaltzVersionInfo.Json()).revision();
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableWaltzVersionInfo.copyOf(new ImmutableWaltzVersionInfo.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableWaltzVersionInfo.fromJson(new ImmutableWaltzVersionInfo.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableWaltzVersionInfo.Builder builderResult = ImmutableWaltzVersionInfo.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableWaltzVersionInfo.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableWaltzVersionInfo.builder().build();
  }
}


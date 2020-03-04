package com.khartec.waltz.web.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableBrowserInfoDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableBrowserInfo.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableBrowserInfo.Json actualJson = new ImmutableBrowserInfo.Json();

    // Assert
    assertNull(actualJson.operatingSystem);
    assertNull(actualJson.resolution);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableBrowserInfo.copyOf(new ImmutableBrowserInfo.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableBrowserInfo.fromJson(new ImmutableBrowserInfo.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableBrowserInfo.Builder builderResult = ImmutableBrowserInfo.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableBrowserInfo.Json());
  }

  @Test
  public void operatingSystemTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableBrowserInfo.Json()).operatingSystem();
  }

  @Test
  public void resolutionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableBrowserInfo.Json()).resolution();
  }

  @Test
  public void setOperatingSystemTest() {
    // Arrange
    ImmutableBrowserInfo.Json json = new ImmutableBrowserInfo.Json();

    // Act
    json.setOperatingSystem("operatingSystem");

    // Assert
    assertEquals("operatingSystem", json.operatingSystem);
  }

  @Test
  public void setResolutionTest() {
    // Arrange
    ImmutableBrowserInfo.Json json = new ImmutableBrowserInfo.Json();

    // Act
    json.setResolution("resolution");

    // Assert
    assertEquals("resolution", json.resolution);
  }
}


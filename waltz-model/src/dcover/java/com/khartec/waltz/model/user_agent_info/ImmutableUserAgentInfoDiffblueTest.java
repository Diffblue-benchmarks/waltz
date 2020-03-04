package com.khartec.waltz.model.user_agent_info;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.UserNameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableUserAgentInfoDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUserAgentInfo.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableUserAgentInfo.Json actualJson = new ImmutableUserAgentInfo.Json();

    // Assert
    assertNull(actualJson.userName);
    assertNull(actualJson.ipAddress);
    assertNull(actualJson.userAgent);
    assertNull(actualJson.operatingSystem);
    assertNull(actualJson.resolution);
    assertNull(actualJson.loginTimestamp);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableUserAgentInfo.copyOf(new ImmutableUserAgentInfo.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUserAgentInfo.fromJson(new ImmutableUserAgentInfo.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableUserAgentInfo.Builder builderResult = ImmutableUserAgentInfo.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableUserAgentInfo.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableUserAgentInfo.Builder builderResult = ImmutableUserAgentInfo.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((UserNameProvider) new ImmutableUserAgentInfo.Json());
  }

  @Test
  public void ipAddressTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUserAgentInfo.Json()).ipAddress();
  }

  @Test
  public void loginTimestampTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUserAgentInfo.Json()).loginTimestamp();
  }

  @Test
  public void operatingSystemTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUserAgentInfo.Json()).operatingSystem();
  }

  @Test
  public void resolutionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUserAgentInfo.Json()).resolution();
  }

  @Test
  public void setIpAddressTest() {
    // Arrange
    ImmutableUserAgentInfo.Json json = new ImmutableUserAgentInfo.Json();

    // Act
    json.setIpAddress("ipAddress");

    // Assert
    assertEquals("ipAddress", json.ipAddress);
  }

  @Test
  public void setOperatingSystemTest() {
    // Arrange
    ImmutableUserAgentInfo.Json json = new ImmutableUserAgentInfo.Json();

    // Act
    json.setOperatingSystem("operatingSystem");

    // Assert
    assertEquals("operatingSystem", json.operatingSystem);
  }

  @Test
  public void setResolutionTest() {
    // Arrange
    ImmutableUserAgentInfo.Json json = new ImmutableUserAgentInfo.Json();

    // Act
    json.setResolution("resolution");

    // Assert
    assertEquals("resolution", json.resolution);
  }

  @Test
  public void setUserAgentTest() {
    // Arrange
    ImmutableUserAgentInfo.Json json = new ImmutableUserAgentInfo.Json();

    // Act
    json.setUserAgent("userAgent");

    // Assert
    assertEquals("userAgent", json.userAgent);
  }

  @Test
  public void setUserNameTest() {
    // Arrange
    ImmutableUserAgentInfo.Json json = new ImmutableUserAgentInfo.Json();

    // Act
    json.setUserName("username");

    // Assert
    assertEquals("username", json.userName);
  }

  @Test
  public void userAgentTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUserAgentInfo.Json()).userAgent();
  }

  @Test
  public void userNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUserAgentInfo.Json()).userName();
  }
}


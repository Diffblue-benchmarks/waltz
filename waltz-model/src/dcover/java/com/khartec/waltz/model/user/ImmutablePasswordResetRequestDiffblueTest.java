package com.khartec.waltz.model.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePasswordResetRequestDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePasswordResetRequest.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePasswordResetRequest.Json actualJson = new ImmutablePasswordResetRequest.Json();

    // Assert
    assertNull(actualJson.newPassword);
    assertNull(actualJson.userName);
    assertNull(actualJson.currentPassword);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePasswordResetRequest.copyOf(new ImmutablePasswordResetRequest.Json());
  }
  @Test
  public void currentPasswordTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePasswordResetRequest.Json()).currentPassword();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePasswordResetRequest.fromJson(new ImmutablePasswordResetRequest.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePasswordResetRequest.Builder builderResult = ImmutablePasswordResetRequest.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePasswordResetRequest.Json());
  }
  @Test
  public void newPasswordTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePasswordResetRequest.Json()).newPassword();
  }
  @Test
  public void setCurrentPasswordTest() {
    // Arrange
    ImmutablePasswordResetRequest.Json json = new ImmutablePasswordResetRequest.Json();

    // Act
    json.setCurrentPassword("Password123");

    // Assert
    assertEquals("Password123", json.currentPassword);
  }
  @Test
  public void setNewPasswordTest() {
    // Arrange
    ImmutablePasswordResetRequest.Json json = new ImmutablePasswordResetRequest.Json();

    // Act
    json.setNewPassword("Password123");

    // Assert
    assertEquals("Password123", json.newPassword);
  }
  @Test
  public void setUserNameTest() {
    // Arrange
    ImmutablePasswordResetRequest.Json json = new ImmutablePasswordResetRequest.Json();

    // Act
    json.setUserName("username");

    // Assert
    assertEquals("username", json.userName);
  }
  @Test
  public void userNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePasswordResetRequest.Json()).userName();
  }
}


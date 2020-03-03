package com.khartec.waltz.model.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAuthenticationResponseDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAuthenticationResponse.fromJson(new ImmutableAuthenticationResponse.Json());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAuthenticationResponse.copyOf(new ImmutableAuthenticationResponse.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAuthenticationResponse.builder().build();
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableAuthenticationResponse.Builder builderResult = ImmutableAuthenticationResponse.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAuthenticationResponse.Json());
  }

  @Test
  public void setWaltzUserNameTest() {
    // Arrange
    ImmutableAuthenticationResponse.Json json = new ImmutableAuthenticationResponse.Json();

    // Act
    json.setWaltzUserName("username");

    // Assert
    assertEquals("username", json.waltzUserName);
  }

  @Test
  public void errorMessageTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthenticationResponse.Json()).errorMessage();
  }

  @Test
  public void waltzUserNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthenticationResponse.Json()).waltzUserName();
  }

  @Test
  public void setSuccessTest() {
    // Arrange
    ImmutableAuthenticationResponse.Json json = new ImmutableAuthenticationResponse.Json();

    // Act
    json.setSuccess(true);

    // Assert
    assertTrue(json.successIsSet);
    assertTrue(json.success);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAuthenticationResponse.Json actualJson = new ImmutableAuthenticationResponse.Json();

    // Assert
    assertNull(actualJson.waltzUserName);
    assertFalse(actualJson.successIsSet);
    assertNull(actualJson.errorMessage);
    assertFalse(actualJson.success);
  }

  @Test
  public void successTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthenticationResponse.Json()).success();
  }

  @Test
  public void setErrorMessageTest() {
    // Arrange
    ImmutableAuthenticationResponse.Json json = new ImmutableAuthenticationResponse.Json();

    // Act
    json.setErrorMessage("An error occurred");

    // Assert
    assertEquals("An error occurred", json.errorMessage);
  }
}


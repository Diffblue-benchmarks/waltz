package com.khartec.waltz.model.attestation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAttestationInstanceRecipientDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAttestationInstanceRecipient.copyOf(new ImmutableAttestationInstanceRecipient.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAttestationInstanceRecipient.fromJson(new ImmutableAttestationInstanceRecipient.Json());
  }
  @Test
  public void userIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationInstanceRecipient.Json()).userId();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationInstanceRecipient.Json()).id();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAttestationInstanceRecipient.Json actualJson = new ImmutableAttestationInstanceRecipient.Json();

    // Assert
    assertNull(actualJson.attestationInstance);
    assertNull(actualJson.userId);
  }
  @Test
  public void setUserIdTest() {
    // Arrange
    ImmutableAttestationInstanceRecipient.Json json = new ImmutableAttestationInstanceRecipient.Json();

    // Act
    json.setUserId("123");

    // Assert
    assertEquals("123", json.userId);
  }
  @Test
  public void attestationInstanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationInstanceRecipient.Json()).attestationInstance();
  }
  @Test
  public void setAttestationInstanceTest() {
    // Arrange
    ImmutableAttestationInstanceRecipient.Json json = new ImmutableAttestationInstanceRecipient.Json();
    ImmutableAttestationInstance.Json json1 = new ImmutableAttestationInstance.Json();

    // Act
    json.setAttestationInstance(json1);

    // Assert
    assertSame(json1, json.attestationInstance);
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAttestationInstanceRecipient.builder().build();
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableAttestationInstanceRecipient.Builder builderResult = ImmutableAttestationInstanceRecipient.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAttestationInstanceRecipient.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAttestationInstanceRecipient.Builder builderResult = ImmutableAttestationInstanceRecipient.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAttestationInstance.Json());
  }
}


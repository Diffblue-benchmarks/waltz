package com.khartec.waltz.model.attestation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.IdProvider;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAttestationInstanceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void attestationRunIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationInstance.Json()).attestationRunId();
  }

  @Test
  public void attestedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationInstance.Json()).attestedAt();
  }

  @Test
  public void attestedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationInstance.Json()).attestedBy();
  }

  @Test
  public void attestedEntityKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationInstance.Json()).attestedEntityKind();
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAttestationInstance.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAttestationInstance.Json actualJson = new ImmutableAttestationInstance.Json();

    // Assert
    Optional<Long> optional = actualJson.id;
    assertSame(optional, actualJson.attestedBy);
    assertSame(optional, actualJson.attestedAt);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAttestationInstance.copyOf(new ImmutableAttestationInstance.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAttestationInstance.fromJson(new ImmutableAttestationInstance.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableAttestationInstance.Builder builderResult = ImmutableAttestationInstance.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableAttestationInstance.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableAttestationInstance.Builder builderResult = ImmutableAttestationInstance.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAttestationInstance.Json());
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationInstance.Json()).id();
  }

  @Test
  public void parentEntityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationInstance.Json()).parentEntity();
  }

  @Test
  public void setAttestationRunIdTest() {
    // Arrange
    ImmutableAttestationInstance.Json json = new ImmutableAttestationInstance.Json();

    // Act
    json.setAttestationRunId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.attestationRunId);
  }

  @Test
  public void setAttestedEntityKindTest() {
    // Arrange
    ImmutableAttestationInstance.Json json = new ImmutableAttestationInstance.Json();

    // Act
    json.setAttestedEntityKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.attestedEntityKind);
  }
}


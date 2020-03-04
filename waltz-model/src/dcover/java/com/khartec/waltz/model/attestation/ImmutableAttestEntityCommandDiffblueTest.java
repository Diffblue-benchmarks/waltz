package com.khartec.waltz.model.attestation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.EntityKind;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAttestEntityCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void attestedEntityKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestEntityCommand.Json()).attestedEntityKind();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAttestEntityCommand.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAttestEntityCommand.Json actualJson = new ImmutableAttestEntityCommand.Json();

    // Assert
    assertNull(actualJson.attestedEntityKind);
    assertNull(actualJson.entityReference);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAttestEntityCommand.copyOf(new ImmutableAttestEntityCommand.Json());
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestEntityCommand.Json()).entityReference();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAttestEntityCommand.fromJson(new ImmutableAttestEntityCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAttestEntityCommand.Builder builderResult = ImmutableAttestEntityCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAttestEntityCommand.Json());
  }
  @Test
  public void setAttestedEntityKindTest() {
    // Arrange
    ImmutableAttestEntityCommand.Json json = new ImmutableAttestEntityCommand.Json();

    // Act
    json.setAttestedEntityKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.attestedEntityKind);
  }
}


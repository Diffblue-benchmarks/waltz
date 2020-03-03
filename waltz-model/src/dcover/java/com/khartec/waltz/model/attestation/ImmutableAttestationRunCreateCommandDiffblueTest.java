package com.khartec.waltz.model.attestation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.NameProvider;
import java.util.HashSet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAttestationRunCreateCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAttestationRunCreateCommand.copyOf(new ImmutableAttestationRunCreateCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAttestationRunCreateCommand.fromJson(new ImmutableAttestationRunCreateCommand.Json());
  }
  @Test
  public void dueDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRunCreateCommand.Json()).dueDate();
  }
  @Test
  public void attestedEntityIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRunCreateCommand.Json()).attestedEntityId();
  }
  @Test
  public void targetEntityKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRunCreateCommand.Json()).targetEntityKind();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRunCreateCommand.Json()).description();
  }
  @Test
  public void attestedEntityKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRunCreateCommand.Json()).attestedEntityKind();
  }
  @Test
  public void selectionOptionsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRunCreateCommand.Json()).selectionOptions();
  }
  @Test
  public void setAttestedEntityKindTest() {
    // Arrange
    ImmutableAttestationRunCreateCommand.Json json = new ImmutableAttestationRunCreateCommand.Json();

    // Act
    json.setAttestedEntityKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.attestedEntityKind);
  }
  @Test
  public void issuedOnTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRunCreateCommand.Json()).issuedOn();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableAttestationRunCreateCommand.Json json = new ImmutableAttestationRunCreateCommand.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRunCreateCommand.Json()).name();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableAttestationRunCreateCommand.Json json = new ImmutableAttestationRunCreateCommand.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void involvementKindIdsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRunCreateCommand.Json()).involvementKindIds();
  }
  @Test
  public void setInvolvementKindIdsTest() {
    // Arrange
    ImmutableAttestationRunCreateCommand.Json json = new ImmutableAttestationRunCreateCommand.Json();
    HashSet<Long> resultLongSet = new HashSet<Long>();
    resultLongSet.add(Long.valueOf(1L));

    // Act
    json.setInvolvementKindIds(resultLongSet);

    // Assert
    assertSame(resultLongSet, json.involvementKindIds);
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableAttestationRunCreateCommand.Json()).involvementKindIds.size());
  }
  @Test
  public void setTargetEntityKindTest() {
    // Arrange
    ImmutableAttestationRunCreateCommand.Json json = new ImmutableAttestationRunCreateCommand.Json();

    // Act
    json.setTargetEntityKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.targetEntityKind);
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableAttestationRunCreateCommand.Builder builderResult = ImmutableAttestationRunCreateCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableAttestationRun.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableAttestationRunCreateCommand.Builder builderResult = ImmutableAttestationRunCreateCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableAttestationRun.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAttestationRunCreateCommand.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAttestationRunCreateCommand.Builder builderResult = ImmutableAttestationRunCreateCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAttestationRunCreateCommand.Json());
  }
}


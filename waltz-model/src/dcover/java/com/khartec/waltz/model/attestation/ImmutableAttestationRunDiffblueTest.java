package com.khartec.waltz.model.attestation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.WaltzEntity;
import java.util.HashSet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAttestationRunDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAttestationRun.copyOf(new ImmutableAttestationRun.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAttestationRun.fromJson(new ImmutableAttestationRun.Json());
  }
  @Test
  public void dueDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRun.Json()).dueDate();
  }
  @Test
  public void targetEntityKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRun.Json()).targetEntityKind();
  }
  @Test
  public void attestedEntityKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRun.Json()).attestedEntityKind();
  }
  @Test
  public void selectionOptionsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRun.Json()).selectionOptions();
  }
  @Test
  public void issuedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRun.Json()).issuedBy();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRun.Json()).name();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableAttestationRun.Json json = new ImmutableAttestationRun.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setInvolvementKindIdsTest() {
    // Arrange
    ImmutableAttestationRun.Json json = new ImmutableAttestationRun.Json();
    HashSet<Long> resultLongSet = new HashSet<Long>();
    resultLongSet.add(Long.valueOf(1L));

    // Act
    json.setInvolvementKindIds(resultLongSet);

    // Assert
    assertSame(resultLongSet, json.involvementKindIds);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAttestationRun.Json actualJson = new ImmutableAttestationRun.Json();

    // Assert
    assertSame(actualJson.id, actualJson.attestedEntityRef);
    assertEquals(0, actualJson.involvementKindIds.size());
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRun.Json()).entityReference();
  }
  @Test
  public void attestedEntityRefTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRun.Json()).attestedEntityRef();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRun.Json()).description();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRun.Json()).id();
  }
  @Test
  public void setAttestedEntityKindTest() {
    // Arrange
    ImmutableAttestationRun.Json json = new ImmutableAttestationRun.Json();

    // Act
    json.setAttestedEntityKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.attestedEntityKind);
  }
  @Test
  public void issuedOnTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRun.Json()).issuedOn();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableAttestationRun.Json json = new ImmutableAttestationRun.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void involvementKindIdsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRun.Json()).involvementKindIds();
  }
  @Test
  public void setTargetEntityKindTest() {
    // Arrange
    ImmutableAttestationRun.Json json = new ImmutableAttestationRun.Json();

    // Act
    json.setTargetEntityKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.targetEntityKind);
  }
  @Test
  public void setIssuedByTest() {
    // Arrange
    ImmutableAttestationRun.Json json = new ImmutableAttestationRun.Json();

    // Act
    json.setIssuedBy("foo");

    // Assert
    assertEquals("foo", json.issuedBy);
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableAttestationRun.Builder builderResult = ImmutableAttestationRun.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAttestationRun.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableAttestationRun.Builder builderResult = ImmutableAttestationRun.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableAttestationRun.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAttestationRun.builder().build();
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableAttestationRun.Builder builderResult = ImmutableAttestationRun.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((WaltzEntity) new ImmutableAttestationRun.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableAttestationRun.Builder builderResult = ImmutableAttestationRun.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableAttestationRun.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAttestationRun.Builder builderResult = ImmutableAttestationRun.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAttestationInstance.Json());
  }
}


package com.khartec.waltz.model.actor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableActorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableActor.Json()).kind();
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableActor.Json json = new ImmutableActor.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableActor.Json()).description();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableActor.Json()).lastUpdatedBy();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableActor.Json()).provenance();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableActor.Json()).id();
  }
  @Test
  public void setIsExternalTest() {
    // Arrange
    ImmutableActor.Json json = new ImmutableActor.Json();

    // Act
    json.setIsExternal(true);

    // Assert
    assertTrue(json.isExternalIsSet);
    assertTrue(json.isExternal);
  }
  @Test
  public void isExternalTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableActor.Json()).isExternal();
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableActor.Json json = new ImmutableActor.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableActor.Json json = new ImmutableActor.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableActor.Json()).name();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableActor.Json()).lastUpdatedAt();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableActor.Json json = new ImmutableActor.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableActor.Json actualJson = new ImmutableActor.Json();

    // Assert
    assertNull(actualJson.lastUpdatedBy);
    assertFalse(actualJson.isExternalIsSet);
    assertNull(actualJson.name);
    assertNull(actualJson.provenance);
    assertFalse(actualJson.isExternal);
    assertNull(actualJson.description);
    assertNull(actualJson.kind);
    assertNull(actualJson.lastUpdatedAt);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableActor.Json json = new ImmutableActor.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableActor.copyOf(new ImmutableActor.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableActor.fromJson(new ImmutableActor.Json());
  }
  @Test
  public void fromTest7() {
    // Arrange
    ImmutableActor.Builder builderResult = ImmutableActor.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableActor.Json());
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutableActor.Builder builderResult = ImmutableActor.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableActor.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableActor.Builder builderResult = ImmutableActor.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableActor.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableActor.builder().build();
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableActor.Builder builderResult = ImmutableActor.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableActor.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableActor.Builder builderResult = ImmutableActor.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableActor.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableActor.Builder builderResult = ImmutableActor.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableActor.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableActor.Builder builderResult = ImmutableActor.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableActor.Json());
  }
}


package com.khartec.waltz.model.datatype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.CodeProvider;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.ParentIdProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableDataTypeDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableDataType.fromJson(new ImmutableDataType.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableDataType.copyOf(new ImmutableDataType.Json());
  }
  @Test
  public void fromTest7() {
    // Arrange
    ImmutableDataType.Builder builderResult = ImmutableDataType.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableDataType.Json());
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutableDataType.Builder builderResult = ImmutableDataType.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableDataType.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableDataType.Builder builderResult = ImmutableDataType.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableDataType.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableDataType.Builder builderResult = ImmutableDataType.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ParentIdProvider) new ImmutableDataType.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableDataType.builder().build();
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableDataType.Builder builderResult = ImmutableDataType.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableDataType.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableDataType.Builder builderResult = ImmutableDataType.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableDataType.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableDataType.Builder builderResult = ImmutableDataType.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((CodeProvider) new ImmutableDataType.Json());
  }
  @Test
  public void deprecatedTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDataType.Json()).deprecated();
  }
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDataType.Json()).kind();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDataType.Json()).description();
  }
  @Test
  public void concreteTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDataType.Json()).concrete();
  }
  @Test
  public void setConcreteTest() {
    // Arrange
    ImmutableDataType.Json json = new ImmutableDataType.Json();

    // Act
    json.setConcrete(true);

    // Assert
    assertTrue(json.concrete);
    assertTrue(json.concreteIsSet);
  }
  @Test
  public void setCodeTest() {
    // Arrange
    ImmutableDataType.Json json = new ImmutableDataType.Json();

    // Act
    json.setCode("foo");

    // Assert
    assertEquals("foo", json.code);
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDataType.Json()).id();
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableDataType.Json json = new ImmutableDataType.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void setUnknownTest() {
    // Arrange
    ImmutableDataType.Json json = new ImmutableDataType.Json();

    // Act
    json.setUnknown(true);

    // Assert
    assertTrue(json.unknown);
    assertTrue(json.unknownIsSet);
  }
  @Test
  public void setDeprecatedTest() {
    // Arrange
    ImmutableDataType.Json json = new ImmutableDataType.Json();

    // Act
    json.setDeprecated(true);

    // Assert
    assertTrue(json.deprecatedIsSet);
    assertTrue(json.deprecated);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableDataType.Json json = new ImmutableDataType.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDataType.Json()).name();
  }
  @Test
  public void codeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDataType.Json()).code();
  }
  @Test
  public void parentIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDataType.Json()).parentId();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableDataType.Json json = new ImmutableDataType.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableDataType.Json actualJson = new ImmutableDataType.Json();

    // Assert
    assertSame(actualJson.id, actualJson.parentId);
  }
  @Test
  public void unknownTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDataType.Json()).unknown();
  }
}


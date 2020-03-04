package com.khartec.waltz.model.entity_enum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.IconProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityEnumDefinitionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityEnumDefinition.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntityEnumDefinition.Json actualJson = new ImmutableEntityEnumDefinition.Json();

    // Assert
    assertFalse(actualJson.isEditable);
    assertFalse(actualJson.isEditableIsSet);
    assertFalse(actualJson.positionIsSet);
    assertNull(actualJson.enumValueType);
    assertEquals(0, actualJson.position);
    assertNull(actualJson.icon);
    assertNull(actualJson.entityKind);
    assertNull(actualJson.name);
    assertNull(actualJson.description);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityEnumDefinition.copyOf(new ImmutableEntityEnumDefinition.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityEnumDefinition.Json()).description();
  }
  @Test
  public void entityKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityEnumDefinition.Json()).entityKind();
  }
  @Test
  public void enumValueTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityEnumDefinition.Json()).enumValueType();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityEnumDefinition.fromJson(new ImmutableEntityEnumDefinition.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityEnumDefinition.Builder builderResult = ImmutableEntityEnumDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableEntityEnumDefinition.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableEntityEnumDefinition.Builder builderResult = ImmutableEntityEnumDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableEntityEnumDefinition.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableEntityEnumDefinition.Builder builderResult = ImmutableEntityEnumDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityEnumDefinition.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableEntityEnumDefinition.Builder builderResult = ImmutableEntityEnumDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableEntityEnumDefinition.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableEntityEnumDefinition.Builder builderResult = ImmutableEntityEnumDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IconProvider) new ImmutableEntityEnumDefinition.Json());
  }
  @Test
  public void iconTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityEnumDefinition.Json()).icon();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityEnumDefinition.Json()).id();
  }
  @Test
  public void isEditableTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityEnumDefinition.Json()).isEditable();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityEnumDefinition.Json()).name();
  }
  @Test
  public void positionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityEnumDefinition.Json()).position();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableEntityEnumDefinition.Json json = new ImmutableEntityEnumDefinition.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setEntityKindTest() {
    // Arrange
    ImmutableEntityEnumDefinition.Json json = new ImmutableEntityEnumDefinition.Json();

    // Act
    json.setEntityKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.entityKind);
  }
  @Test
  public void setEnumValueTypeTest() {
    // Arrange
    ImmutableEntityEnumDefinition.Json json = new ImmutableEntityEnumDefinition.Json();

    // Act
    json.setEnumValueType("enumValueType");

    // Assert
    assertEquals("enumValueType", json.enumValueType);
  }
  @Test
  public void setIconTest() {
    // Arrange
    ImmutableEntityEnumDefinition.Json json = new ImmutableEntityEnumDefinition.Json();

    // Act
    json.setIcon("icon");

    // Assert
    assertEquals("icon", json.icon);
  }
  @Test
  public void setIsEditableTest() {
    // Arrange
    ImmutableEntityEnumDefinition.Json json = new ImmutableEntityEnumDefinition.Json();

    // Act
    json.setIsEditable(true);

    // Assert
    assertTrue(json.isEditable);
    assertTrue(json.isEditableIsSet);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableEntityEnumDefinition.Json json = new ImmutableEntityEnumDefinition.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setPositionTest() {
    // Arrange
    ImmutableEntityEnumDefinition.Json json = new ImmutableEntityEnumDefinition.Json();

    // Act
    json.setPosition(1);

    // Assert
    assertTrue(json.positionIsSet);
    assertEquals(1, json.position);
  }
}


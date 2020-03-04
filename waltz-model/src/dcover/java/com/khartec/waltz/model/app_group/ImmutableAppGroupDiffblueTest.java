package com.khartec.waltz.model.app_group;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.IsRemovedProvider;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAppGroupDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void appGroupKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppGroup.Json()).appGroupKind();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAppGroup.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAppGroup.Json actualJson = new ImmutableAppGroup.Json();

    // Assert
    assertSame(actualJson.externalId, actualJson.id);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAppGroup.copyOf(new ImmutableAppGroup.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppGroup.Json()).description();
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppGroup.Json()).externalId();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAppGroup.fromJson(new ImmutableAppGroup.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAppGroup.Builder builderResult = ImmutableAppGroup.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableAppGroup.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableAppGroup.Builder builderResult = ImmutableAppGroup.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableAppGroup.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableAppGroup.Builder builderResult = ImmutableAppGroup.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IsRemovedProvider) new ImmutableAppGroup.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableAppGroup.Builder builderResult = ImmutableAppGroup.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableAppGroup.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableAppGroup.Builder builderResult = ImmutableAppGroup.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableAppGroup.Json());
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutableAppGroup.Builder builderResult = ImmutableAppGroup.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAppGroup.Json());
  }
  @Test
  public void fromTest7() {
    // Arrange
    ImmutableAppGroup.Builder builderResult = ImmutableAppGroup.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableAppGroup.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppGroup.Json()).id();
  }
  @Test
  public void isRemovedTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppGroup.Json()).isRemoved();
  }
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppGroup.Json()).kind();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppGroup.Json()).name();
  }
  @Test
  public void setAppGroupKindTest() {
    // Arrange
    ImmutableAppGroup.Json json = new ImmutableAppGroup.Json();

    // Act
    json.setAppGroupKind(AppGroupKind.PUBLIC);

    // Assert
    assertEquals(AppGroupKind.PUBLIC, json.appGroupKind);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableAppGroup.Json json = new ImmutableAppGroup.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setIsRemovedTest() {
    // Arrange
    ImmutableAppGroup.Json json = new ImmutableAppGroup.Json();

    // Act
    json.setIsRemoved(true);

    // Assert
    assertTrue(json.isRemoved);
    assertTrue(json.isRemovedIsSet);
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableAppGroup.Json json = new ImmutableAppGroup.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableAppGroup.Json json = new ImmutableAppGroup.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
}


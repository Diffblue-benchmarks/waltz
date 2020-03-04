package com.khartec.waltz.model.orgunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.ParentIdProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableOrganisationalUnitDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableOrganisationalUnit.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableOrganisationalUnit.Json actualJson = new ImmutableOrganisationalUnit.Json();

    // Assert
    assertSame(actualJson.parentId, actualJson.id);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableOrganisationalUnit.copyOf(new ImmutableOrganisationalUnit.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableOrganisationalUnit.Json()).description();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableOrganisationalUnit.fromJson(new ImmutableOrganisationalUnit.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableOrganisationalUnit.Builder builderResult = ImmutableOrganisationalUnit.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableOrganisationalUnit.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableOrganisationalUnit.Builder builderResult = ImmutableOrganisationalUnit.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableOrganisationalUnit.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableOrganisationalUnit.Builder builderResult = ImmutableOrganisationalUnit.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableOrganisationalUnit.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableOrganisationalUnit.Builder builderResult = ImmutableOrganisationalUnit.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ParentIdProvider) new ImmutableOrganisationalUnit.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableOrganisationalUnit.Builder builderResult = ImmutableOrganisationalUnit.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableOrganisationalUnit.Json());
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutableOrganisationalUnit.Builder builderResult = ImmutableOrganisationalUnit.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableOrganisationalUnit.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableOrganisationalUnit.Json()).id();
  }
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableOrganisationalUnit.Json()).kind();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableOrganisationalUnit.Json()).name();
  }
  @Test
  public void parentIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableOrganisationalUnit.Json()).parentId();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableOrganisationalUnit.Json json = new ImmutableOrganisationalUnit.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableOrganisationalUnit.Json json = new ImmutableOrganisationalUnit.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableOrganisationalUnit.Json json = new ImmutableOrganisationalUnit.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
}


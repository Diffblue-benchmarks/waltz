package com.khartec.waltz.model.involvement_kind;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableInvolvementKindDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableInvolvementKind.fromJson(new ImmutableInvolvementKind.Json());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableInvolvementKind.copyOf(new ImmutableInvolvementKind.Json());
  }

  @Test
  public void fromTest5() {
    // Arrange
    ImmutableInvolvementKind.Builder builderResult = ImmutableInvolvementKind.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableInvolvementKind.Json());
  }

  @Test
  public void fromTest4() {
    // Arrange
    ImmutableInvolvementKind.Builder builderResult = ImmutableInvolvementKind.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableInvolvementKind.Json());
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableInvolvementKind.Builder builderResult = ImmutableInvolvementKind.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableInvolvementKind.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableInvolvementKind.builder().build();
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableInvolvementKind.Builder builderResult = ImmutableInvolvementKind.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableInvolvementKind.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableInvolvementKind.Builder builderResult = ImmutableInvolvementKind.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableInvolvementKind.Json());
  }

  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableInvolvementKind.Json json = new ImmutableInvolvementKind.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }

  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableInvolvementKind.Json json = new ImmutableInvolvementKind.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }

  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableInvolvementKind.Json()).name();
  }

  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableInvolvementKind.Json()).description();
  }

  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableInvolvementKind.Json()).lastUpdatedBy();
  }

  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableInvolvementKind.Json()).lastUpdatedAt();
  }

  @Test
  public void setNameTest() {
    // Arrange
    ImmutableInvolvementKind.Json json = new ImmutableInvolvementKind.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableInvolvementKind.Json()).id();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableInvolvementKind.Json actualJson = new ImmutableInvolvementKind.Json();

    // Assert
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.description);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.name);
  }
}


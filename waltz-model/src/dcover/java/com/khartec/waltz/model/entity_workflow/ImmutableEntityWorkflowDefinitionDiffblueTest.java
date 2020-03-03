package com.khartec.waltz.model.entity_workflow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityWorkflowDefinitionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityWorkflowDefinition.copyOf(new ImmutableEntityWorkflowDefinition.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityWorkflowDefinition.fromJson(new ImmutableEntityWorkflowDefinition.Json());
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableEntityWorkflowDefinition.Json json = new ImmutableEntityWorkflowDefinition.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowDefinition.Json()).name();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowDefinition.Json()).description();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableEntityWorkflowDefinition.Json json = new ImmutableEntityWorkflowDefinition.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowDefinition.Json()).id();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntityWorkflowDefinition.Json actualJson = new ImmutableEntityWorkflowDefinition.Json();

    // Assert
    assertNull(actualJson.description);
    assertNull(actualJson.name);
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableEntityWorkflowDefinition.Builder builderResult = ImmutableEntityWorkflowDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableEntityWorkflowDefinition.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableEntityWorkflowDefinition.Builder builderResult = ImmutableEntityWorkflowDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableEntityWorkflowDefinition.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableEntityWorkflowDefinition.Builder builderResult = ImmutableEntityWorkflowDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableEntityWorkflowDefinition.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityWorkflowDefinition.Builder builderResult = ImmutableEntityWorkflowDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityWorkflowDefinition.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityWorkflowDefinition.builder().build();
  }
}


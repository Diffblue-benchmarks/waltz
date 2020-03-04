package com.khartec.waltz.model.physical_specification_definition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.ReleaseLifecycleStatus;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalSpecDefinitionChangeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecDefinitionChangeCommand.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalSpecDefinitionChangeCommand.Json actualJson = new ImmutablePhysicalSpecDefinitionChangeCommand.Json();

    // Assert
    Optional<String> optional = actualJson.delimiter;
    assertSame(actualJson.id, optional);
    assertSame(optional, actualJson.id);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalSpecDefinitionChangeCommand.copyOf(new ImmutablePhysicalSpecDefinitionChangeCommand.Json());
  }
  @Test
  public void delimiterTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionChangeCommand.Json()).delimiter();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecDefinitionChangeCommand.fromJson(new ImmutablePhysicalSpecDefinitionChangeCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionChangeCommand.Builder builderResult = ImmutablePhysicalSpecDefinitionChangeCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalSpecDefinition.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutablePhysicalSpecDefinitionChangeCommand.Builder builderResult = ImmutablePhysicalSpecDefinitionChangeCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalSpecDefinitionChangeCommand.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionChangeCommand.Json()).id();
  }
  @Test
  public void setStatusTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionChangeCommand.Json json = new ImmutablePhysicalSpecDefinitionChangeCommand.Json();

    // Act
    json.setStatus(ReleaseLifecycleStatus.DRAFT);

    // Assert
    assertEquals(ReleaseLifecycleStatus.DRAFT, json.status);
  }
  @Test
  public void setTypeTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionChangeCommand.Json json = new ImmutablePhysicalSpecDefinitionChangeCommand.Json();

    // Act
    json.setType(PhysicalSpecDefinitionType.DELIMITED);

    // Assert
    assertEquals(PhysicalSpecDefinitionType.DELIMITED, json.type);
  }
  @Test
  public void setVersionTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionChangeCommand.Json json = new ImmutablePhysicalSpecDefinitionChangeCommand.Json();

    // Act
    json.setVersion("version");

    // Assert
    assertEquals("version", json.version);
  }
  @Test
  public void statusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionChangeCommand.Json()).status();
  }
  @Test
  public void typeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionChangeCommand.Json()).type();
  }
  @Test
  public void versionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionChangeCommand.Json()).version();
  }
}


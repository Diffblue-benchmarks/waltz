package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableReleaseLifecycleStatusChangeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableReleaseLifecycleStatusChangeCommand.copyOf(new ImmutableReleaseLifecycleStatusChangeCommand.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableReleaseLifecycleStatusChangeCommand.fromJson(new ImmutableReleaseLifecycleStatusChangeCommand.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableReleaseLifecycleStatusChangeCommand.builder().build();
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableReleaseLifecycleStatusChangeCommand.Builder builderResult = ImmutableReleaseLifecycleStatusChangeCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableReleaseLifecycleStatusChangeCommand.Json());
  }

  @Test
  public void newStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableReleaseLifecycleStatusChangeCommand.Json()).newStatus();
  }

  @Test
  public void setNewStatusTest() {
    // Arrange
    ImmutableReleaseLifecycleStatusChangeCommand.Json json = new ImmutableReleaseLifecycleStatusChangeCommand.Json();

    // Act
    json.setNewStatus(ReleaseLifecycleStatus.DRAFT);

    // Assert
    assertEquals(ReleaseLifecycleStatus.DRAFT, json.newStatus);
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ImmutableReleaseLifecycleStatusChangeCommand.Json()).newStatus);
  }
}


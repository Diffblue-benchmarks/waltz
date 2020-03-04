package com.khartec.waltz.model.system.job_log;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableJobLogDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableJobLog.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableJobLog.Json actualJson = new ImmutableJobLog.Json();

    // Assert
    assertNull(actualJson.entityKind);
    assertNull(actualJson.description);
    assertNull(actualJson.start);
    assertNull(actualJson.name);
    assertNull(actualJson.status);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableJobLog.copyOf(new ImmutableJobLog.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableJobLog.Json()).description();
  }
  @Test
  public void endTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableJobLog.Json()).end();
  }
  @Test
  public void entityKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableJobLog.Json()).entityKind();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableJobLog.fromJson(new ImmutableJobLog.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableJobLog.Builder builderResult = ImmutableJobLog.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableJobLog.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableJobLog.Builder builderResult = ImmutableJobLog.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableJobLog.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableJobLog.Builder builderResult = ImmutableJobLog.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableJobLog.Json());
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableJobLog.Json()).name();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableJobLog.Json json = new ImmutableJobLog.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setEntityKindTest() {
    // Arrange
    ImmutableJobLog.Json json = new ImmutableJobLog.Json();

    // Act
    json.setEntityKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.entityKind);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableJobLog.Json json = new ImmutableJobLog.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setStatusTest() {
    // Arrange
    ImmutableJobLog.Json json = new ImmutableJobLog.Json();

    // Act
    json.setStatus(JobStatus.SUCCESS);

    // Assert
    assertEquals(JobStatus.SUCCESS, json.status);
  }
  @Test
  public void startTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableJobLog.Json()).start();
  }
  @Test
  public void statusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableJobLog.Json()).status();
  }
}


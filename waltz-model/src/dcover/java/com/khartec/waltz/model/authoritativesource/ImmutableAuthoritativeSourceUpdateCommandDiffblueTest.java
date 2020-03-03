package com.khartec.waltz.model.authoritativesource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.rating.AuthoritativenessRating;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAuthoritativeSourceUpdateCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAuthoritativeSourceUpdateCommand.copyOf(new ImmutableAuthoritativeSourceUpdateCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAuthoritativeSourceUpdateCommand.fromJson(new ImmutableAuthoritativeSourceUpdateCommand.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAuthoritativeSourceUpdateCommand.builder().build();
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableAuthoritativeSourceUpdateCommand.Builder builderResult = ImmutableAuthoritativeSourceUpdateCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAuthoritativeSourceUpdateCommand.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableAuthoritativeSourceUpdateCommand.Builder builderResult = ImmutableAuthoritativeSourceUpdateCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableAuthoritativeSource.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAuthoritativeSourceUpdateCommand.Builder builderResult = ImmutableAuthoritativeSourceUpdateCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableAuthoritativeSource.Json());
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableAuthoritativeSourceUpdateCommand.Json json = new ImmutableAuthoritativeSourceUpdateCommand.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeSourceUpdateCommand.Json()).description();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeSourceUpdateCommand.Json()).id();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAuthoritativeSourceUpdateCommand.Json actualJson = new ImmutableAuthoritativeSourceUpdateCommand.Json();

    // Assert
    assertNull(actualJson.description);
    assertNull(actualJson.rating);
  }
  @Test
  public void setRatingTest() {
    // Arrange
    ImmutableAuthoritativeSourceUpdateCommand.Json json = new ImmutableAuthoritativeSourceUpdateCommand.Json();

    // Act
    json.setRating(AuthoritativenessRating.PRIMARY);

    // Assert
    assertEquals(AuthoritativenessRating.PRIMARY, json.rating);
  }
  @Test
  public void ratingTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeSourceUpdateCommand.Json()).rating();
  }
}


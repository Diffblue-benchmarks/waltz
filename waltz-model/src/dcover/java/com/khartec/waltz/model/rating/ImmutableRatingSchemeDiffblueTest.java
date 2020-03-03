package com.khartec.waltz.model.rating;

import static org.junit.Assert.assertEquals;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableRatingSchemeDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromTest4() {
    // Arrange
    ImmutableRatingScheme.Builder builderResult = ImmutableRatingScheme.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableRagName.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableRatingScheme.builder().build();
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableRatingScheme.Builder builderResult = ImmutableRatingScheme.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableRatingScheme.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableRatingScheme.Builder builderResult = ImmutableRatingScheme.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableRagName.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableRatingScheme.Builder builderResult = ImmutableRatingScheme.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableRagName.Json());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableRatingScheme.copyOf(new ImmutableRatingScheme.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableRatingScheme.fromJson(new ImmutableRatingScheme.Json());
  }

  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableRatingScheme.Json json = new ImmutableRatingScheme.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }

  @Test
  public void ratingsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRatingScheme.Json()).ratings();
  }

  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRatingScheme.Json()).name();
  }

  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRatingScheme.Json()).description();
  }

  @Test
  public void setNameTest() {
    // Arrange
    ImmutableRatingScheme.Json json = new ImmutableRatingScheme.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRatingScheme.Json()).id();
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableRatingScheme.Json()).ratings.size());
  }
}


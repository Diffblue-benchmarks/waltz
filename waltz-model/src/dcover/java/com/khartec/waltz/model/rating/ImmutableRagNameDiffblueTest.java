package com.khartec.waltz.model.rating;

import static org.junit.Assert.assertEquals;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.PositionProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableRagNameDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableRagName.builder().build();
  }
  @Test
  public void colorTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRagName.Json()).color();
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableRagName.copyOf(new ImmutableRagName.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRagName.Json()).description();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableRagName.fromJson(new ImmutableRagName.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableRagName.Builder builderResult = ImmutableRagName.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableRagName.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableRagName.Builder builderResult = ImmutableRagName.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((PositionProvider) new ImmutableRagName.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableRagName.Builder builderResult = ImmutableRagName.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableRagName.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableRagName.Builder builderResult = ImmutableRagName.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableRagName.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableRagName.Builder builderResult = ImmutableRagName.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableRagName.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRagName.Json()).id();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRagName.Json()).name();
  }
  @Test
  public void positionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRagName.Json()).position();
  }
  @Test
  public void ratingSchemeIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRagName.Json()).ratingSchemeId();
  }
  @Test
  public void ratingTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRagName.Json()).rating();
  }
  @Test
  public void setRatingTest() {
    // Arrange
    ImmutableRagName.Json json = new ImmutableRagName.Json();

    // Act
    json.setRating(Character.valueOf('A'));

    // Assert
    assertEquals(Character.valueOf('A'), json.rating);
  }
  @Test
  public void userSelectableTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRagName.Json()).userSelectable();
  }
}


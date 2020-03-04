package com.khartec.waltz.model.data_flow_decorator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.rating.AuthoritativenessRating;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableDecoratorRatingSummaryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableDecoratorRatingSummary.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableDecoratorRatingSummary.Json actualJson = new ImmutableDecoratorRatingSummary.Json();

    // Assert
    assertFalse(actualJson.countIsSet);
    assertNull(actualJson.decoratorEntityReference);
    assertEquals(0, actualJson.count);
    assertNull(actualJson.rating);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableDecoratorRatingSummary.copyOf(new ImmutableDecoratorRatingSummary.Json());
  }
  @Test
  public void countTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDecoratorRatingSummary.Json()).count();
  }
  @Test
  public void decoratorEntityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDecoratorRatingSummary.Json()).decoratorEntityReference();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableDecoratorRatingSummary.fromJson(new ImmutableDecoratorRatingSummary.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableDecoratorRatingSummary.Builder builderResult = ImmutableDecoratorRatingSummary.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableDecoratorRatingSummary.Json());
  }
  @Test
  public void ratingTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDecoratorRatingSummary.Json()).rating();
  }
  @Test
  public void setCountTest() {
    // Arrange
    ImmutableDecoratorRatingSummary.Json json = new ImmutableDecoratorRatingSummary.Json();

    // Act
    json.setCount(3);

    // Assert
    assertTrue(json.countIsSet);
    assertEquals(3, json.count);
  }
  @Test
  public void setRatingTest() {
    // Arrange
    ImmutableDecoratorRatingSummary.Json json = new ImmutableDecoratorRatingSummary.Json();

    // Act
    json.setRating(AuthoritativenessRating.PRIMARY);

    // Assert
    assertEquals(AuthoritativenessRating.PRIMARY, json.rating);
  }
}


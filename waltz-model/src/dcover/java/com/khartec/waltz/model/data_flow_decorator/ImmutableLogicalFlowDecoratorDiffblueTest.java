package com.khartec.waltz.model.data_flow_decorator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.rating.AuthoritativenessRating;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableLogicalFlowDecoratorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableLogicalFlowDecorator.Builder builderResult = ImmutableLogicalFlowDecorator.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableLogicalFlowDecorator.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableLogicalFlowDecorator.Builder builderResult = ImmutableLogicalFlowDecorator.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableLogicalFlowDecorator.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableLogicalFlowDecorator.Builder builderResult = ImmutableLogicalFlowDecorator.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableLogicalFlowDecorator.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLogicalFlowDecorator.builder().build();
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableLogicalFlowDecorator.copyOf(new ImmutableLogicalFlowDecorator.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLogicalFlowDecorator.fromJson(new ImmutableLogicalFlowDecorator.Json());
  }

  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableLogicalFlowDecorator.Json json = new ImmutableLogicalFlowDecorator.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }

  @Test
  public void setDataFlowIdTest() {
    // Arrange
    ImmutableLogicalFlowDecorator.Json json = new ImmutableLogicalFlowDecorator.Json();

    // Act
    json.setDataFlowId(123L);

    // Assert
    assertEquals(123L, json.dataFlowId);
    assertTrue(json.dataFlowIdIsSet);
  }

  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlowDecorator.Json()).lastUpdatedBy();
  }

  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlowDecorator.Json()).provenance();
  }

  @Test
  public void setRatingTest() {
    // Arrange
    ImmutableLogicalFlowDecorator.Json json = new ImmutableLogicalFlowDecorator.Json();

    // Act
    json.setRating(AuthoritativenessRating.PRIMARY);

    // Assert
    assertEquals(AuthoritativenessRating.PRIMARY, json.rating);
  }

  @Test
  public void decoratorEntityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlowDecorator.Json()).decoratorEntity();
  }

  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlowDecorator.Json()).lastUpdatedAt();
  }

  @Test
  public void dataFlowIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlowDecorator.Json()).dataFlowId();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableLogicalFlowDecorator.Json actualJson = new ImmutableLogicalFlowDecorator.Json();

    // Assert
    assertEquals(0L, actualJson.dataFlowId);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.provenance);
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.rating);
    assertFalse(actualJson.dataFlowIdIsSet);
    assertNull(actualJson.decoratorEntity);
  }

  @Test
  public void ratingTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlowDecorator.Json()).rating();
  }

  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableLogicalFlowDecorator.Json json = new ImmutableLogicalFlowDecorator.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
}


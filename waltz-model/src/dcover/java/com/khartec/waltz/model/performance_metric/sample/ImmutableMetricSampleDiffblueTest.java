package com.khartec.waltz.model.performance_metric.sample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableMetricSampleDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableMetricSample.copyOf(new ImmutableMetricSample.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMetricSample.fromJson(new ImmutableMetricSample.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableMetricSample.Builder builderResult = ImmutableMetricSample.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableMetricSample.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMetricSample.builder().build();
  }

  @Test
  public void createdByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMetricSample.Json()).createdBy();
  }

  @Test
  public void setMetricIdTest() {
    // Arrange
    ImmutableMetricSample.Json json = new ImmutableMetricSample.Json();

    // Act
    json.setMetricId(123L);

    // Assert
    assertEquals(123L, json.metricId);
    assertTrue(json.metricIdIsSet);
  }

  @Test
  public void setCreatedByTest() {
    // Arrange
    ImmutableMetricSample.Json json = new ImmutableMetricSample.Json();

    // Act
    json.setCreatedBy("foo");

    // Assert
    assertEquals("foo", json.createdBy);
  }

  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMetricSample.Json()).provenance();
  }

  @Test
  public void metricIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMetricSample.Json()).metricId();
  }

  @Test
  public void sampleTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMetricSample.Json()).sampleType();
  }

  @Test
  public void collectionDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMetricSample.Json()).collectionDate();
  }

  @Test
  public void setSampleTypeTest() {
    // Arrange
    ImmutableMetricSample.Json json = new ImmutableMetricSample.Json();

    // Act
    json.setSampleType(SampleType.MANUAL);

    // Assert
    assertEquals(SampleType.MANUAL, json.sampleType);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableMetricSample.Json actualJson = new ImmutableMetricSample.Json();

    // Assert
    assertNull(actualJson.effectiveDate);
    assertEquals(0L, actualJson.metricId);
    assertNull(actualJson.createdBy);
    assertNull(actualJson.provenance);
    assertNull(actualJson.sampleType);
    assertFalse(actualJson.metricIdIsSet);
    assertNull(actualJson.collectionDate);
  }

  @Test
  public void effectiveDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMetricSample.Json()).effectiveDate();
  }

  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableMetricSample.Json json = new ImmutableMetricSample.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
}


package com.khartec.waltz.model.performance_metric.pack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.checkpoint.Checkpoint;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableMetricPackDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMetricPack.builder().build();
  }
  @Test
  public void checkpointsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMetricPack.Json()).checkpoints();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableMetricPack.Json actualJson = new ImmutableMetricPack.Json();

    // Assert
    List<Checkpoint> actualCheckpointList = actualJson.checkpoints;
    List<MetricPackItem> actualMetricPackItemList = actualJson.items;
    List<EntityReference> entityReferenceList = actualJson.relatedReferences;
    assertEquals(0, entityReferenceList.size());
    assertSame(entityReferenceList, actualCheckpointList);
    assertSame(entityReferenceList, actualMetricPackItemList);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableMetricPack.copyOf(new ImmutableMetricPack.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMetricPack.Json()).description();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMetricPack.fromJson(new ImmutableMetricPack.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableMetricPack.Builder builderResult = ImmutableMetricPack.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableMetricPack.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableMetricPack.Builder builderResult = ImmutableMetricPack.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableMetricPack.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableMetricPack.Builder builderResult = ImmutableMetricPack.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableMetricPack.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableMetricPack.Builder builderResult = ImmutableMetricPack.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableMetricPack.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMetricPack.Json()).id();
  }
  @Test
  public void itemsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMetricPack.Json()).items();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMetricPack.Json()).name();
  }
  @Test
  public void relatedReferencesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMetricPack.Json()).relatedReferences();
  }
  @Test
  public void setCheckpointsTest() {
    // Arrange
    ImmutableMetricPack.Json json = new ImmutableMetricPack.Json();
    ArrayList<Checkpoint> checkpointList = new ArrayList<Checkpoint>();
    checkpointList.add(null);

    // Act
    json.setCheckpoints(checkpointList);

    // Assert
    assertSame(checkpointList, json.checkpoints);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableMetricPack.Json json = new ImmutableMetricPack.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setItemsTest() {
    // Arrange
    ImmutableMetricPack.Json json = new ImmutableMetricPack.Json();
    ArrayList<MetricPackItem> metricPackItemList = new ArrayList<MetricPackItem>();
    metricPackItemList.add(new ImmutableMetricPackItem.Json());

    // Act
    json.setItems(metricPackItemList);

    // Assert
    assertSame(metricPackItemList, json.items);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableMetricPack.Json json = new ImmutableMetricPack.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setRelatedReferencesTest() {
    // Arrange
    ImmutableMetricPack.Json json = new ImmutableMetricPack.Json();
    ArrayList<EntityReference> entityReferenceList = new ArrayList<EntityReference>();
    entityReferenceList.add(null);

    // Act
    json.setRelatedReferences(entityReferenceList);

    // Assert
    assertSame(entityReferenceList, json.relatedReferences);
  }
}


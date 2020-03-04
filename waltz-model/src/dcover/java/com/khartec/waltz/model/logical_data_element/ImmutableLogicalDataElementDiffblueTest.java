package com.khartec.waltz.model.logical_data_element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.EntityLifecycleStatus;
import com.khartec.waltz.model.EntityLifecycleStatusProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.FieldDataType;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableLogicalDataElementDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLogicalDataElement.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableLogicalDataElement.Json actualJson = new ImmutableLogicalDataElement.Json();

    // Assert
    assertSame(actualJson.id, actualJson.externalId);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableLogicalDataElement.copyOf(new ImmutableLogicalDataElement.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalDataElement.Json()).description();
  }
  @Test
  public void entityLifecycleStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalDataElement.Json()).entityLifecycleStatus();
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalDataElement.Json()).externalId();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLogicalDataElement.fromJson(new ImmutableLogicalDataElement.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableLogicalDataElement.Builder builderResult = ImmutableLogicalDataElement.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableLogicalDataElement.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableLogicalDataElement.Builder builderResult = ImmutableLogicalDataElement.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableLogicalDataElement.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableLogicalDataElement.Builder builderResult = ImmutableLogicalDataElement.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableLogicalDataElement.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableLogicalDataElement.Builder builderResult = ImmutableLogicalDataElement.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableLogicalDataElement.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableLogicalDataElement.Builder builderResult = ImmutableLogicalDataElement.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityLifecycleStatusProvider) new ImmutableLogicalDataElement.Json());
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutableLogicalDataElement.Builder builderResult = ImmutableLogicalDataElement.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableLogicalDataElement.Json());
  }
  @Test
  public void fromTest7() {
    // Arrange
    ImmutableLogicalDataElement.Builder builderResult = ImmutableLogicalDataElement.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableLogicalDataElement.Json());
  }
  @Test
  public void fromTest8() {
    // Arrange
    ImmutableLogicalDataElement.Builder builderResult = ImmutableLogicalDataElement.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableLogicalDataElement.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalDataElement.Json()).id();
  }
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalDataElement.Json()).kind();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalDataElement.Json()).name();
  }
  @Test
  public void parentDataTypeIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalDataElement.Json()).parentDataTypeId();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalDataElement.Json()).provenance();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableLogicalDataElement.Json json = new ImmutableLogicalDataElement.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setEntityLifecycleStatusTest() {
    // Arrange
    ImmutableLogicalDataElement.Json json = new ImmutableLogicalDataElement.Json();

    // Act
    json.setEntityLifecycleStatus(EntityLifecycleStatus.ACTIVE);

    // Assert
    assertEquals(EntityLifecycleStatus.ACTIVE, json.entityLifecycleStatus);
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableLogicalDataElement.Json json = new ImmutableLogicalDataElement.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableLogicalDataElement.Json json = new ImmutableLogicalDataElement.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setParentDataTypeIdTest() {
    // Arrange
    ImmutableLogicalDataElement.Json json = new ImmutableLogicalDataElement.Json();

    // Act
    json.setParentDataTypeId(123L);

    // Assert
    assertEquals(123L, json.parentDataTypeId);
    assertTrue(json.parentDataTypeIdIsSet);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableLogicalDataElement.Json json = new ImmutableLogicalDataElement.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }
  @Test
  public void setTypeTest() {
    // Arrange
    ImmutableLogicalDataElement.Json json = new ImmutableLogicalDataElement.Json();

    // Act
    json.setType(FieldDataType.DATE);

    // Assert
    assertEquals(FieldDataType.DATE, json.type);
  }
  @Test
  public void typeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalDataElement.Json()).type();
  }
}


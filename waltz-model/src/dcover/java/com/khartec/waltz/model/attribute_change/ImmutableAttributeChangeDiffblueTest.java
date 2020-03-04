package com.khartec.waltz.model.attribute_change;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAttributeChangeDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAttributeChange.builder().build();
  }
  @Test
  public void changeUnitIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttributeChange.Json()).changeUnitId();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAttributeChange.Json actualJson = new ImmutableAttributeChange.Json();

    // Assert
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.oldValue);
    assertEquals(0L, actualJson.changeUnitId);
    assertNull(actualJson.newValue);
    assertFalse(actualJson.changeUnitIdIsSet);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.provenance);
    assertNull(actualJson.type);
    assertNull(actualJson.name);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAttributeChange.copyOf(new ImmutableAttributeChange.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAttributeChange.fromJson(new ImmutableAttributeChange.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAttributeChange.Builder builderResult = ImmutableAttributeChange.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAttributeChange.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableAttributeChange.Builder builderResult = ImmutableAttributeChange.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableAttributeChange.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableAttributeChange.Builder builderResult = ImmutableAttributeChange.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableAttributeChange.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableAttributeChange.Builder builderResult = ImmutableAttributeChange.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableAttributeChange.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableAttributeChange.Builder builderResult = ImmutableAttributeChange.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableAttributeChange.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttributeChange.Json()).id();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttributeChange.Json()).lastUpdatedAt();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttributeChange.Json()).lastUpdatedBy();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttributeChange.Json()).name();
  }
  @Test
  public void newValueTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttributeChange.Json()).newValue();
  }
  @Test
  public void oldValueTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttributeChange.Json()).oldValue();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttributeChange.Json()).provenance();
  }
  @Test
  public void setChangeUnitIdTest() {
    // Arrange
    ImmutableAttributeChange.Json json = new ImmutableAttributeChange.Json();

    // Act
    json.setChangeUnitId(123L);

    // Assert
    assertEquals(123L, json.changeUnitId);
    assertTrue(json.changeUnitIdIsSet);
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableAttributeChange.Json json = new ImmutableAttributeChange.Json();

    // Act
    json.setLastUpdatedBy("lastUpdatedBy");

    // Assert
    assertEquals("lastUpdatedBy", json.lastUpdatedBy);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableAttributeChange.Json json = new ImmutableAttributeChange.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setNewValueTest() {
    // Arrange
    ImmutableAttributeChange.Json json = new ImmutableAttributeChange.Json();

    // Act
    json.setNewValue("newValue");

    // Assert
    assertEquals("newValue", json.newValue);
  }
  @Test
  public void setOldValueTest() {
    // Arrange
    ImmutableAttributeChange.Json json = new ImmutableAttributeChange.Json();

    // Act
    json.setOldValue("oldValue");

    // Assert
    assertEquals("oldValue", json.oldValue);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableAttributeChange.Json json = new ImmutableAttributeChange.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }
  @Test
  public void setTypeTest() {
    // Arrange
    ImmutableAttributeChange.Json json = new ImmutableAttributeChange.Json();

    // Act
    json.setType("type");

    // Assert
    assertEquals("type", json.type);
  }
  @Test
  public void typeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttributeChange.Json()).type();
  }
}


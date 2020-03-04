package com.khartec.waltz.model.physical_specification;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.CreatedUserTimestampProvider;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.IsRemovedProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.UserTimestamp;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalSpecificationDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecification.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalSpecification.Json actualJson = new ImmutablePhysicalSpecification.Json();

    // Assert
    Optional<UserTimestamp> optional = actualJson.created;
    assertSame(optional, actualJson.id);
    assertSame(optional, actualJson.externalId);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalSpecification.copyOf(new ImmutablePhysicalSpecification.Json());
  }
  @Test
  public void createdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecification.Json()).created();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecification.Json()).description();
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecification.Json()).externalId();
  }
  @Test
  public void formatTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecification.Json()).format();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecification.fromJson(new ImmutablePhysicalSpecification.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalSpecification.Builder builderResult = ImmutablePhysicalSpecification.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalSpecification.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutablePhysicalSpecification.Builder builderResult = ImmutablePhysicalSpecification.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutablePhysicalSpecification.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutablePhysicalSpecification.Builder builderResult = ImmutablePhysicalSpecification.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutablePhysicalSpecification.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutablePhysicalSpecification.Builder builderResult = ImmutablePhysicalSpecification.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IsRemovedProvider) new ImmutablePhysicalSpecification.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutablePhysicalSpecification.Builder builderResult = ImmutablePhysicalSpecification.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutablePhysicalSpecification.Json());
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutablePhysicalSpecification.Builder builderResult = ImmutablePhysicalSpecification.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutablePhysicalSpecification.Json());
  }
  @Test
  public void fromTest7() {
    // Arrange
    ImmutablePhysicalSpecification.Builder builderResult = ImmutablePhysicalSpecification.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutablePhysicalSpecification.Json());
  }
  @Test
  public void fromTest8() {
    // Arrange
    ImmutablePhysicalSpecification.Builder builderResult = ImmutablePhysicalSpecification.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((CreatedUserTimestampProvider) new ImmutablePhysicalSpecification.Json());
  }
  @Test
  public void fromTest9() {
    // Arrange
    ImmutablePhysicalSpecification.Builder builderResult = ImmutablePhysicalSpecification.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutablePhysicalSpecification.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecification.Json()).id();
  }
  @Test
  public void isRemovedTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecification.Json()).isRemoved();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecification.Json()).lastUpdatedAt();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecification.Json()).lastUpdatedBy();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecification.Json()).name();
  }
  @Test
  public void owningEntityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecification.Json()).owningEntity();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecification.Json()).provenance();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutablePhysicalSpecification.Json json = new ImmutablePhysicalSpecification.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setFormatTest() {
    // Arrange
    ImmutablePhysicalSpecification.Json json = new ImmutablePhysicalSpecification.Json();

    // Act
    json.setFormat(DataFormatKind.BINARY);

    // Assert
    assertEquals(DataFormatKind.BINARY, json.format);
  }
  @Test
  public void setIsRemovedTest() {
    // Arrange
    ImmutablePhysicalSpecification.Json json = new ImmutablePhysicalSpecification.Json();

    // Act
    json.setIsRemoved(true);

    // Assert
    assertTrue(json.isRemovedIsSet);
    assertTrue(json.isRemoved);
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutablePhysicalSpecification.Json json = new ImmutablePhysicalSpecification.Json();

    // Act
    json.setLastUpdatedBy("lastUpdatedBy");

    // Assert
    assertEquals("lastUpdatedBy", json.lastUpdatedBy);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutablePhysicalSpecification.Json json = new ImmutablePhysicalSpecification.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutablePhysicalSpecification.Json json = new ImmutablePhysicalSpecification.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }
}


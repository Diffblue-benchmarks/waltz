package com.khartec.waltz.model.taxonomy_management;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.CreatedProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableTaxonomyChangeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void createdByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTaxonomyChangeCommand.Json()).createdBy();
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableTaxonomyChangeCommand.Json json = new ImmutableTaxonomyChangeCommand.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void createdAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTaxonomyChangeCommand.Json()).createdAt();
  }
  @Test
  public void setChangeTypeTest() {
    // Arrange
    ImmutableTaxonomyChangeCommand.Json json = new ImmutableTaxonomyChangeCommand.Json();

    // Act
    json.setChangeType(TaxonomyChangeType.ADD_PEER);

    // Assert
    assertEquals(TaxonomyChangeType.ADD_PEER, json.changeType);
  }
  @Test
  public void primaryReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTaxonomyChangeCommand.Json()).primaryReference();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTaxonomyChangeCommand.Json()).lastUpdatedBy();
  }
  @Test
  public void setCreatedByTest() {
    // Arrange
    ImmutableTaxonomyChangeCommand.Json json = new ImmutableTaxonomyChangeCommand.Json();

    // Act
    json.setCreatedBy("foo");

    // Assert
    assertEquals("foo", json.createdBy);
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTaxonomyChangeCommand.Json()).id();
  }
  @Test
  public void changeDomainTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTaxonomyChangeCommand.Json()).changeDomain();
  }
  @Test
  public void statusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTaxonomyChangeCommand.Json()).status();
  }
  @Test
  public void changeTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTaxonomyChangeCommand.Json()).changeType();
  }
  @Test
  public void setParamsTest() {
    // Arrange
    ImmutableTaxonomyChangeCommand.Json json = new ImmutableTaxonomyChangeCommand.Json();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    json.setParams(stringStringMap);

    // Assert
    assertSame(stringStringMap, json.params);
  }
  @Test
  public void setStatusTest() {
    // Arrange
    ImmutableTaxonomyChangeCommand.Json json = new ImmutableTaxonomyChangeCommand.Json();

    // Act
    json.setStatus(TaxonomyChangeLifecycleStatus.DRAFT);

    // Assert
    assertEquals(TaxonomyChangeLifecycleStatus.DRAFT, json.status);
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTaxonomyChangeCommand.Json()).lastUpdatedAt();
  }
  @Test
  public void paramsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTaxonomyChangeCommand.Json()).params();
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ImmutableTaxonomyChangeCommand.Json()).params);
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableTaxonomyChangeCommand.fromJson(new ImmutableTaxonomyChangeCommand.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableTaxonomyChangeCommand.copyOf(new ImmutableTaxonomyChangeCommand.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableTaxonomyChangeCommand.Builder builderResult = ImmutableTaxonomyChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((CreatedProvider) new ImmutableTaxonomyChangeCommand.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableTaxonomyChangeCommand.Builder builderResult = ImmutableTaxonomyChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableTaxonomyChangeCommand.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableTaxonomyChangeCommand.Builder builderResult = ImmutableTaxonomyChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableTaxonomyChangeCommand.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableTaxonomyChangeCommand.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableTaxonomyChangeCommand.Builder builderResult = ImmutableTaxonomyChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableTaxonomyChangeCommand.Json());
  }
}


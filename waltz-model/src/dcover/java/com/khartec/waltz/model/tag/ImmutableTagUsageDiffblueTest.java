package com.khartec.waltz.model.tag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.CreatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.WaltzEntity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableTagUsageDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromTest4() {
    // Arrange
    ImmutableTagUsage.Builder builderResult = ImmutableTagUsage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableTagUsage.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableTagUsage.builder().build();
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableTagUsage.Builder builderResult = ImmutableTagUsage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((WaltzEntity) new ImmutableTagUsage.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableTagUsage.Builder builderResult = ImmutableTagUsage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableTagUsage.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableTagUsage.Builder builderResult = ImmutableTagUsage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((CreatedProvider) new ImmutableTagUsage.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableTagUsage.fromJson(new ImmutableTagUsage.Json());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableTagUsage.copyOf(new ImmutableTagUsage.Json());
  }

  @Test
  public void createdByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTagUsage.Json()).createdBy();
  }

  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTagUsage.Json()).entityReference();
  }

  @Test
  public void tagIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTagUsage.Json()).tagId();
  }

  @Test
  public void createdAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTagUsage.Json()).createdAt();
  }

  @Test
  public void setCreatedByTest() {
    // Arrange
    ImmutableTagUsage.Json json = new ImmutableTagUsage.Json();

    // Act
    json.setCreatedBy("foo");

    // Assert
    assertEquals("foo", json.createdBy);
  }

  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTagUsage.Json()).provenance();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableTagUsage.Json actualJson = new ImmutableTagUsage.Json();

    // Assert
    assertNull(actualJson.createdBy);
    assertNull(actualJson.provenance);
    assertNull(actualJson.createdAt);
    assertFalse(actualJson.tagIdIsSet);
    assertNull(actualJson.entityReference);
    assertEquals(0L, actualJson.tagId);
  }

  @Test
  public void setTagIdTest() {
    // Arrange
    ImmutableTagUsage.Json json = new ImmutableTagUsage.Json();

    // Act
    json.setTagId(123L);

    // Assert
    assertTrue(json.tagIdIsSet);
    assertEquals(123L, json.tagId);
  }

  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableTagUsage.Json json = new ImmutableTagUsage.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
}


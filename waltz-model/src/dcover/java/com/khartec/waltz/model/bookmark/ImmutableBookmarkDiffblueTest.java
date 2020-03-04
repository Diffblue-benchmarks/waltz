package com.khartec.waltz.model.bookmark;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableBookmarkDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void bookmarkKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableBookmark.Json()).bookmarkKind();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableBookmark.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableBookmark.Json actualJson = new ImmutableBookmark.Json();

    // Assert
    Optional<Long> optional = actualJson.id;
    assertSame(actualJson.url, optional);
    assertSame(optional, actualJson.url);
    assertSame(optional, actualJson.description);
    assertSame(optional, actualJson.title);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableBookmark.copyOf(new ImmutableBookmark.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableBookmark.Json()).description();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableBookmark.fromJson(new ImmutableBookmark.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableBookmark.Builder builderResult = ImmutableBookmark.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableBookmark.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableBookmark.Builder builderResult = ImmutableBookmark.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableBookmark.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableBookmark.Builder builderResult = ImmutableBookmark.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableBookmark.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableBookmark.Builder builderResult = ImmutableBookmark.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableBookmark.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableBookmark.Builder builderResult = ImmutableBookmark.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableBookmark.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableBookmark.Json()).id();
  }
  @Test
  public void isPrimaryTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableBookmark.Json()).isPrimary();
  }
  @Test
  public void isRequiredTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableBookmark.Json()).isRequired();
  }
  @Test
  public void isRestrictedTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableBookmark.Json()).isRestricted();
  }
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableBookmark.Json()).kind();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableBookmark.Json()).lastUpdatedAt();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableBookmark.Json()).lastUpdatedBy();
  }
  @Test
  public void parentTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableBookmark.Json()).parent();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableBookmark.Json()).provenance();
  }
  @Test
  public void setBookmarkKindTest() {
    // Arrange
    ImmutableBookmark.Json json = new ImmutableBookmark.Json();

    // Act
    json.setBookmarkKind("bookmarkKind");

    // Assert
    assertEquals("bookmarkKind", json.bookmarkKind);
  }
  @Test
  public void setIsPrimaryTest() {
    // Arrange
    ImmutableBookmark.Json json = new ImmutableBookmark.Json();

    // Act
    json.setIsPrimary(true);

    // Assert
    assertTrue(json.isPrimary);
    assertTrue(json.isPrimaryIsSet);
  }
  @Test
  public void setIsRequiredTest() {
    // Arrange
    ImmutableBookmark.Json json = new ImmutableBookmark.Json();

    // Act
    json.setIsRequired(true);

    // Assert
    assertTrue(json.isRequired);
    assertTrue(json.isRequiredIsSet);
  }
  @Test
  public void setIsRestrictedTest() {
    // Arrange
    ImmutableBookmark.Json json = new ImmutableBookmark.Json();

    // Act
    json.setIsRestricted(true);

    // Assert
    assertTrue(json.isRestricted);
    assertTrue(json.isRestrictedIsSet);
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableBookmark.Json json = new ImmutableBookmark.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableBookmark.Json json = new ImmutableBookmark.Json();

    // Act
    json.setLastUpdatedBy("lastUpdatedBy");

    // Assert
    assertEquals("lastUpdatedBy", json.lastUpdatedBy);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableBookmark.Json json = new ImmutableBookmark.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }
  @Test
  public void titleTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableBookmark.Json()).title();
  }
  @Test
  public void urlTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableBookmark.Json()).url();
  }
}


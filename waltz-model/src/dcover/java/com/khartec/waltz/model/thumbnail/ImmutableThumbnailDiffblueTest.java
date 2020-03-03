package com.khartec.waltz.model.thumbnail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableThumbnailDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromTest4() {
    // Arrange
    ImmutableThumbnail.Builder builderResult = ImmutableThumbnail.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableThumbnail.Json());
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableThumbnail.Builder builderResult = ImmutableThumbnail.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableThumbnail.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableThumbnail.builder().build();
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableThumbnail.Builder builderResult = ImmutableThumbnail.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableThumbnail.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableThumbnail.Builder builderResult = ImmutableThumbnail.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableThumbnail.Json());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableThumbnail.copyOf(new ImmutableThumbnail.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableThumbnail.fromJson(new ImmutableThumbnail.Json());
  }

  @Test
  public void setBlobTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) -1);
    ImmutableThumbnail.Json json = new ImmutableThumbnail.Json();

    // Act
    json.setBlob(byteArray);

    // Assert
    assertSame(byteArray, json.blob);
  }

  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableThumbnail.Json json = new ImmutableThumbnail.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }

  @Test
  public void setMimeTypeTest() {
    // Arrange
    ImmutableThumbnail.Json json = new ImmutableThumbnail.Json();

    // Act
    json.setMimeType("foo");

    // Assert
    assertEquals("foo", json.mimeType);
  }

  @Test
  public void mimeTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableThumbnail.Json()).mimeType();
  }

  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableThumbnail.Json()).lastUpdatedBy();
  }

  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableThumbnail.Json()).provenance();
  }

  @Test
  public void parentEntityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableThumbnail.Json()).parentEntityReference();
  }

  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableThumbnail.Json()).lastUpdatedAt();
  }

  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableThumbnail.Json()).externalId();
  }

  @Test
  public void blobTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableThumbnail.Json()).blob();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableThumbnail.Json actualJson = new ImmutableThumbnail.Json();

    // Assert
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.mimeType);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.blob);
    assertNull(actualJson.provenance);
    assertNull(actualJson.parentEntityReference);
  }

  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableThumbnail.Json json = new ImmutableThumbnail.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
}


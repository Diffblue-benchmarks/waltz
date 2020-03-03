package com.khartec.waltz.model.entity_named_note;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityNamedNoteDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableEntityNamedNote.Builder builderResult = ImmutableEntityNamedNote.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityNamedNote.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableEntityNamedNote.Builder builderResult = ImmutableEntityNamedNote.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableEntityNamedNote.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityNamedNote.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityNamedNote.Builder builderResult = ImmutableEntityNamedNote.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableEntityNamedNote.Json());
  }
  @Test
  public void namedNoteTypeIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityNamedNote.Json()).namedNoteTypeId();
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityNamedNote.Json()).entityReference();
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableEntityNamedNote.Json json = new ImmutableEntityNamedNote.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void noteTextTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityNamedNote.Json()).noteText();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityNamedNote.Json()).lastUpdatedBy();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityNamedNote.Json()).provenance();
  }
  @Test
  public void setNamedNoteTypeIdTest() {
    // Arrange
    ImmutableEntityNamedNote.Json json = new ImmutableEntityNamedNote.Json();

    // Act
    json.setNamedNoteTypeId(123L);

    // Assert
    assertTrue(json.namedNoteTypeIdIsSet);
    assertEquals(123L, json.namedNoteTypeId);
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityNamedNote.Json()).lastUpdatedAt();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntityNamedNote.Json actualJson = new ImmutableEntityNamedNote.Json();

    // Assert
    assertNull(actualJson.provenance);
    assertFalse(actualJson.namedNoteTypeIdIsSet);
    assertEquals(0L, actualJson.namedNoteTypeId);
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.entityReference);
    assertNull(actualJson.noteText);
    assertNull(actualJson.lastUpdatedBy);
  }
  @Test
  public void setNoteTextTest() {
    // Arrange
    ImmutableEntityNamedNote.Json json = new ImmutableEntityNamedNote.Json();

    // Act
    json.setNoteText("foo");

    // Assert
    assertEquals("foo", json.noteText);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableEntityNamedNote.Json json = new ImmutableEntityNamedNote.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityNamedNote.fromJson(new ImmutableEntityNamedNote.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityNamedNote.copyOf(new ImmutableEntityNamedNote.Json());
  }
}


package com.khartec.waltz.model.orphan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableOrphanRelationshipDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableOrphanRelationship.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableOrphanRelationship.Json actualJson = new ImmutableOrphanRelationship.Json();

    // Assert
    assertNull(actualJson.entityB);
    assertNull(actualJson.orphanSide);
    assertNull(actualJson.entityA);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableOrphanRelationship.copyOf(new ImmutableOrphanRelationship.Json());
  }
  @Test
  public void entityATest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableOrphanRelationship.Json()).entityA();
  }
  @Test
  public void entityBTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableOrphanRelationship.Json()).entityB();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableOrphanRelationship.fromJson(new ImmutableOrphanRelationship.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableOrphanRelationship.Builder builderResult = ImmutableOrphanRelationship.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableOrphanRelationship.Json());
  }
  @Test
  public void orphanSideTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableOrphanRelationship.Json()).orphanSide();
  }
  @Test
  public void setOrphanSideTest() {
    // Arrange
    ImmutableOrphanRelationship.Json json = new ImmutableOrphanRelationship.Json();

    // Act
    json.setOrphanSide(OrphanSide.A);

    // Assert
    assertEquals(OrphanSide.A, json.orphanSide);
  }
}


package com.khartec.waltz.model;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EntityReferenceUtilitiesDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void prettyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    EntityReferenceUtilities.pretty(new ImmutableEntityReference.Json());
  }
  @Test
  public void safeNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    EntityReferenceUtilities.safeName(new ImmutableEntityReference.Json());
  }
}


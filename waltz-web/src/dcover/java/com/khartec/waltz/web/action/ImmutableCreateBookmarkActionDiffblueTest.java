package com.khartec.waltz.web.action;

import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableCreateBookmarkActionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void bookmarkTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCreateBookmarkAction.Json()).bookmark();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableCreateBookmarkAction.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ImmutableCreateBookmarkAction.Json()).bookmark);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableCreateBookmarkAction.copyOf(new ImmutableCreateBookmarkAction.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableCreateBookmarkAction.fromJson(new ImmutableCreateBookmarkAction.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableCreateBookmarkAction.Builder builderResult = ImmutableCreateBookmarkAction.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableCreateBookmarkAction.Json());
  }
}


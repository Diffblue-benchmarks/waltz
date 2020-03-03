package com.khartec.waltz.model.thumbnail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableThumbnailSaveCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableThumbnailSaveCommand.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableThumbnailSaveCommand.Builder builderResult = ImmutableThumbnailSaveCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableThumbnail.Json());
  }
}


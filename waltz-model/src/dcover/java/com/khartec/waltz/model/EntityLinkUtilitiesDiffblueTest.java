package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EntityLinkUtilitiesDiffblueTest {
  @Test
  public void mkExternalIdLinkTest() {
    // Arrange, Act and Assert
    assertEquals("fooentity/ACTOR/external-id/123",
        EntityLinkUtilities.mkExternalIdLink("foo", EntityKind.ACTOR, "123"));
  }

  @Test
  public void mkIdLinkTest() {
    // Arrange, Act and Assert
    assertEquals("fooentity/ACTOR/id/123", EntityLinkUtilities.mkIdLink("foo", EntityKind.ACTOR, Long.valueOf(123L)));
  }
}


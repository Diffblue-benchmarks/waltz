package com.khartec.waltz.common.hierarchy;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FlatNodeDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    FlatNode<Object, Object> actualFlatNode = new FlatNode<Object, Object>("123", null, "foo");

    // Assert
    assertNull(actualFlatNode.getParentId());
    assertTrue(actualFlatNode.getId() instanceof String);
    assertTrue(actualFlatNode.getData() instanceof String);
  }
}


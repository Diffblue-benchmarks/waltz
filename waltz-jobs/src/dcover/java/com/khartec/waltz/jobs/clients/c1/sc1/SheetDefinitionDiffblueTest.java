package com.khartec.waltz.jobs.clients.c1.sc1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SheetDefinitionDiffblueTest {
  @Test
  public void sheetNumTest() {
    // Arrange, Act and Assert
    assertEquals(0, SheetDefinition.APPLICATION.sheetNum());
  }
}


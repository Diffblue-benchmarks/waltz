package com.khartec.waltz.jobs.clients.c1.sc1.parse;

import static org.junit.Assert.assertEquals;
import com.khartec.waltz.model.EntityLifecycleStatus;
import org.junit.Test;

public class StatusToEntityLifecycleStatusDiffblueTest {
  @Test
  public void applyTest() {
    // Arrange, Act and Assert
    assertEquals(EntityLifecycleStatus.REMOVED, StatusToEntityLifecycleStatus.apply("abgeschaltet"));
  }
}


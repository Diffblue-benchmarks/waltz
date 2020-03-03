package com.khartec.waltz.jobs.clients.c1.sc1.parse;

import static org.junit.Assert.assertEquals;
import com.khartec.waltz.model.application.LifecyclePhase;
import org.junit.Test;

public class StatusToLifecyclePhaseDiffblueTest {
  @Test
  public void applyTest() {
    // Arrange, Act and Assert
    assertEquals(LifecyclePhase.RETIRED, StatusToLifecyclePhase.apply("beendet"));
  }
}


package com.khartec.waltz.jobs.clients.c1.sc1.parse;

import static org.junit.Assert.assertEquals;
import com.khartec.waltz.jobs.clients.c1.sc1.model.MaintenanceStatus;
import org.junit.Test;

public class WartungstatusToMaintenanceStatusDiffblueTest {
  @Test
  public void applyTest() {
    // Arrange, Act and Assert
    assertEquals(MaintenanceStatus.SELF, WartungstatusToMaintenanceStatus.apply("0-hauptwartung"));
  }
}


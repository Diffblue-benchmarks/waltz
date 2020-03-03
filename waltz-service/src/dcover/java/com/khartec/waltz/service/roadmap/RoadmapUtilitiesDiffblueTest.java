package com.khartec.waltz.service.roadmap;

import static org.junit.Assert.assertEquals;
import com.khartec.waltz.model.Operation;
import com.khartec.waltz.model.Severity;
import com.khartec.waltz.model.changelog.ChangeLog;
import org.junit.Test;

public class RoadmapUtilitiesDiffblueTest {
  @Test
  public void mkBasicLogEntryTest() {
    // Arrange and Act
    ChangeLog actualMkBasicLogEntryResult = RoadmapUtilities.mkBasicLogEntry(123L, "message", "123");

    // Assert
    String actualMessageResult = actualMkBasicLogEntryResult.message();
    Operation actualOperationResult = actualMkBasicLogEntryResult.operation();
    assertEquals("message", actualMessageResult);
    assertEquals(Severity.INFORMATION, actualMkBasicLogEntryResult.severity());
    assertEquals(Operation.UPDATE, actualOperationResult);
  }
}


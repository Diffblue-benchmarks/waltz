package com.khartec.waltz.model.usage_info;

import java.util.HashSet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UsageInfoUtilitiesDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void mkChangeSetTest() {
    // Arrange
    HashSet<UsageInfo> usageInfoSet = new HashSet<UsageInfo>();
    usageInfoSet.add(new ImmutableUsageInfo.Json());
    HashSet<UsageInfo> usageInfoSet1 = new HashSet<UsageInfo>();
    usageInfoSet1.add(new ImmutableUsageInfo.Json());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    UsageInfoUtilities.mkChangeSet(usageInfoSet, usageInfoSet1);
  }
}


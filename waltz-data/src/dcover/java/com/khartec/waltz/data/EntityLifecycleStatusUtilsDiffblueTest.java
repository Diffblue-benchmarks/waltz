package com.khartec.waltz.data;

import static org.junit.Assert.assertEquals;
import com.khartec.waltz.model.EntityLifecycleStatus;
import java.util.HashSet;
import java.util.List;
import org.junit.Test;

public class EntityLifecycleStatusUtilsDiffblueTest {
  @Test
  public void convertToIsRemovedFlagsTest() {
    // Arrange
    HashSet<EntityLifecycleStatus> entityLifecycleStatusSet = new HashSet<EntityLifecycleStatus>();
    entityLifecycleStatusSet.add(EntityLifecycleStatus.ACTIVE);

    // Act
    List<Boolean> actualConvertToIsRemovedFlagsResult = EntityLifecycleStatusUtils
        .convertToIsRemovedFlags(entityLifecycleStatusSet);

    // Assert
    assertEquals(2, actualConvertToIsRemovedFlagsResult.size());
    assertEquals(Boolean.valueOf(false), actualConvertToIsRemovedFlagsResult.get(0));
    assertEquals(Boolean.valueOf(false), actualConvertToIsRemovedFlagsResult.get(1));
  }
}


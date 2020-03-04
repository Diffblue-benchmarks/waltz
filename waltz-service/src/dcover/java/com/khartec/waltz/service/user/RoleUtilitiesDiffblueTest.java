package com.khartec.waltz.service.user;

import static org.junit.Assert.assertEquals;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.Operation;
import com.khartec.waltz.model.user.SystemRole;
import org.junit.Test;

public class RoleUtilitiesDiffblueTest {
  @Test
  public void getRequiredRoleForEntityKindTest() {
    // Arrange
    SystemRole actualRequiredRoleForEntityKind = RoleUtilities.getRequiredRoleForEntityKind(EntityKind.ACTOR);
    SystemRole actualRequiredRoleForEntityKind1 = RoleUtilities.getRequiredRoleForEntityKind(EntityKind.APPLICATION);

    // Act and Assert
    assertEquals(SystemRole.ADMIN, actualRequiredRoleForEntityKind);
    assertEquals(SystemRole.APP_EDITOR, actualRequiredRoleForEntityKind1);
    assertEquals(SystemRole.CHANGE_INITIATIVE_EDITOR,
        RoleUtilities.getRequiredRoleForEntityKind(EntityKind.CHANGE_INITIATIVE));
  }

  @Test
  public void getRequiredRoleForEntityKindTest2() {
    // Arrange, Act and Assert
    assertEquals(SystemRole.ADMIN,
        RoleUtilities.getRequiredRoleForEntityKind(EntityKind.ACTOR, Operation.ADD, EntityKind.ACTOR));
  }
}


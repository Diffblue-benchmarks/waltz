package com.khartec.waltz.model.app_group;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAppGroupMemberDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAppGroupMember.Builder builderResult = ImmutableAppGroupMember.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAppGroupMember.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAppGroupMember.builder().build();
  }
  @Test
  public void userIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppGroupMember.Json()).userId();
  }
  @Test
  public void groupIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppGroupMember.Json()).groupId();
  }
  @Test
  public void setGroupIdTest() {
    // Arrange
    ImmutableAppGroupMember.Json json = new ImmutableAppGroupMember.Json();

    // Act
    json.setGroupId(123L);

    // Assert
    assertTrue(json.groupIdIsSet);
    assertEquals(123L, json.groupId);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAppGroupMember.Json actualJson = new ImmutableAppGroupMember.Json();

    // Assert
    assertNull(actualJson.userId);
    assertFalse(actualJson.groupIdIsSet);
    assertEquals(0L, actualJson.groupId);
    assertNull(actualJson.role);
  }
  @Test
  public void setUserIdTest() {
    // Arrange
    ImmutableAppGroupMember.Json json = new ImmutableAppGroupMember.Json();

    // Act
    json.setUserId("123");

    // Assert
    assertEquals("123", json.userId);
  }
  @Test
  public void setRoleTest() {
    // Arrange
    ImmutableAppGroupMember.Json json = new ImmutableAppGroupMember.Json();

    // Act
    json.setRole(AppGroupMemberRole.VIEWER);

    // Assert
    assertEquals(AppGroupMemberRole.VIEWER, json.role);
  }
  @Test
  public void roleTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppGroupMember.Json()).role();
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAppGroupMember.copyOf(new ImmutableAppGroupMember.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAppGroupMember.fromJson(new ImmutableAppGroupMember.Json());
  }
}


package com.khartec.waltz.service.app_group;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.app_group.AppGroupMemberRole;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAppGroupSubscriptionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAppGroupSubscription.fromJson(new ImmutableAppGroupSubscription.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAppGroupSubscription.copyOf(new ImmutableAppGroupSubscription.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAppGroupSubscription.Builder builderResult = ImmutableAppGroupSubscription.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAppGroupSubscription.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAppGroupSubscription.builder().build();
  }
  @Test
  public void setAppGroupTest() {
    // Arrange
    ImmutableAppGroupSubscription.Json json = new ImmutableAppGroupSubscription.Json();

    // Act
    json.setAppGroup(null);

    // Assert
    assertNull(json.appGroup);
  }
  @Test
  public void appGroupTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppGroupSubscription.Json()).appGroup();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAppGroupSubscription.Json actualJson = new ImmutableAppGroupSubscription.Json();

    // Assert
    assertNull(actualJson.appGroup);
    assertNull(actualJson.role);
  }
  @Test
  public void setRoleTest() {
    // Arrange
    ImmutableAppGroupSubscription.Json json = new ImmutableAppGroupSubscription.Json();

    // Act
    json.setRole(AppGroupMemberRole.VIEWER);

    // Assert
    assertEquals(AppGroupMemberRole.VIEWER, json.role);
  }
  @Test
  public void roleTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppGroupSubscription.Json()).role();
  }
}


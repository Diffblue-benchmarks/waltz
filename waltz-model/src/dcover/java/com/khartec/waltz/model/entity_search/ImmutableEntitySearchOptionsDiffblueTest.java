package com.khartec.waltz.model.entity_search;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityLifecycleStatus;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntitySearchOptionsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntitySearchOptions.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntitySearchOptions.Json actualJson = new ImmutableEntitySearchOptions.Json();

    // Assert
    List<EntityKind> actualEntityKindList = actualJson.entityKinds;
    List<EntityLifecycleStatus> entityLifecycleStatusList = actualJson.entityLifecycleStatuses;
    assertEquals(0, entityLifecycleStatusList.size());
    assertSame(entityLifecycleStatusList, actualEntityKindList);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntitySearchOptions.copyOf(new ImmutableEntitySearchOptions.Json());
  }
  @Test
  public void entityKindsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntitySearchOptions.Json()).entityKinds();
  }
  @Test
  public void entityLifecycleStatusesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntitySearchOptions.Json()).entityLifecycleStatuses();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntitySearchOptions.fromJson(new ImmutableEntitySearchOptions.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntitySearchOptions.Builder builderResult = ImmutableEntitySearchOptions.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntitySearchOptions.Json());
  }
  @Test
  public void limitTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntitySearchOptions.Json()).limit();
  }
  @Test
  public void searchQueryTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntitySearchOptions.Json()).searchQuery();
  }
  @Test
  public void setEntityKindsTest() {
    // Arrange
    ImmutableEntitySearchOptions.Json json = new ImmutableEntitySearchOptions.Json();
    ArrayList<EntityKind> entityKindList = new ArrayList<EntityKind>();
    entityKindList.add(EntityKind.ACTOR);

    // Act
    json.setEntityKinds(entityKindList);

    // Assert
    assertSame(entityKindList, json.entityKinds);
  }
  @Test
  public void setEntityLifecycleStatusesTest() {
    // Arrange
    ImmutableEntitySearchOptions.Json json = new ImmutableEntitySearchOptions.Json();
    ArrayList<EntityLifecycleStatus> entityLifecycleStatusList = new ArrayList<EntityLifecycleStatus>();
    entityLifecycleStatusList.add(EntityLifecycleStatus.ACTIVE);

    // Act
    json.setEntityLifecycleStatuses(entityLifecycleStatusList);

    // Assert
    assertTrue(json.entityLifecycleStatusesIsSet);
    assertSame(entityLifecycleStatusList, json.entityLifecycleStatuses);
  }
  @Test
  public void setLimitTest() {
    // Arrange
    ImmutableEntitySearchOptions.Json json = new ImmutableEntitySearchOptions.Json();

    // Act
    json.setLimit(1);

    // Assert
    assertTrue(json.limitIsSet);
    assertEquals(1, json.limit);
  }
  @Test
  public void setSearchQueryTest() {
    // Arrange
    ImmutableEntitySearchOptions.Json json = new ImmutableEntitySearchOptions.Json();

    // Act
    json.setSearchQuery("searchQuery");

    // Assert
    assertEquals("searchQuery", json.searchQuery);
  }
  @Test
  public void setUserIdTest() {
    // Arrange
    ImmutableEntitySearchOptions.Json json = new ImmutableEntitySearchOptions.Json();

    // Act
    json.setUserId("123");

    // Assert
    assertEquals("123", json.userId);
  }
  @Test
  public void userIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntitySearchOptions.Json()).userId();
  }
}


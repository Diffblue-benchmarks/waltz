package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableIdSelectionOptionsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableIdSelectionOptions.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableIdSelectionOptions.Builder builderResult = ImmutableIdSelectionOptions.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableIdSelectionOptions.Json());
  }
  @Test
  public void filtersTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableIdSelectionOptions.Json()).filters();
  }
  @Test
  public void setFiltersTest() {
    // Arrange
    ImmutableIdSelectionOptions.Json json = new ImmutableIdSelectionOptions.Json();
    ImmutableSelectionFilters.Json json1 = new ImmutableSelectionFilters.Json();

    // Act
    json.setFilters(json1);

    // Assert
    assertSame(json1, json.filters);
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableIdSelectionOptions.Json()).entityReference();
  }
  @Test
  public void entityLifecycleStatusesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableIdSelectionOptions.Json()).entityLifecycleStatuses();
  }
  @Test
  public void scopeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableIdSelectionOptions.Json()).scope();
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableIdSelectionOptions.Json()).entityLifecycleStatuses.size());
  }
  @Test
  public void setScopeTest() {
    // Arrange
    ImmutableIdSelectionOptions.Json json = new ImmutableIdSelectionOptions.Json();

    // Act
    json.setScope(HierarchyQueryScope.EXACT);

    // Assert
    assertEquals(HierarchyQueryScope.EXACT, json.scope);
  }
  @Test
  public void setEntityReferenceTest() {
    // Arrange
    ImmutableIdSelectionOptions.Json json = new ImmutableIdSelectionOptions.Json();
    ImmutableEntityReference.Json json1 = new ImmutableEntityReference.Json();

    // Act
    json.setEntityReference(json1);

    // Assert
    assertSame(json1, json.entityReference);
  }
  @Test
  public void setEntityLifecycleStatusesTest() {
    // Arrange
    ImmutableIdSelectionOptions.Json json = new ImmutableIdSelectionOptions.Json();
    HashSet<EntityLifecycleStatus> entityLifecycleStatusSet = new HashSet<EntityLifecycleStatus>();
    entityLifecycleStatusSet.add(EntityLifecycleStatus.ACTIVE);

    // Act
    json.setEntityLifecycleStatuses(entityLifecycleStatusSet);

    // Assert
    assertSame(entityLifecycleStatusSet, json.entityLifecycleStatuses);
    assertTrue(json.entityLifecycleStatusesIsSet);
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableIdSelectionOptions.fromJson(new ImmutableIdSelectionOptions.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableIdSelectionOptions.copyOf(new ImmutableIdSelectionOptions.Json());
  }
}


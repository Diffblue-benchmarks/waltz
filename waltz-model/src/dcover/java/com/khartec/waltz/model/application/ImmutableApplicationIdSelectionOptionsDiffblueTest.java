package com.khartec.waltz.model.application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.EntityLifecycleStatus;
import com.khartec.waltz.model.HierarchyQueryScope;
import com.khartec.waltz.model.IdSelectionOptions;
import java.util.HashSet;
import java.util.Set;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableApplicationIdSelectionOptionsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void applicationKindsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplicationIdSelectionOptions.Json()).applicationKinds();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableApplicationIdSelectionOptions.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableApplicationIdSelectionOptions.Json actualJson = new ImmutableApplicationIdSelectionOptions.Json();

    // Assert
    Set<ApplicationKind> actualApplicationKindSet = actualJson.applicationKinds;
    Set<EntityLifecycleStatus> entityLifecycleStatusSet = actualJson.entityLifecycleStatuses;
    assertEquals(0, entityLifecycleStatusSet.size());
    assertSame(entityLifecycleStatusSet, actualApplicationKindSet);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableApplicationIdSelectionOptions.copyOf(new ImmutableApplicationIdSelectionOptions.Json());
  }
  @Test
  public void entityLifecycleStatusesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplicationIdSelectionOptions.Json()).entityLifecycleStatuses();
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplicationIdSelectionOptions.Json()).entityReference();
  }
  @Test
  public void filtersTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplicationIdSelectionOptions.Json()).filters();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableApplicationIdSelectionOptions.fromJson(new ImmutableApplicationIdSelectionOptions.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableApplicationIdSelectionOptions.Builder builderResult = ImmutableApplicationIdSelectionOptions.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableApplicationIdSelectionOptions.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableApplicationIdSelectionOptions.Builder builderResult = ImmutableApplicationIdSelectionOptions.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdSelectionOptions) new ImmutableApplicationIdSelectionOptions.Json());
  }
  @Test
  public void scopeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplicationIdSelectionOptions.Json()).scope();
  }
  @Test
  public void setApplicationKindsTest() {
    // Arrange
    ImmutableApplicationIdSelectionOptions.Json json = new ImmutableApplicationIdSelectionOptions.Json();
    HashSet<ApplicationKind> applicationKindSet = new HashSet<ApplicationKind>();
    applicationKindSet.add(ApplicationKind.IN_HOUSE);

    // Act
    json.setApplicationKinds(applicationKindSet);

    // Assert
    assertTrue(json.applicationKindsIsSet);
    assertSame(applicationKindSet, json.applicationKinds);
  }
  @Test
  public void setEntityLifecycleStatusesTest() {
    // Arrange
    ImmutableApplicationIdSelectionOptions.Json json = new ImmutableApplicationIdSelectionOptions.Json();
    HashSet<EntityLifecycleStatus> entityLifecycleStatusSet = new HashSet<EntityLifecycleStatus>();
    entityLifecycleStatusSet.add(EntityLifecycleStatus.ACTIVE);

    // Act
    json.setEntityLifecycleStatuses(entityLifecycleStatusSet);

    // Assert
    assertTrue(json.entityLifecycleStatusesIsSet);
    assertSame(entityLifecycleStatusSet, json.entityLifecycleStatuses);
  }
  @Test
  public void setScopeTest() {
    // Arrange
    ImmutableApplicationIdSelectionOptions.Json json = new ImmutableApplicationIdSelectionOptions.Json();

    // Act
    json.setScope(HierarchyQueryScope.EXACT);

    // Assert
    assertEquals(HierarchyQueryScope.EXACT, json.scope);
  }
}


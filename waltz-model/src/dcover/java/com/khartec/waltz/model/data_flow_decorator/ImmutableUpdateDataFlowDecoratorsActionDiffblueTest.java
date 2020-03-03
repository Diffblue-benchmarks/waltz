package com.khartec.waltz.model.data_flow_decorator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.EntityReference;
import java.util.HashSet;
import java.util.Set;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableUpdateDataFlowDecoratorsActionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableUpdateDataFlowDecoratorsAction.copyOf(new ImmutableUpdateDataFlowDecoratorsAction.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUpdateDataFlowDecoratorsAction.fromJson(new ImmutableUpdateDataFlowDecoratorsAction.Json());
  }
  @Test
  public void removedDecoratorsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUpdateDataFlowDecoratorsAction.Json()).removedDecorators();
  }
  @Test
  public void setFlowIdTest() {
    // Arrange
    ImmutableUpdateDataFlowDecoratorsAction.Json json = new ImmutableUpdateDataFlowDecoratorsAction.Json();

    // Act
    json.setFlowId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.flowId);
  }
  @Test
  public void flowIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUpdateDataFlowDecoratorsAction.Json()).flowId();
  }
  @Test
  public void setRemovedDecoratorsTest() {
    // Arrange
    ImmutableUpdateDataFlowDecoratorsAction.Json json = new ImmutableUpdateDataFlowDecoratorsAction.Json();
    HashSet<EntityReference> entityReferenceSet = new HashSet<EntityReference>();
    entityReferenceSet.add(null);

    // Act
    json.setRemovedDecorators(entityReferenceSet);

    // Assert
    assertSame(entityReferenceSet, json.removedDecorators);
  }
  @Test
  public void addedDecoratorsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUpdateDataFlowDecoratorsAction.Json()).addedDecorators();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableUpdateDataFlowDecoratorsAction.Json actualJson = new ImmutableUpdateDataFlowDecoratorsAction.Json();

    // Assert
    Set<EntityReference> entityReferenceSet = actualJson.addedDecorators;
    Set<EntityReference> actualEntityReferenceSet = actualJson.removedDecorators;
    assertEquals(0, entityReferenceSet.size());
    assertSame(entityReferenceSet, actualEntityReferenceSet);
  }
  @Test
  public void setAddedDecoratorsTest() {
    // Arrange
    ImmutableUpdateDataFlowDecoratorsAction.Json json = new ImmutableUpdateDataFlowDecoratorsAction.Json();
    HashSet<EntityReference> entityReferenceSet = new HashSet<EntityReference>();
    entityReferenceSet.add(null);

    // Act
    json.setAddedDecorators(entityReferenceSet);

    // Assert
    assertSame(entityReferenceSet, json.addedDecorators);
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUpdateDataFlowDecoratorsAction.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableUpdateDataFlowDecoratorsAction.Builder builderResult = ImmutableUpdateDataFlowDecoratorsAction.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableUpdateDataFlowDecoratorsAction.Json());
  }
}


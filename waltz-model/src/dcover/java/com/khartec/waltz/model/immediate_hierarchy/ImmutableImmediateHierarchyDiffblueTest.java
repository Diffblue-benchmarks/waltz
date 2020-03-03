package com.khartec.waltz.model.immediate_hierarchy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableImmediateHierarchyDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void setChildrenTest() {
    // Arrange
    ImmutableImmediateHierarchy.Json<Object> json = new ImmutableImmediateHierarchy.Json<Object>();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act
    json.setChildren(objectList);

    // Assert
    assertSame(objectList, json.children);
  }
  @Test
  public void setSelfTest() {
    // Arrange
    ImmutableImmediateHierarchy.Json<Object> json = new ImmutableImmediateHierarchy.Json<Object>();

    // Act
    json.setSelf("foo");

    // Assert
    assertTrue(json.self instanceof String);
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableImmediateHierarchy.Json<Object>()).children.size());
  }
  @Test
  public void childrenTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableImmediateHierarchy.Json<Object>()).children();
  }
  @Test
  public void parentTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableImmediateHierarchy.Json<Object>()).parent();
  }
  @Test
  public void selfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableImmediateHierarchy.Json<Object>()).self();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableImmediateHierarchy.<Object>fromJson(new ImmutableImmediateHierarchy.Json<Object>());
  }
}


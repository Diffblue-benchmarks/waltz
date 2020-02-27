package com.khartec.waltz.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class ListUtilitiesDiffblueTest {
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ListUtilities.Builder<Object>()).build().size());
  }

  @Test
  public void addAllTest() {
    // Arrange
    ListUtilities.Builder<Object> builder = new ListUtilities.Builder<Object>();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertSame(builder, builder.addAll(objectList));
  }

  @Test
  public void pushTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(4, ListUtilities.<Object>push(objectList, "foo", "foo", "foo").size());
  }

  @Test
  public void isEmptyTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertFalse(ListUtilities.<Object>isEmpty(objectList));
  }

  @Test
  public void concatTest2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");
    ArrayList<Object> objectList1 = new ArrayList<Object>();
    objectList1.add("foo");
    ArrayList<Object> objectList2 = new ArrayList<Object>();
    objectList2.add("foo");

    // Act and Assert
    assertEquals(3, ListUtilities.<Object>concat(objectList, objectList1, objectList2).size());
  }

  @Test
  public void concatTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");
    ArrayList<Object> objectList1 = new ArrayList<Object>();
    objectList1.add("foo");
    ArrayList<Object> objectList2 = new ArrayList<Object>();
    objectList2.add("foo");
    List<Object>[] listArray = new List[10];
    listArray[0] = objectList;
    listArray[1] = objectList1;
    listArray[2] = objectList2;

    // Act and Assert
    assertEquals(3, ListUtilities.<Object>concat(listArray).size());
  }

  @Test
  public void dropTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, ListUtilities.<Object>drop(objectList, 3).size());
  }

  @Test
  public void reverseTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, ListUtilities.<Object>reverse(objectList).size());
  }

  @Test
  public void asListTest() {
    // Arrange, Act and Assert
    assertEquals(3, ListUtilities.<Object>asList("foo", "foo", "foo").size());
  }

  @Test
  public void integerRangeTest() {
    // Arrange and Act
    List<Integer> actualIntegerRangeResult = ListUtilities.integerRange(1, 3);

    // Assert
    assertEquals(2, actualIntegerRangeResult.size());
    assertEquals(Integer.valueOf(1), actualIntegerRangeResult.get(0));
    assertEquals(Integer.valueOf(2), actualIntegerRangeResult.get(1));
  }

  @Test
  public void ensureNotNullTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, ListUtilities.<Object>ensureNotNull(objectList).size());
  }

  @Test
  public void compactTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, ListUtilities.<Object>compact(objectList).size());
  }

  @Test
  public void appendTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(2, ListUtilities.<Object>append(objectList, "foo").size());
  }

  @Test
  public void newArrayListTest() {
    // Arrange, Act and Assert
    assertEquals(3, ListUtilities.<Object>newArrayList("foo", "foo", "foo").size());
  }
}


package com.khartec.waltz.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.jooq.lambda.tuple.Tuple0;
import org.junit.Test;

public class CollectionUtilitiesDiffblueTest {
  @Test
  public void isEmptyTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertFalse(CollectionUtilities.<Object>isEmpty(objectList));
  }

  @Test
  public void firstTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals("foo", CollectionUtilities.<Object>first(objectList));
  }

  @Test
  public void sortTest() {
    // Arrange
    ArrayList<Comparable> comparableList = new ArrayList<Comparable>();
    comparableList.add(new Tuple0());

    // Act and Assert
    assertEquals(1, CollectionUtilities.<Comparable>sort(comparableList).size());
  }

  @Test
  public void notEmptyTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertTrue(CollectionUtilities.<Object>notEmpty(objectList));
  }
}


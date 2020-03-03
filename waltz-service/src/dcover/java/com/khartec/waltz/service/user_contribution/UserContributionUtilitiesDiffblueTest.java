package com.khartec.waltz.service.user_contribution;

import static org.junit.Assert.assertEquals;
import com.khartec.waltz.model.tally.OrderedTally;
import java.util.ArrayList;
import org.junit.Test;

public class UserContributionUtilitiesDiffblueTest {
  @Test
  public void findWindowTest2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, UserContributionUtilities.<Object>findWindow(objectList, Integer.valueOf(747), 3).size());
  }

  @Test
  public void findWindowTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, UserContributionUtilities.<Object>findWindow(objectList, 1, 3).size());
  }

  @Test
  public void getOrderedListOf10Test() {
    // Arrange, Act and Assert
    assertEquals(0, UserContributionUtilities.getOrderedListOf10(new ArrayList<OrderedTally<String>>(), "123").size());
  }
}


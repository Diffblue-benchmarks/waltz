package com.khartec.waltz.web.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityStatisticQueryOptionsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityStatisticQueryOptions.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableEntityStatisticQueryOptions.Json()).statisticIds.size());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityStatisticQueryOptions.copyOf(new ImmutableEntityStatisticQueryOptions.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityStatisticQueryOptions.fromJson(new ImmutableEntityStatisticQueryOptions.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityStatisticQueryOptions.Builder builderResult = ImmutableEntityStatisticQueryOptions.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityStatisticQueryOptions.Json());
  }

  @Test
  public void selectorTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticQueryOptions.Json()).selector();
  }

  @Test
  public void setStatisticIdsTest() {
    // Arrange
    ImmutableEntityStatisticQueryOptions.Json json = new ImmutableEntityStatisticQueryOptions.Json();
    ArrayList<Long> resultLongList = new ArrayList<Long>();
    resultLongList.add(Long.valueOf(1L));

    // Act
    json.setStatisticIds(resultLongList);

    // Assert
    assertSame(resultLongList, json.statisticIds);
  }

  @Test
  public void statisticIdsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticQueryOptions.Json()).statisticIds();
  }
}


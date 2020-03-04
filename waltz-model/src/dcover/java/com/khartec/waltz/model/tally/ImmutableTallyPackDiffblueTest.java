package com.khartec.waltz.model.tally;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableTallyPackDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableTallyPack.Json<Object>()).tallies.size());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableTallyPack.<Object>copyOf(new ImmutableTallyPack.Json<Object>());
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTallyPack.Json<Object>()).entityReference();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableTallyPack.<Object>fromJson(new ImmutableTallyPack.Json<Object>());
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTallyPack.Json<Object>()).lastUpdatedAt();
  }
  @Test
  public void setTalliesTest() {
    // Arrange
    ImmutableTallyPack.Json<Object> json = new ImmutableTallyPack.Json<Object>();
    ArrayList<Tally<Object>> tallyList = new ArrayList<Tally<Object>>();
    tallyList.add(new ImmutableOrderedTally.Json<Object>());

    // Act
    json.setTallies(tallyList);

    // Assert
    assertSame(tallyList, json.tallies);
  }
  @Test
  public void talliesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableTallyPack.Json<Object>()).tallies();
  }
}


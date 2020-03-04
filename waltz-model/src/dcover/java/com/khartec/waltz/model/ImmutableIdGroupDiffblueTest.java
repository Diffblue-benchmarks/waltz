package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableIdGroupDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableIdGroup.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableIdGroup.Json()).values.size());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableIdGroup.copyOf(new ImmutableIdGroup.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableIdGroup.fromJson(new ImmutableIdGroup.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableIdGroup.Builder builderResult = ImmutableIdGroup.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableIdGroup.Json());
  }

  @Test
  public void keyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableIdGroup.Json()).key();
  }

  @Test
  public void setKeyTest() {
    // Arrange
    ImmutableIdGroup.Json json = new ImmutableIdGroup.Json();

    // Act
    json.setKey(Long.valueOf(1L));

    // Assert
    assertEquals(Long.valueOf(1L), json.key);
  }

  @Test
  public void setValuesTest() {
    // Arrange
    ImmutableIdGroup.Json json = new ImmutableIdGroup.Json();
    ArrayList<Long> resultLongList = new ArrayList<Long>();
    resultLongList.add(Long.valueOf(1L));

    // Act
    json.setValues(resultLongList);

    // Assert
    assertSame(resultLongList, json.values);
  }

  @Test
  public void valuesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableIdGroup.Json()).values();
  }
}


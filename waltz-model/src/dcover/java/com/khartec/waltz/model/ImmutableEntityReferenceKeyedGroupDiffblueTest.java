package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityReferenceKeyedGroupDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityReferenceKeyedGroup.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableEntityReferenceKeyedGroup.Json()).values.size());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityReferenceKeyedGroup.copyOf(new ImmutableEntityReferenceKeyedGroup.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityReferenceKeyedGroup.fromJson(new ImmutableEntityReferenceKeyedGroup.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityReferenceKeyedGroup.Builder builderResult = ImmutableEntityReferenceKeyedGroup.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityReferenceKeyedGroup.Json());
  }
  @Test
  public void keyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityReferenceKeyedGroup.Json()).key();
  }
  @Test
  public void setKeyTest() {
    // Arrange
    ImmutableEntityReferenceKeyedGroup.Json json = new ImmutableEntityReferenceKeyedGroup.Json();
    ImmutableEntityReference.Json json1 = new ImmutableEntityReference.Json();

    // Act
    json.setKey(json1);

    // Assert
    assertSame(json1, json.key);
  }
  @Test
  public void setValuesTest() {
    // Arrange
    ImmutableEntityReferenceKeyedGroup.Json json = new ImmutableEntityReferenceKeyedGroup.Json();
    ArrayList<EntityReference> entityReferenceList = new ArrayList<EntityReference>();
    entityReferenceList.add(new ImmutableEntityReference.Json());

    // Act
    json.setValues(entityReferenceList);

    // Assert
    assertSame(entityReferenceList, json.values);
  }
  @Test
  public void valuesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityReferenceKeyedGroup.Json()).values();
  }
}


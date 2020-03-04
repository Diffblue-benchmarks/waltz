package com.khartec.waltz.web.action;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.EntityReference;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableUpdateAppCapabilitiesActionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void additionsTest() {
    // Arrange
    ImmutableUpdateAppCapabilitiesAction.Json json = new ImmutableUpdateAppCapabilitiesAction.Json();

    // Act
    List<EntityReference> actualAdditionsResult = ImmutableUpdateAppCapabilitiesAction.fromJson(json).additions();

    // Assert
    assertSame(json.additions, actualAdditionsResult);
    assertEquals(0, actualAdditionsResult.size());
  }
  @Test
  public void additionsTest2() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUpdateAppCapabilitiesAction.Json()).additions();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    assertEquals("UpdateAppCapabilitiesAction{additions=[]," + " removals=[]}",
        ImmutableUpdateAppCapabilitiesAction.builder().build().toString());
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableUpdateAppCapabilitiesAction.Json actualJson = new ImmutableUpdateAppCapabilitiesAction.Json();

    // Assert
    List<EntityReference> entityReferenceList = actualJson.removals;
    List<EntityReference> actualEntityReferenceList = actualJson.additions;
    assertEquals(0, entityReferenceList.size());
    assertSame(entityReferenceList, actualEntityReferenceList);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableUpdateAppCapabilitiesAction.copyOf(new ImmutableUpdateAppCapabilitiesAction.Json());
  }
  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(ImmutableUpdateAppCapabilitiesAction.fromJson(new ImmutableUpdateAppCapabilitiesAction.Json())
        .equals("element"));
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    assertEquals("UpdateAppCapabilitiesAction{additions=[]," + " removals=[]}",
        ImmutableUpdateAppCapabilitiesAction.fromJson(new ImmutableUpdateAppCapabilitiesAction.Json()).toString());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableUpdateAppCapabilitiesAction.Builder builderResult = ImmutableUpdateAppCapabilitiesAction.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableUpdateAppCapabilitiesAction.Json());
  }
  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(5859943,
        ImmutableUpdateAppCapabilitiesAction.fromJson(new ImmutableUpdateAppCapabilitiesAction.Json()).hashCode());
  }
  @Test
  public void removalsTest() {
    // Arrange
    ImmutableUpdateAppCapabilitiesAction.Json json = new ImmutableUpdateAppCapabilitiesAction.Json();

    // Act
    List<EntityReference> actualRemovalsResult = ImmutableUpdateAppCapabilitiesAction.fromJson(json).removals();

    // Assert
    assertSame(json.additions, actualRemovalsResult);
    assertEquals(0, actualRemovalsResult.size());
  }
  @Test
  public void removalsTest2() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUpdateAppCapabilitiesAction.Json()).removals();
  }
  @Test
  public void setAdditionsTest() {
    // Arrange
    ImmutableUpdateAppCapabilitiesAction.Json json = new ImmutableUpdateAppCapabilitiesAction.Json();
    ArrayList<EntityReference> entityReferenceList = new ArrayList<EntityReference>();
    entityReferenceList.add(null);

    // Act
    json.setAdditions(entityReferenceList);

    // Assert
    assertSame(entityReferenceList, json.additions);
  }
  @Test
  public void setRemovalsTest() {
    // Arrange
    ImmutableUpdateAppCapabilitiesAction.Json json = new ImmutableUpdateAppCapabilitiesAction.Json();
    ArrayList<EntityReference> entityReferenceList = new ArrayList<EntityReference>();
    entityReferenceList.add(null);

    // Act
    json.setRemovals(entityReferenceList);

    // Assert
    assertSame(entityReferenceList, json.removals);
  }
  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("UpdateAppCapabilitiesAction{additions=[]," + " removals=[]}",
        ImmutableUpdateAppCapabilitiesAction.fromJson(new ImmutableUpdateAppCapabilitiesAction.Json()).toString());
  }
}


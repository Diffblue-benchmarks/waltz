package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.application.ApplicationKind;
import java.util.ArrayList;
import java.util.HashSet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSelectionFiltersDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    assertEquals("SelectionFilters{omitApplicationKinds=[]}",
        ImmutableSelectionFilters.fromJson(new ImmutableSelectionFilters.Json()).toString());
  }

  @Test
  public void omitApplicationKindsTest2() {
    // Arrange, Act and Assert
    assertEquals(0,
        ImmutableSelectionFilters.fromJson(new ImmutableSelectionFilters.Json()).omitApplicationKinds().size());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(ImmutableSelectionFilters.fromJson(new ImmutableSelectionFilters.Json()).equals("element"));
  }

  @Test
  public void withOmitApplicationKindsTest2() {
    // Arrange
    ImmutableSelectionFilters fromJsonResult = ImmutableSelectionFilters.fromJson(new ImmutableSelectionFilters.Json());
    ArrayList<ApplicationKind> applicationKindList = new ArrayList<ApplicationKind>();
    applicationKindList.add(ApplicationKind.IN_HOUSE);

    // Act and Assert
    assertEquals("SelectionFilters{omitApplicationKinds=[IN_HOUSE]}",
        fromJsonResult.withOmitApplicationKinds(applicationKindList).toString());
  }

  @Test
  public void withOmitApplicationKindsTest() {
    // Arrange, Act and Assert
    assertEquals("SelectionFilters{omitApplicationKinds=[IN_HOUSE]}",
        ImmutableSelectionFilters.fromJson(new ImmutableSelectionFilters.Json())
            .withOmitApplicationKinds(ApplicationKind.IN_HOUSE, ApplicationKind.IN_HOUSE, ApplicationKind.IN_HOUSE)
            .toString());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSelectionFilters.copyOf(new ImmutableSelectionFilters.Json());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(177573, ImmutableSelectionFilters.fromJson(new ImmutableSelectionFilters.Json()).hashCode());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("SelectionFilters{omitApplicationKinds=[]}",
        ImmutableSelectionFilters.fromJson(new ImmutableSelectionFilters.Json()).toString());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    assertEquals("SelectionFilters{omitApplicationKinds=[]}", ImmutableSelectionFilters.builder().build().toString());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableSelectionFilters.Builder builderResult = ImmutableSelectionFilters.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSelectionFilters.Json());
  }

  @Test
  public void omitApplicationKindsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSelectionFilters.Json()).omitApplicationKinds();
  }

  @Test
  public void setOmitApplicationKindsTest() {
    // Arrange
    ImmutableSelectionFilters.Json json = new ImmutableSelectionFilters.Json();
    HashSet<ApplicationKind> applicationKindSet = new HashSet<ApplicationKind>();
    applicationKindSet.add(ApplicationKind.IN_HOUSE);

    // Act
    json.setOmitApplicationKinds(applicationKindSet);

    // Assert
    assertSame(applicationKindSet, json.omitApplicationKinds);
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableSelectionFilters.Json()).omitApplicationKinds.size());
  }
}


package com.khartec.waltz.model.orgunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableOrganisationalUnitHierarchyDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableOrganisationalUnitHierarchy.copyOf(new ImmutableOrganisationalUnitHierarchy.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableOrganisationalUnitHierarchy.fromJson(new ImmutableOrganisationalUnitHierarchy.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableOrganisationalUnitHierarchy.Builder builderResult = ImmutableOrganisationalUnitHierarchy.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableOrganisationalUnitHierarchy.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableOrganisationalUnitHierarchy.builder().build();
  }
  @Test
  public void parentsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableOrganisationalUnitHierarchy.Json()).parents();
  }
  @Test
  public void setParentsTest() {
    // Arrange
    ImmutableOrganisationalUnitHierarchy.Json json = new ImmutableOrganisationalUnitHierarchy.Json();
    ArrayList<OrganisationalUnit> organisationalUnitList = new ArrayList<OrganisationalUnit>();
    organisationalUnitList.add(new ImmutableOrganisationalUnit.Json());

    // Act
    json.setParents(organisationalUnitList);

    // Assert
    assertSame(organisationalUnitList, json.parents);
  }
  @Test
  public void setChildrenTest() {
    // Arrange
    ImmutableOrganisationalUnitHierarchy.Json json = new ImmutableOrganisationalUnitHierarchy.Json();
    ArrayList<OrganisationalUnit> organisationalUnitList = new ArrayList<OrganisationalUnit>();
    organisationalUnitList.add(new ImmutableOrganisationalUnit.Json());

    // Act
    json.setChildren(organisationalUnitList);

    // Assert
    assertSame(organisationalUnitList, json.children);
  }
  @Test
  public void setUnitTest() {
    // Arrange
    ImmutableOrganisationalUnitHierarchy.Json json = new ImmutableOrganisationalUnitHierarchy.Json();
    ImmutableOrganisationalUnit.Json json1 = new ImmutableOrganisationalUnit.Json();

    // Act
    json.setUnit(json1);

    // Assert
    assertSame(json1, json.unit);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableOrganisationalUnitHierarchy.Json actualJson = new ImmutableOrganisationalUnitHierarchy.Json();

    // Assert
    List<OrganisationalUnit> organisationalUnitList = actualJson.children;
    List<OrganisationalUnit> actualOrganisationalUnitList = actualJson.parents;
    assertEquals(0, organisationalUnitList.size());
    assertSame(organisationalUnitList, actualOrganisationalUnitList);
  }
  @Test
  public void childrenTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableOrganisationalUnitHierarchy.Json()).children();
  }
  @Test
  public void unitTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableOrganisationalUnitHierarchy.Json()).unit();
  }
}


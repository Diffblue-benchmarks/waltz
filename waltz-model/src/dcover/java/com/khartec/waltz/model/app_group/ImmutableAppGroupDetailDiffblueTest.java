package com.khartec.waltz.model.app_group;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.EntityReference;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAppGroupDetailDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void appGroupTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppGroupDetail.Json()).appGroup();
  }
  @Test
  public void applicationsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppGroupDetail.Json()).applications();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAppGroupDetail.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAppGroupDetail.Json actualJson = new ImmutableAppGroupDetail.Json();

    // Assert
    List<AppGroupMember> actualAppGroupMemberList = actualJson.members;
    List<EntityReference> actualEntityReferenceList = actualJson.applications;
    List<EntityReference> entityReferenceList = actualJson.organisationalUnits;
    assertEquals(0, entityReferenceList.size());
    assertSame(entityReferenceList, actualEntityReferenceList);
    assertSame(entityReferenceList, actualAppGroupMemberList);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAppGroupDetail.copyOf(new ImmutableAppGroupDetail.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAppGroupDetail.fromJson(new ImmutableAppGroupDetail.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAppGroupDetail.Builder builderResult = ImmutableAppGroupDetail.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAppGroupDetail.Json());
  }
  @Test
  public void membersTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppGroupDetail.Json()).members();
  }
  @Test
  public void organisationalUnitsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppGroupDetail.Json()).organisationalUnits();
  }
  @Test
  public void setAppGroupTest() {
    // Arrange
    ImmutableAppGroupDetail.Json json = new ImmutableAppGroupDetail.Json();
    ImmutableAppGroup.Json json1 = new ImmutableAppGroup.Json();

    // Act
    json.setAppGroup(json1);

    // Assert
    assertSame(json1, json.appGroup);
  }
  @Test
  public void setApplicationsTest() {
    // Arrange
    ImmutableAppGroupDetail.Json json = new ImmutableAppGroupDetail.Json();
    ArrayList<EntityReference> entityReferenceList = new ArrayList<EntityReference>();
    entityReferenceList.add(null);

    // Act
    json.setApplications(entityReferenceList);

    // Assert
    assertSame(entityReferenceList, json.applications);
  }
  @Test
  public void setMembersTest() {
    // Arrange
    ImmutableAppGroupDetail.Json json = new ImmutableAppGroupDetail.Json();
    ArrayList<AppGroupMember> appGroupMemberList = new ArrayList<AppGroupMember>();
    appGroupMemberList.add(new ImmutableAppGroupMember.Json());

    // Act
    json.setMembers(appGroupMemberList);

    // Assert
    assertSame(appGroupMemberList, json.members);
  }
  @Test
  public void setOrganisationalUnitsTest() {
    // Arrange
    ImmutableAppGroupDetail.Json json = new ImmutableAppGroupDetail.Json();
    ArrayList<EntityReference> entityReferenceList = new ArrayList<EntityReference>();
    entityReferenceList.add(null);

    // Act
    json.setOrganisationalUnits(entityReferenceList);

    // Assert
    assertSame(entityReferenceList, json.organisationalUnits);
  }
}


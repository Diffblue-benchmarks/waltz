package com.khartec.waltz.model.change_unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.assessment_rating.AssessmentRatingDetail;
import java.util.HashSet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalFlowChangeUnitViewItemDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void changeUnitTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowChangeUnitViewItem.Json()).changeUnit();
  }
  @Test
  public void logicalFlowTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowChangeUnitViewItem.Json()).logicalFlow();
  }
  @Test
  public void setChangeUnitTest() {
    // Arrange
    ImmutablePhysicalFlowChangeUnitViewItem.Json json = new ImmutablePhysicalFlowChangeUnitViewItem.Json();
    ImmutableChangeUnit.Json json1 = new ImmutableChangeUnit.Json();

    // Act
    json.setChangeUnit(json1);

    // Assert
    assertSame(json1, json.changeUnit);
  }
  @Test
  public void setAssessmentsTest() {
    // Arrange
    ImmutablePhysicalFlowChangeUnitViewItem.Json json = new ImmutablePhysicalFlowChangeUnitViewItem.Json();
    HashSet<AssessmentRatingDetail> assessmentRatingDetailSet = new HashSet<AssessmentRatingDetail>();
    assessmentRatingDetailSet.add(null);

    // Act
    json.setAssessments(assessmentRatingDetailSet);

    // Assert
    assertSame(assessmentRatingDetailSet, json.assessments);
  }
  @Test
  public void physicalSpecificationTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowChangeUnitViewItem.Json()).physicalSpecification();
  }
  @Test
  public void assessmentsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowChangeUnitViewItem.Json()).assessments();
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutablePhysicalFlowChangeUnitViewItem.Json()).assessments.size());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowChangeUnitViewItem.fromJson(new ImmutablePhysicalFlowChangeUnitViewItem.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalFlowChangeUnitViewItem.copyOf(new ImmutablePhysicalFlowChangeUnitViewItem.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutablePhysicalFlowChangeUnitViewItem.Builder builderResult = ImmutablePhysicalFlowChangeUnitViewItem.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalFlowChangeUnitViewItem.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowChangeUnitViewItem.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalFlowChangeUnitViewItem.Builder builderResult = ImmutablePhysicalFlowChangeUnitViewItem.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ChangeUnitViewItem) new ImmutablePhysicalFlowChangeUnitViewItem.Json());
  }
}


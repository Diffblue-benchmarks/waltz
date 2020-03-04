package com.khartec.waltz.web.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.survey.SurveyQuestionDropdownEntry;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyQuestionInfoDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyQuestionInfo.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableSurveyQuestionInfo.Json()).dropdownEntries.size());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyQuestionInfo.copyOf(new ImmutableSurveyQuestionInfo.Json());
  }
  @Test
  public void dropdownEntriesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestionInfo.Json()).dropdownEntries();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyQuestionInfo.fromJson(new ImmutableSurveyQuestionInfo.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyQuestionInfo.Builder builderResult = ImmutableSurveyQuestionInfo.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyQuestionInfo.Json());
  }
  @Test
  public void questionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestionInfo.Json()).question();
  }
  @Test
  public void setDropdownEntriesTest() {
    // Arrange
    ImmutableSurveyQuestionInfo.Json json = new ImmutableSurveyQuestionInfo.Json();
    ArrayList<SurveyQuestionDropdownEntry> surveyQuestionDropdownEntryList = new ArrayList<SurveyQuestionDropdownEntry>();
    surveyQuestionDropdownEntryList.add(null);

    // Act
    json.setDropdownEntries(surveyQuestionDropdownEntryList);

    // Assert
    assertSame(surveyQuestionDropdownEntryList, json.dropdownEntries);
  }
}


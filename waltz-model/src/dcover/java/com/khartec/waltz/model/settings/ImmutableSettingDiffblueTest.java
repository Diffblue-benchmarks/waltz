package com.khartec.waltz.model.settings;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSettingDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSetting.fromJson(new ImmutableSetting.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSetting.copyOf(new ImmutableSetting.Json());
  }
  @Test
  public void restrictedTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSetting.Json()).restricted();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSetting.Json()).name();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableSetting.Json json = new ImmutableSetting.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSetting.Json actualJson = new ImmutableSetting.Json();

    // Assert
    assertFalse(actualJson.restricted);
    assertNull(actualJson.name);
    assertFalse(actualJson.restrictedIsSet);
  }
  @Test
  public void valueTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSetting.Json()).value();
  }
  @Test
  public void setRestrictedTest() {
    // Arrange
    ImmutableSetting.Json json = new ImmutableSetting.Json();

    // Act
    json.setRestricted(true);

    // Assert
    assertTrue(json.restricted);
    assertTrue(json.restrictedIsSet);
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSetting.Builder builderResult = ImmutableSetting.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSetting.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSetting.Builder builderResult = ImmutableSetting.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableSetting.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSetting.builder().build();
  }
}


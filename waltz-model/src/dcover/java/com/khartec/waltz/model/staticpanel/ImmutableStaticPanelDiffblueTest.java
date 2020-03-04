package com.khartec.waltz.model.staticpanel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.IdProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableStaticPanelDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableStaticPanel.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableStaticPanel.Json actualJson = new ImmutableStaticPanel.Json();

    // Assert
    assertFalse(actualJson.widthIsSet);
    assertFalse(actualJson.priorityIsSet);
    assertEquals(0, actualJson.width);
    assertNull(actualJson.title);
    assertNull(actualJson.encoding);
    assertNull(actualJson.icon);
    assertNull(actualJson.content);
    assertNull(actualJson.group);
    assertEquals(0, actualJson.priority);
  }
  @Test
  public void contentTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableStaticPanel.Json()).content();
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableStaticPanel.copyOf(new ImmutableStaticPanel.Json());
  }
  @Test
  public void encodingTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableStaticPanel.Json()).encoding();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableStaticPanel.fromJson(new ImmutableStaticPanel.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableStaticPanel.Builder builderResult = ImmutableStaticPanel.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableStaticPanel.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableStaticPanel.Builder builderResult = ImmutableStaticPanel.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableStaticPanel.Json());
  }
  @Test
  public void groupTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableStaticPanel.Json()).group();
  }
  @Test
  public void iconTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableStaticPanel.Json()).icon();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableStaticPanel.Json()).id();
  }
  @Test
  public void priorityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableStaticPanel.Json()).priority();
  }
  @Test
  public void setContentTest() {
    // Arrange
    ImmutableStaticPanel.Json json = new ImmutableStaticPanel.Json();

    // Act
    json.setContent("content");

    // Assert
    assertEquals("content", json.content);
  }
  @Test
  public void setEncodingTest() {
    // Arrange
    ImmutableStaticPanel.Json json = new ImmutableStaticPanel.Json();

    // Act
    json.setEncoding(ContentKind.HTML);

    // Assert
    assertEquals(ContentKind.HTML, json.encoding);
  }
  @Test
  public void setGroupTest() {
    // Arrange
    ImmutableStaticPanel.Json json = new ImmutableStaticPanel.Json();

    // Act
    json.setGroup("group");

    // Assert
    assertEquals("group", json.group);
  }
  @Test
  public void setIconTest() {
    // Arrange
    ImmutableStaticPanel.Json json = new ImmutableStaticPanel.Json();

    // Act
    json.setIcon("icon");

    // Assert
    assertEquals("icon", json.icon);
  }
  @Test
  public void setPriorityTest() {
    // Arrange
    ImmutableStaticPanel.Json json = new ImmutableStaticPanel.Json();

    // Act
    json.setPriority(1);

    // Assert
    assertTrue(json.priorityIsSet);
    assertEquals(1, json.priority);
  }
  @Test
  public void setTitleTest() {
    // Arrange
    ImmutableStaticPanel.Json json = new ImmutableStaticPanel.Json();

    // Act
    json.setTitle("title");

    // Assert
    assertEquals("title", json.title);
  }
  @Test
  public void setWidthTest() {
    // Arrange
    ImmutableStaticPanel.Json json = new ImmutableStaticPanel.Json();

    // Act
    json.setWidth(1);

    // Assert
    assertTrue(json.widthIsSet);
    assertEquals(1, json.width);
  }
  @Test
  public void titleTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableStaticPanel.Json()).title();
  }
  @Test
  public void widthTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableStaticPanel.Json()).width();
  }
}


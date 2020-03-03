package com.khartec.waltz.web.action;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAppChangeActionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAppChangeAction.builder().build();
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableAppChangeAction.Builder builderResult = ImmutableAppChangeAction.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAppChangeAction.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAppChangeAction.fromJson(new ImmutableAppChangeAction.Json());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAppChangeAction.copyOf(new ImmutableAppChangeAction.Json());
  }

  @Test
  public void appTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppChangeAction.Json()).app();
  }

  @Test
  public void setChangesTest() {
    // Arrange
    ImmutableAppChangeAction.Json json = new ImmutableAppChangeAction.Json();
    ArrayList<FieldChange> fieldChangeList = new ArrayList<FieldChange>();
    fieldChangeList.add(new ImmutableFieldChange.Json());

    // Act
    json.setChanges(fieldChangeList);

    // Assert
    assertSame(fieldChangeList, json.changes);
  }

  @Test
  public void changesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppChangeAction.Json()).changes();
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableAppChangeAction.Json()).changes.size());
  }
}


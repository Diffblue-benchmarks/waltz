package com.khartec.waltz.web.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.database_information.DatabaseInformation;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableApplicationDatabasesDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void applicationIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplicationDatabases.Json()).applicationId();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableApplicationDatabases.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableApplicationDatabases.Json()).databases.size());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableApplicationDatabases.copyOf(new ImmutableApplicationDatabases.Json());
  }
  @Test
  public void databasesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplicationDatabases.Json()).databases();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableApplicationDatabases.fromJson(new ImmutableApplicationDatabases.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableApplicationDatabases.Builder builderResult = ImmutableApplicationDatabases.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableApplicationDatabases.Json());
  }
  @Test
  public void setApplicationIdTest() {
    // Arrange
    ImmutableApplicationDatabases.Json json = new ImmutableApplicationDatabases.Json();

    // Act
    json.setApplicationId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.applicationId);
  }
  @Test
  public void setDatabasesTest() {
    // Arrange
    ImmutableApplicationDatabases.Json json = new ImmutableApplicationDatabases.Json();
    ArrayList<DatabaseInformation> databaseInformationList = new ArrayList<DatabaseInformation>();
    databaseInformationList.add(null);

    // Act
    json.setDatabases(databaseInformationList);

    // Assert
    assertSame(databaseInformationList, json.databases);
  }
}


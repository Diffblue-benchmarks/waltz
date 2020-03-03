package com.khartec.waltz.model.database_information;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.AssetCodeProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.LifecycleStatus;
import com.khartec.waltz.model.ProvenanceProvider;
import java.util.Date;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableDatabaseInformationDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableDatabaseInformation.copyOf(new ImmutableDatabaseInformation.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableDatabaseInformation.fromJson(new ImmutableDatabaseInformation.Json());
  }
  @Test
  public void assetCodeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDatabaseInformation.Json()).assetCode();
  }
  @Test
  public void dbmsVendorTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDatabaseInformation.Json()).dbmsVendor();
  }
  @Test
  public void setEnvironmentTest() {
    // Arrange
    ImmutableDatabaseInformation.Json json = new ImmutableDatabaseInformation.Json();

    // Act
    json.setEnvironment("foo");

    // Assert
    assertEquals("foo", json.environment);
  }
  @Test
  public void endOfLifeStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDatabaseInformation.Json()).endOfLifeStatus();
  }
  @Test
  public void setDatabaseNameTest() {
    // Arrange
    ImmutableDatabaseInformation.Json json = new ImmutableDatabaseInformation.Json();

    // Act
    json.setDatabaseName("name");

    // Assert
    assertEquals("name", json.databaseName);
  }
  @Test
  public void setAssetCodeTest() {
    // Arrange
    ImmutableDatabaseInformation.Json json = new ImmutableDatabaseInformation.Json();

    // Act
    json.setAssetCode("foo");

    // Assert
    assertEquals("foo", json.assetCode);
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDatabaseInformation.Json()).provenance();
  }
  @Test
  public void dbmsVersionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDatabaseInformation.Json()).dbmsVersion();
  }
  @Test
  public void setInstanceNameTest() {
    // Arrange
    ImmutableDatabaseInformation.Json json = new ImmutableDatabaseInformation.Json();

    // Act
    json.setInstanceName("name");

    // Assert
    assertEquals("name", json.instanceName);
  }
  @Test
  public void setEndOfLifeDateTest() {
    // Arrange
    Date date = new Date(1L);
    ImmutableDatabaseInformation.Json json = new ImmutableDatabaseInformation.Json();

    // Act
    json.setEndOfLifeDate(date);

    // Assert
    assertSame(date, json.endOfLifeDate);
  }
  @Test
  public void lifecycleStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDatabaseInformation.Json()).lifecycleStatus();
  }
  @Test
  public void setDbmsNameTest() {
    // Arrange
    ImmutableDatabaseInformation.Json json = new ImmutableDatabaseInformation.Json();

    // Act
    json.setDbmsName("name");

    // Assert
    assertEquals("name", json.dbmsName);
  }
  @Test
  public void environmentTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDatabaseInformation.Json()).environment();
  }
  @Test
  public void setLifecycleStatusTest() {
    // Arrange
    ImmutableDatabaseInformation.Json json = new ImmutableDatabaseInformation.Json();

    // Act
    json.setLifecycleStatus(LifecycleStatus.ACTIVE);

    // Assert
    assertEquals(LifecycleStatus.ACTIVE, json.lifecycleStatus);
  }
  @Test
  public void setDbmsVendorTest() {
    // Arrange
    ImmutableDatabaseInformation.Json json = new ImmutableDatabaseInformation.Json();

    // Act
    json.setDbmsVendor("foo");

    // Assert
    assertEquals("foo", json.dbmsVendor);
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDatabaseInformation.Json()).externalId();
  }
  @Test
  public void dbmsNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDatabaseInformation.Json()).dbmsName();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableDatabaseInformation.Json actualJson = new ImmutableDatabaseInformation.Json();

    // Assert
    assertNull(actualJson.databaseName);
    assertNull(actualJson.endOfLifeDate);
    assertNull(actualJson.lifecycleStatus);
    assertNull(actualJson.environment);
    assertNull(actualJson.dbmsVendor);
    assertNull(actualJson.dbmsVersion);
    assertNull(actualJson.dbmsName);
    assertNull(actualJson.provenance);
    assertNull(actualJson.assetCode);
    assertNull(actualJson.instanceName);
  }
  @Test
  public void instanceNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDatabaseInformation.Json()).instanceName();
  }
  @Test
  public void databaseNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDatabaseInformation.Json()).databaseName();
  }
  @Test
  public void setDbmsVersionTest() {
    // Arrange
    ImmutableDatabaseInformation.Json json = new ImmutableDatabaseInformation.Json();

    // Act
    json.setDbmsVersion("foo");

    // Assert
    assertEquals("foo", json.dbmsVersion);
  }
  @Test
  public void endOfLifeDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDatabaseInformation.Json()).endOfLifeDate();
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableDatabaseInformation.Json json = new ImmutableDatabaseInformation.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableDatabaseInformation.Builder builderResult = ImmutableDatabaseInformation.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableDatabaseInformation.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableDatabaseInformation.builder().build();
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableDatabaseInformation.Builder builderResult = ImmutableDatabaseInformation.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableDatabaseInformation.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableDatabaseInformation.Builder builderResult = ImmutableDatabaseInformation.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableDatabaseInformation.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableDatabaseInformation.Builder builderResult = ImmutableDatabaseInformation.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((AssetCodeProvider) new ImmutableDatabaseInformation.Json());
  }
}


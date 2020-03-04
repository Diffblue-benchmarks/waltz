package com.khartec.waltz.model.server_information;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LifecycleStatus;
import com.khartec.waltz.model.ProvenanceProvider;
import java.util.Date;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableServerInformationDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableServerInformation.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableServerInformation.Json actualJson = new ImmutableServerInformation.Json();

    // Assert
    assertSame(actualJson.externalId, actualJson.id);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableServerInformation.copyOf(new ImmutableServerInformation.Json());
  }
  @Test
  public void countryTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerInformation.Json()).country();
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerInformation.Json()).externalId();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableServerInformation.fromJson(new ImmutableServerInformation.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableServerInformation.Builder builderResult = ImmutableServerInformation.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableServerInformation.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableServerInformation.Builder builderResult = ImmutableServerInformation.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableServerInformation.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableServerInformation.Builder builderResult = ImmutableServerInformation.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableServerInformation.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableServerInformation.Builder builderResult = ImmutableServerInformation.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableServerInformation.Json());
  }
  @Test
  public void hardwareEndOfLifeDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerInformation.Json()).hardwareEndOfLifeDate();
  }
  @Test
  public void hardwareEndOfLifeStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerInformation.Json()).hardwareEndOfLifeStatus();
  }
  @Test
  public void hostnameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerInformation.Json()).hostname();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerInformation.Json()).id();
  }
  @Test
  public void lifecycleStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerInformation.Json()).lifecycleStatus();
  }
  @Test
  public void locationTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerInformation.Json()).location();
  }
  @Test
  public void operatingSystemEndOfLifeDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerInformation.Json()).operatingSystemEndOfLifeDate();
  }
  @Test
  public void operatingSystemEndOfLifeStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerInformation.Json()).operatingSystemEndOfLifeStatus();
  }
  @Test
  public void operatingSystemTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerInformation.Json()).operatingSystem();
  }
  @Test
  public void operatingSystemVersionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerInformation.Json()).operatingSystemVersion();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerInformation.Json()).provenance();
  }
  @Test
  public void setCountryTest() {
    // Arrange
    ImmutableServerInformation.Json json = new ImmutableServerInformation.Json();

    // Act
    json.setCountry("country");

    // Assert
    assertEquals("country", json.country);
  }
  @Test
  public void setHardwareEndOfLifeDateTest() {
    // Arrange
    Date date = new Date(1L);
    ImmutableServerInformation.Json json = new ImmutableServerInformation.Json();

    // Act
    json.setHardwareEndOfLifeDate(date);

    // Assert
    assertSame(date, json.hardwareEndOfLifeDate);
  }
  @Test
  public void setHostnameTest() {
    // Arrange
    ImmutableServerInformation.Json json = new ImmutableServerInformation.Json();

    // Act
    json.setHostname("localhost");

    // Assert
    assertEquals("localhost", json.hostname);
  }
  @Test
  public void setLifecycleStatusTest() {
    // Arrange
    ImmutableServerInformation.Json json = new ImmutableServerInformation.Json();

    // Act
    json.setLifecycleStatus(LifecycleStatus.ACTIVE);

    // Assert
    assertEquals(LifecycleStatus.ACTIVE, json.lifecycleStatus);
  }
  @Test
  public void setLocationTest() {
    // Arrange
    ImmutableServerInformation.Json json = new ImmutableServerInformation.Json();

    // Act
    json.setLocation("location");

    // Assert
    assertEquals("location", json.location);
  }
  @Test
  public void setOperatingSystemEndOfLifeDateTest() {
    // Arrange
    Date date = new Date(1L);
    ImmutableServerInformation.Json json = new ImmutableServerInformation.Json();

    // Act
    json.setOperatingSystemEndOfLifeDate(date);

    // Assert
    assertSame(date, json.operatingSystemEndOfLifeDate);
  }
  @Test
  public void setOperatingSystemTest() {
    // Arrange
    ImmutableServerInformation.Json json = new ImmutableServerInformation.Json();

    // Act
    json.setOperatingSystem("operatingSystem");

    // Assert
    assertEquals("operatingSystem", json.operatingSystem);
  }
  @Test
  public void setOperatingSystemVersionTest() {
    // Arrange
    ImmutableServerInformation.Json json = new ImmutableServerInformation.Json();

    // Act
    json.setOperatingSystemVersion("operatingSystemVersion");

    // Assert
    assertEquals("operatingSystemVersion", json.operatingSystemVersion);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableServerInformation.Json json = new ImmutableServerInformation.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }
  @Test
  public void setVirtualTest() {
    // Arrange
    ImmutableServerInformation.Json json = new ImmutableServerInformation.Json();

    // Act
    json.setVirtual(true);

    // Assert
    assertTrue(json.virtual);
    assertTrue(json.virtualIsSet);
  }
  @Test
  public void virtualTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerInformation.Json()).virtual();
  }
}


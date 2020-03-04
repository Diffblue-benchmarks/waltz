package com.khartec.waltz.model.software_catalog;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.CreatedUserTimestampProvider;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSoftwareVersionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSoftwareVersion.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSoftwareVersion.Json actualJson = new ImmutableSoftwareVersion.Json();

    // Assert
    Optional<Long> optional = actualJson.id;
    assertSame(optional, actualJson.externalId);
    assertSame(optional, actualJson.created);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSoftwareVersion.copyOf(new ImmutableSoftwareVersion.Json());
  }

  @Test
  public void createdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwareVersion.Json()).created();
  }

  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwareVersion.Json()).description();
  }

  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwareVersion.Json()).externalId();
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSoftwareVersion.fromJson(new ImmutableSoftwareVersion.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableSoftwareVersion.Builder builderResult = ImmutableSoftwareVersion.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableSoftwarePackage.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSoftwareVersion.Builder builderResult = ImmutableSoftwareVersion.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableSoftwarePackage.Json());
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableSoftwareVersion.Builder builderResult = ImmutableSoftwareVersion.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((CreatedUserTimestampProvider) new ImmutableSoftwarePackage.Json());
  }

  @Test
  public void fromTest4() {
    // Arrange
    ImmutableSoftwareVersion.Builder builderResult = ImmutableSoftwareVersion.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableSoftwarePackage.Json());
  }

  @Test
  public void fromTest5() {
    // Arrange
    ImmutableSoftwareVersion.Builder builderResult = ImmutableSoftwareVersion.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableSoftwarePackage.Json());
  }

  @Test
  public void fromTest6() {
    // Arrange
    ImmutableSoftwareVersion.Builder builderResult = ImmutableSoftwareVersion.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSoftwareVersion.Json());
  }

  @Test
  public void fromTest7() {
    // Arrange
    ImmutableSoftwareVersion.Builder builderResult = ImmutableSoftwareVersion.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableSoftwarePackage.Json());
  }

  @Test
  public void fromTest8() {
    // Arrange
    ImmutableSoftwareVersion.Builder builderResult = ImmutableSoftwareVersion.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableSoftwarePackage.Json());
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwareVersion.Json()).id();
  }

  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwareVersion.Json()).kind();
  }

  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwareVersion.Json()).name();
  }

  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwareVersion.Json()).provenance();
  }

  @Test
  public void releaseDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwareVersion.Json()).releaseDate();
  }

  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableSoftwareVersion.Json json = new ImmutableSoftwareVersion.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }

  @Test
  public void setKindTest() {
    // Arrange
    ImmutableSoftwareVersion.Json json = new ImmutableSoftwareVersion.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }

  @Test
  public void setNameTest() {
    // Arrange
    ImmutableSoftwareVersion.Json json = new ImmutableSoftwareVersion.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }

  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableSoftwareVersion.Json json = new ImmutableSoftwareVersion.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }

  @Test
  public void setSoftwarePackageIdTest() {
    // Arrange
    ImmutableSoftwareVersion.Json json = new ImmutableSoftwareVersion.Json();

    // Act
    json.setSoftwarePackageId(123L);

    // Assert
    assertEquals(123L, json.softwarePackageId);
    assertTrue(json.softwarePackageIdIsSet);
  }

  @Test
  public void setVersionTest() {
    // Arrange
    ImmutableSoftwareVersion.Json json = new ImmutableSoftwareVersion.Json();

    // Act
    json.setVersion("version");

    // Assert
    assertEquals("version", json.version);
  }

  @Test
  public void softwarePackageIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwareVersion.Json()).softwarePackageId();
  }

  @Test
  public void versionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwareVersion.Json()).version();
  }
}


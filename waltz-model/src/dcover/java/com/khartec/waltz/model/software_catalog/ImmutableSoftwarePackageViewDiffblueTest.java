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

public class ImmutableSoftwarePackageViewDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSoftwarePackageView.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSoftwarePackageView.Json actualJson = new ImmutableSoftwarePackageView.Json();

    // Assert
    Optional<Long> optional = actualJson.id;
    assertSame(actualJson.created, optional);
    assertSame(optional, actualJson.created);
    assertSame(optional, actualJson.externalId);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSoftwarePackageView.copyOf(new ImmutableSoftwarePackageView.Json());
  }
  @Test
  public void createdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackageView.Json()).created();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackageView.Json()).description();
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackageView.Json()).externalId();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSoftwarePackageView.fromJson(new ImmutableSoftwarePackageView.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSoftwarePackageView.Builder builderResult = ImmutableSoftwarePackageView.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSoftwarePackageView.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSoftwarePackageView.Builder builderResult = ImmutableSoftwarePackageView.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((CreatedUserTimestampProvider) new ImmutableSoftwarePackage.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableSoftwarePackageView.Builder builderResult = ImmutableSoftwarePackageView.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableSoftwarePackage.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableSoftwarePackageView.Builder builderResult = ImmutableSoftwarePackageView.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableSoftwarePackage.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableSoftwarePackageView.Builder builderResult = ImmutableSoftwarePackageView.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableSoftwarePackage.Json());
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutableSoftwarePackageView.Builder builderResult = ImmutableSoftwarePackageView.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableSoftwarePackage.Json());
  }
  @Test
  public void fromTest7() {
    // Arrange
    ImmutableSoftwarePackageView.Builder builderResult = ImmutableSoftwarePackageView.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableSoftwarePackage.Json());
  }
  @Test
  public void fromTest8() {
    // Arrange
    ImmutableSoftwarePackageView.Builder builderResult = ImmutableSoftwarePackageView.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSoftwarePackage.Json());
  }
  @Test
  public void fromTest9() {
    // Arrange
    ImmutableSoftwarePackageView.Builder builderResult = ImmutableSoftwarePackageView.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableSoftwarePackage.Json());
  }
  @Test
  public void groupTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackageView.Json()).group();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackageView.Json()).id();
  }
  @Test
  public void isNotableTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackageView.Json()).isNotable();
  }
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackageView.Json()).kind();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackageView.Json()).name();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackageView.Json()).provenance();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableSoftwarePackageView.Json json = new ImmutableSoftwarePackageView.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setGroupTest() {
    // Arrange
    ImmutableSoftwarePackageView.Json json = new ImmutableSoftwarePackageView.Json();

    // Act
    json.setGroup("group");

    // Assert
    assertEquals("group", json.group);
  }
  @Test
  public void setIsNotableTest() {
    // Arrange
    ImmutableSoftwarePackageView.Json json = new ImmutableSoftwarePackageView.Json();

    // Act
    json.setIsNotable(true);

    // Assert
    assertTrue(json.isNotable);
    assertTrue(json.isNotableIsSet);
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableSoftwarePackageView.Json json = new ImmutableSoftwarePackageView.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableSoftwarePackageView.Json json = new ImmutableSoftwarePackageView.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableSoftwarePackageView.Json json = new ImmutableSoftwarePackageView.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }
  @Test
  public void setVendorTest() {
    // Arrange
    ImmutableSoftwarePackageView.Json json = new ImmutableSoftwarePackageView.Json();

    // Act
    json.setVendor("vendor");

    // Assert
    assertEquals("vendor", json.vendor);
  }
  @Test
  public void setVersionTest() {
    // Arrange
    ImmutableSoftwarePackageView.Json json = new ImmutableSoftwarePackageView.Json();

    // Act
    json.setVersion("version");

    // Assert
    assertEquals("version", json.version);
  }
  @Test
  public void vendorTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackageView.Json()).vendor();
  }
  @Test
  public void versionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackageView.Json()).version();
  }
}


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
import com.khartec.waltz.model.UserTimestamp;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSoftwarePackageDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromTest8() {
    // Arrange
    ImmutableSoftwarePackage.Builder builderResult = ImmutableSoftwarePackage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableSoftwarePackage.Json());
  }

  @Test
  public void fromTest7() {
    // Arrange
    ImmutableSoftwarePackage.Builder builderResult = ImmutableSoftwarePackage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableSoftwarePackage.Json());
  }

  @Test
  public void fromTest6() {
    // Arrange
    ImmutableSoftwarePackage.Builder builderResult = ImmutableSoftwarePackage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableSoftwarePackage.Json());
  }

  @Test
  public void fromTest5() {
    // Arrange
    ImmutableSoftwarePackage.Builder builderResult = ImmutableSoftwarePackage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableSoftwarePackage.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSoftwarePackage.builder().build();
  }

  @Test
  public void fromTest4() {
    // Arrange
    ImmutableSoftwarePackage.Builder builderResult = ImmutableSoftwarePackage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSoftwarePackage.Json());
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableSoftwarePackage.Builder builderResult = ImmutableSoftwarePackage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((CreatedUserTimestampProvider) new ImmutableSoftwarePackage.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSoftwarePackage.Builder builderResult = ImmutableSoftwarePackage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableSoftwarePackage.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableSoftwarePackage.Builder builderResult = ImmutableSoftwarePackage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableSoftwarePackage.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSoftwarePackage.fromJson(new ImmutableSoftwarePackage.Json());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSoftwarePackage.copyOf(new ImmutableSoftwarePackage.Json());
  }

  @Test
  public void setGroupTest() {
    // Arrange
    ImmutableSoftwarePackage.Json json = new ImmutableSoftwarePackage.Json();

    // Act
    json.setGroup("foo");

    // Assert
    assertEquals("foo", json.group);
  }

  @Test
  public void setVendorTest() {
    // Arrange
    ImmutableSoftwarePackage.Json json = new ImmutableSoftwarePackage.Json();

    // Act
    json.setVendor("foo");

    // Assert
    assertEquals("foo", json.vendor);
  }

  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackage.Json()).kind();
  }

  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackage.Json()).description();
  }

  @Test
  public void createdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackage.Json()).created();
  }

  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackage.Json()).provenance();
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackage.Json()).id();
  }

  @Test
  public void isNotableTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackage.Json()).isNotable();
  }

  @Test
  public void setKindTest() {
    // Arrange
    ImmutableSoftwarePackage.Json json = new ImmutableSoftwarePackage.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }

  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableSoftwarePackage.Json json = new ImmutableSoftwarePackage.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }

  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackage.Json()).name();
  }

  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackage.Json()).externalId();
  }

  @Test
  public void setNameTest() {
    // Arrange
    ImmutableSoftwarePackage.Json json = new ImmutableSoftwarePackage.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSoftwarePackage.Json actualJson = new ImmutableSoftwarePackage.Json();

    // Assert
    Optional<UserTimestamp> optional = actualJson.created;
    assertSame(actualJson.id, optional);
    assertSame(optional, actualJson.id);
    assertSame(optional, actualJson.externalId);
  }

  @Test
  public void setIsNotableTest() {
    // Arrange
    ImmutableSoftwarePackage.Json json = new ImmutableSoftwarePackage.Json();

    // Act
    json.setIsNotable(true);

    // Assert
    assertTrue(json.isNotable);
    assertTrue(json.isNotableIsSet);
  }

  @Test
  public void groupTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackage.Json()).group();
  }

  @Test
  public void vendorTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSoftwarePackage.Json()).vendor();
  }

  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableSoftwarePackage.Json json = new ImmutableSoftwarePackage.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
}


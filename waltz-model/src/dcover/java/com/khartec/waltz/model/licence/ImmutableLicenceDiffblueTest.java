package com.khartec.waltz.model.licence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.ApprovalStatus;
import com.khartec.waltz.model.CreatedUserTimestampProvider;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedUserTimestampProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.UserTimestamp;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableLicenceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void approvalStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLicence.Json()).approvalStatus();
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLicence.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableLicence.Json actualJson = new ImmutableLicence.Json();

    // Assert
    Optional<UserTimestamp> optional = actualJson.created;
    assertSame(actualJson.id, optional);
    assertSame(optional, actualJson.id);
    assertSame(optional, actualJson.lastUpdated);
    assertSame(optional, actualJson.externalId);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableLicence.copyOf(new ImmutableLicence.Json());
  }

  @Test
  public void createdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLicence.Json()).created();
  }

  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLicence.Json()).description();
  }

  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLicence.Json()).externalId();
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLicence.fromJson(new ImmutableLicence.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableLicence.Builder builderResult = ImmutableLicence.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableLicence.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableLicence.Builder builderResult = ImmutableLicence.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableLicence.Json());
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableLicence.Builder builderResult = ImmutableLicence.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableLicence.Json());
  }

  @Test
  public void fromTest4() {
    // Arrange
    ImmutableLicence.Builder builderResult = ImmutableLicence.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedUserTimestampProvider) new ImmutableLicence.Json());
  }

  @Test
  public void fromTest5() {
    // Arrange
    ImmutableLicence.Builder builderResult = ImmutableLicence.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableLicence.Json());
  }

  @Test
  public void fromTest6() {
    // Arrange
    ImmutableLicence.Builder builderResult = ImmutableLicence.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableLicence.Json());
  }

  @Test
  public void fromTest7() {
    // Arrange
    ImmutableLicence.Builder builderResult = ImmutableLicence.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((CreatedUserTimestampProvider) new ImmutableLicence.Json());
  }

  @Test
  public void fromTest8() {
    // Arrange
    ImmutableLicence.Builder builderResult = ImmutableLicence.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableLicence.Json());
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLicence.Json()).id();
  }

  @Test
  public void lastUpdatedTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLicence.Json()).lastUpdated();
  }

  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLicence.Json()).name();
  }

  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLicence.Json()).provenance();
  }

  @Test
  public void setApprovalStatusTest() {
    // Arrange
    ImmutableLicence.Json json = new ImmutableLicence.Json();

    // Act
    json.setApprovalStatus(ApprovalStatus.PENDING_APPROVAL);

    // Assert
    assertEquals(ApprovalStatus.PENDING_APPROVAL, json.approvalStatus);
  }

  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableLicence.Json json = new ImmutableLicence.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }

  @Test
  public void setNameTest() {
    // Arrange
    ImmutableLicence.Json json = new ImmutableLicence.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }

  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableLicence.Json json = new ImmutableLicence.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }
}


package com.khartec.waltz.model.external_identifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.WaltzEntity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableExternalIdentifierDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableExternalIdentifier.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableExternalIdentifier.Json actualJson = new ImmutableExternalIdentifier.Json();

    // Assert
    assertNull(actualJson.externalId);
    assertNull(actualJson.system);
    assertNull(actualJson.entityReference);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableExternalIdentifier.copyOf(new ImmutableExternalIdentifier.Json());
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableExternalIdentifier.Json()).entityReference();
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableExternalIdentifier.Json()).externalId();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableExternalIdentifier.fromJson(new ImmutableExternalIdentifier.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableExternalIdentifier.Builder builderResult = ImmutableExternalIdentifier.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((WaltzEntity) new ImmutableExternalIdentifier.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableExternalIdentifier.Builder builderResult = ImmutableExternalIdentifier.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableExternalIdentifier.Json());
  }
  @Test
  public void setExternalIdTest() {
    // Arrange
    ImmutableExternalIdentifier.Json json = new ImmutableExternalIdentifier.Json();

    // Act
    json.setExternalId("123");

    // Assert
    assertEquals("123", json.externalId);
  }
  @Test
  public void setSystemTest() {
    // Arrange
    ImmutableExternalIdentifier.Json json = new ImmutableExternalIdentifier.Json();

    // Act
    json.setSystem("system");

    // Assert
    assertEquals("system", json.system);
  }
  @Test
  public void systemTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableExternalIdentifier.Json()).system();
  }
}


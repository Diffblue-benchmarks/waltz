package com.khartec.waltz.model.application;

import static org.junit.Assert.assertSame;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAppRegistrationResponseDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAppRegistrationResponse.copyOf(new ImmutableAppRegistrationResponse.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAppRegistrationResponse.fromJson(new ImmutableAppRegistrationResponse.Json());
  }
  @Test
  public void messageTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppRegistrationResponse.Json()).message();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppRegistrationResponse.Json()).id();
  }
  @Test
  public void setOriginalRequestTest() {
    // Arrange
    ImmutableAppRegistrationResponse.Json json = new ImmutableAppRegistrationResponse.Json();
    ImmutableAppRegistrationRequest.Json json1 = new ImmutableAppRegistrationRequest.Json();

    // Act
    json.setOriginalRequest(json1);

    // Assert
    assertSame(json1, json.originalRequest);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAppRegistrationResponse.Json actualJson = new ImmutableAppRegistrationResponse.Json();

    // Assert
    assertSame(actualJson.message, actualJson.id);
  }
  @Test
  public void registeredTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppRegistrationResponse.Json()).registered();
  }
  @Test
  public void originalRequestTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAppRegistrationResponse.Json()).originalRequest();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAppRegistrationResponse.Builder builderResult = ImmutableAppRegistrationResponse.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAppRegistrationResponse.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAppRegistrationResponse.builder().build();
  }
}


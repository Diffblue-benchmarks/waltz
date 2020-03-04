package com.khartec.waltz.model.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.UserNameProvider;
import java.util.HashSet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableUserDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUser.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableUser.Json()).roles.size());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableUser.copyOf(new ImmutableUser.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUser.fromJson(new ImmutableUser.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableUser.Builder builderResult = ImmutableUser.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((UserNameProvider) new ImmutableUser.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableUser.Builder builderResult = ImmutableUser.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableUser.Json());
  }

  @Test
  public void rolesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUser.Json()).roles();
  }

  @Test
  public void setRolesTest() {
    // Arrange
    ImmutableUser.Json json = new ImmutableUser.Json();
    HashSet<String> stringSet = new HashSet<String>();
    stringSet.add("foo");

    // Act
    json.setRoles(stringSet);

    // Assert
    assertSame(stringSet, json.roles);
  }

  @Test
  public void setUserNameTest() {
    // Arrange
    ImmutableUser.Json json = new ImmutableUser.Json();

    // Act
    json.setUserName("username");

    // Assert
    assertEquals("username", json.userName);
  }

  @Test
  public void userNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUser.Json()).userName();
  }
}


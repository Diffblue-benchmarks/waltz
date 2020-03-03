package com.khartec.waltz.model.person;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.IdProvider;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePersonDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void setEmployeeIdTest() {
    // Arrange
    ImmutablePerson.Json json = new ImmutablePerson.Json();

    // Act
    json.setEmployeeId("123");

    // Assert
    assertEquals("123", json.employeeId);
  }
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerson.Json()).kind();
  }
  @Test
  public void departmentNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerson.Json()).departmentName();
  }
  @Test
  public void personKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerson.Json()).personKind();
  }
  @Test
  public void setUserIdTest() {
    // Arrange
    ImmutablePerson.Json json = new ImmutablePerson.Json();

    // Act
    json.setUserId("123");

    // Assert
    assertEquals("123", json.userId);
  }
  @Test
  public void setIsRemovedTest() {
    // Arrange
    ImmutablePerson.Json json = new ImmutablePerson.Json();

    // Act
    json.setIsRemoved(true);

    // Assert
    assertTrue(json.isRemoved);
    assertTrue(json.isRemovedIsSet);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerson.Json()).name();
  }
  @Test
  public void officePhoneTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerson.Json()).officePhone();
  }
  @Test
  public void setDisplayNameTest() {
    // Arrange
    ImmutablePerson.Json json = new ImmutablePerson.Json();

    // Act
    json.setDisplayName("name");

    // Assert
    assertEquals("name", json.displayName);
  }
  @Test
  public void emailTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerson.Json()).email();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePerson.Json actualJson = new ImmutablePerson.Json();

    // Assert
    Optional<String> optional = actualJson.officePhone;
    assertSame(optional, actualJson.mobilePhone);
    assertSame(optional, actualJson.title);
    assertSame(optional, actualJson.departmentName);
    assertSame(optional, actualJson.managerEmployeeId);
    assertSame(optional, actualJson.organisationalUnitId);
    assertSame(optional, actualJson.userPrincipalName);
    assertSame(optional, actualJson.id);
  }
  @Test
  public void managerEmployeeIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerson.Json()).managerEmployeeId();
  }
  @Test
  public void displayNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerson.Json()).displayName();
  }
  @Test
  public void mobilePhoneTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerson.Json()).mobilePhone();
  }
  @Test
  public void titleTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerson.Json()).title();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerson.Json()).id();
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutablePerson.Json json = new ImmutablePerson.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void setPersonKindTest() {
    // Arrange
    ImmutablePerson.Json json = new ImmutablePerson.Json();

    // Act
    json.setPersonKind(PersonKind.EMPLOYEE);

    // Assert
    assertEquals(PersonKind.EMPLOYEE, json.personKind);
  }
  @Test
  public void userIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerson.Json()).userId();
  }
  @Test
  public void organisationalUnitIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerson.Json()).organisationalUnitId();
  }
  @Test
  public void employeeIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerson.Json()).employeeId();
  }
  @Test
  public void isRemovedTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerson.Json()).isRemoved();
  }
  @Test
  public void userPrincipalNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerson.Json()).userPrincipalName();
  }
  @Test
  public void setEmailTest() {
    // Arrange
    ImmutablePerson.Json json = new ImmutablePerson.Json();

    // Act
    json.setEmail("foo");

    // Assert
    assertEquals("foo", json.email);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePerson.copyOf(new ImmutablePerson.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePerson.fromJson(new ImmutablePerson.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutablePerson.Builder builderResult = ImmutablePerson.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePerson.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutablePerson.Builder builderResult = ImmutablePerson.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutablePerson.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePerson.Builder builderResult = ImmutablePerson.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutablePerson.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePerson.builder().build();
  }
}


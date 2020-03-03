package com.khartec.waltz.service.user;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PasswordServiceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void verifyPasswordTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new PasswordService()).verifyPassword("Password123", "Password123");
  }
}


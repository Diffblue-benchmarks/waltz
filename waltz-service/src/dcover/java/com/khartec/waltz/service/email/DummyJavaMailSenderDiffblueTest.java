package com.khartec.waltz.service.email;

import static org.junit.Assert.assertNull;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import org.junit.Test;
import org.springframework.mail.MailException;

public class DummyJavaMailSenderDiffblueTest {
  @Test
  public void createMimeMessageTest() throws MailException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) -1);
    ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArray);

    // Act and Assert
    assertNull((new DummyJavaMailSender()).createMimeMessage(inputStream));
  }

  @Test
  public void createMimeMessageTest2() {
    // Arrange, Act and Assert
    assertNull((new DummyJavaMailSender()).createMimeMessage());
  }
}


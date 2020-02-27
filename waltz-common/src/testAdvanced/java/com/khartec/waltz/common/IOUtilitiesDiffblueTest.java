package com.khartec.waltz.common;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class IOUtilitiesDiffblueTest {
  @Test
  public void readLinesTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act
    List<String> actualReadLinesResult = IOUtilities.readLines(new ByteArrayInputStream(byteArray));

    // Assert
    assertEquals(1, actualReadLinesResult.size());
    assertEquals(
        "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001",
        actualReadLinesResult.get(0));
  }

  @Test
  public void getFileResourceTest() {
    // Arrange and Act
    Resource actualFileResource = IOUtilities.getFileResource("file.txt");

    // Assert
    String actualPath = ((FileSystemResource) actualFileResource).getPath();
    assertEquals("file.txt", actualFileResource.getFilename());
    assertEquals("/home/diffblue/maria.svorenova/.waltz/file.txt", actualPath);
  }

  @Test
  public void readAsStringTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(
        "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001",
        IOUtilities.readAsString(new ByteArrayInputStream(byteArray)));
  }
}


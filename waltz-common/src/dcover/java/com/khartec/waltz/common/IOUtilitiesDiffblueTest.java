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
  public void getFileResourceTest() {
    // Arrange and Act
    Resource actualFileResource = IOUtilities.getFileResource("file.txt");

    // Assert
    String actualPath = ((FileSystemResource) actualFileResource).getPath();
    assertEquals("file.txt", actualFileResource.getFilename());
    assertEquals("/home/thomasperkins/.waltz/file.txt", actualPath);
  }

  @Test
  public void readAsStringTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) -1);

    // Act and Assert
    assertEquals("������������������������", IOUtilities.readAsString(new ByteArrayInputStream(byteArray)));
  }

  @Test
  public void readLinesTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) -1);

    // Act
    List<String> actualReadLinesResult = IOUtilities.readLines(new ByteArrayInputStream(byteArray));

    // Assert
    assertEquals(1, actualReadLinesResult.size());
    assertEquals("������������������������", actualReadLinesResult.get(0));
  }
}


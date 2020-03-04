package com.khartec.waltz.web;

import static org.junit.Assert.assertEquals;
import com.khartec.waltz.model.Entry;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;

public class WebUtilitiesDiffblueTest {
  @Test
  public void getMimeTypeTest() {
    // Arrange, Act and Assert
    assertEquals("application/octet-stream", WebUtilities.getMimeType("path"));
  }

  @Test
  public void mkPathTest() {
    // Arrange, Act and Assert
    assertEquals("foo/foo/foo", WebUtilities.mkPath("foo", "foo", "foo"));
  }

  @Test
  public void simplifyMapToListTest() {
    // Arrange
    HashMap<Object, Object> objectObjectMap = new HashMap<Object, Object>();
    objectObjectMap.put("foo", "foo");

    // Act
    List<Entry<Object, Object>> actualSimplifyMapToListResult = WebUtilities
        .<Object, Object>simplifyMapToList(objectObjectMap);

    // Assert
    assertEquals(1, actualSimplifyMapToListResult.size());
    assertEquals("Entry{key=foo, value=foo}", actualSimplifyMapToListResult.get(0).toString());
  }
}


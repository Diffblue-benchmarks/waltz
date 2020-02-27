package com.khartec.waltz.common;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class SvgUtilitiesDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void convertVisioSvgTest()
      throws IOException, ParserConfigurationException, TransformerException, XPathExpressionException, SAXException {
    // Arrange, Act and Assert
    thrown.expect(SAXParseException.class);
    SvgUtilities.convertVisioSvg("foo", "foo");
  }
}


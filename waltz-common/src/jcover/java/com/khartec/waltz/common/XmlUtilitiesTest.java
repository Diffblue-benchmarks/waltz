package com.khartec.waltz.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Unit tests for com.khartec.waltz.common.XmlUtilities
 *
 * @author Diffblue Cover
 */

class XmlUtilitiesTest {

    @Test
    void stream1() {
        NodeList nodeList = mock(NodeList.class);
        when(nodeList.getLength())
            .thenReturn(1)
            .thenReturn(0);
        Node[] array = XmlUtilities.stream(nodeList).toArray(Node[]::new);
    }

    @Test
    void stream2() throws org.w3c.dom.DOMException {
        Node node = mock(Node.class);
        NodeList nodeList = mock(NodeList.class);
        when(nodeList.getLength())
            .thenReturn(1)
            .thenReturn(1)
            .thenReturn(1);
        when(nodeList.item(anyInt()))
            .thenReturn(node);
        Node[] array = XmlUtilities.stream(nodeList).toArray(Node[]::new);
    }

    @Test
    void printDocument() throws javax.xml.parsers.ParserConfigurationException, javax.xml.transform.TransformerException {
        assertThat(XmlUtilities.printDocument(DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument(), false), is("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>"));
        assertThat(XmlUtilities.printDocument(DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument(), true), is("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n\n"));
    }

    @Test
    void createNonValidatingDocumentBuilderFactory() throws javax.xml.parsers.ParserConfigurationException {
        DocumentBuilderFactory result =
             XmlUtilities.createNonValidatingDocumentBuilderFactory();
        assertThat(result.isCoalescing(), is(false));
        assertThat(result.isExpandEntityReferences(), is(true));
        assertThat(result.isIgnoringComments(), is(false));
        assertThat(result.isIgnoringElementContentWhitespace(), is(false));
        assertThat(result.isNamespaceAware(), is(true));
        assertThat(result.isValidating(), is(false));
    }
}

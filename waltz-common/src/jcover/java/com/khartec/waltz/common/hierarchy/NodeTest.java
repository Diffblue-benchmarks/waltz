package com.khartec.waltz.common.hierarchy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.common.hierarchy.Node
 *
 * @author Diffblue Cover
 */

class NodeTest {

    @Test
    void factory() {
        Node<String, String> node = new Node<String, String>("foo", "foo");
        assertThat(node.getChildren(), empty());
        assertThat(node.getData(), is("foo"));
        assertThat(node.getId(), is("foo"));
        assertThat(node.getParent(), is(nullValue()));
    }

    @Test
    void addChild() {
        Node<String, String> node = new Node<String, String>("foo", "foo");
        assertThat(node.addChild(new Node(new Object(), new Object())), sameInstance(node));
        assertThat(node.getChildren(), hasSize(1));
    }

    @Test
    void setParent() {
        Node<String, String> node = new Node<String, String>("foo", "foo");
        Node<String, String> parent = new Node<String, String>("foo", "foo");
        assertThat(node.setParent(parent), sameInstance(node));
        assertThat(node.getParent(), sameInstance(parent));
    }
}

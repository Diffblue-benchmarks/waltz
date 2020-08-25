package com.khartec.waltz.common.hierarchy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.common.hierarchy.Forest
 *
 * @author Diffblue Cover
 */

class ForestTest {

    @Test
    void factory() {
        HashMap<String, Node<String, String>> allNodes =
             new HashMap<String, Node<String, String>>();
        Node<String, String> x15 = new Node<String, String>("foo", "foo");
        allNodes.put("foo", x15);
        Forest<String, String> forest =
             new Forest<String, String>(allNodes, new HashSet<Node<String, String>>());
        assertThat(forest.getAllNodes().get("foo"), sameInstance(x15));
        assertThat(forest.getRootNodes(), empty());
    }
}

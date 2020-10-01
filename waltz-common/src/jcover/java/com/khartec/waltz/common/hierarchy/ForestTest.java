package com.khartec.waltz.common.hierarchy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;

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
    void factory() throws java.io.IOException, CloneNotSupportedException {
        Forest<String, String> forest =
             new Forest<String, String>(new HashMap<String, Node<String, String>>(), new HashSet<Node<String, String>>());
        assertThat(forest.getAllNodes(), is(notNullValue()));
        assertThat(forest.getRootNodes(), empty());
    }
}

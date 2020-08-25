package com.khartec.waltz.common.hierarchy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Optional;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.common.hierarchy.HierarchyUtilities
 *
 * @author Diffblue Cover
 */

class HierarchyUtilitiesTest {

    @Test
    void toForest1() {

        // arrange
        LinkedList<FlatNode<String, String>> flatNodes =
             new LinkedList<FlatNode<String, String>>();
        flatNodes.add(new FlatNode<String, String>("foo", Optional.<String>empty(), "bar"));

        // act
        Forest<String, String> result =
             HierarchyUtilities.<String, String>toForest(flatNodes);

        // assert
        assertThat(result.getAllNodes().get("foo").getChildren(), empty());
        assertThat(result.getAllNodes().get("foo").getData(), is("bar"));
        assertThat(result.getAllNodes().get("foo").getId(), is("foo"));
        assertThat(result.getAllNodes().get("foo").getParent(), is(nullValue()));
        assertThat(result.getRootNodes(), hasSize(1));
    }

    @Test
    void toForest2() {

        // arrange
        LinkedList<FlatNode<String, String>> flatNodes =
             new LinkedList<FlatNode<String, String>>();
        flatNodes.add(new FlatNode<String, String>("foo", Optional.of("foo"), "bar"));

        // act
        Forest<String, String> result =
             HierarchyUtilities.<String, String>toForest(flatNodes);

        // assert
        assertThat(result.getAllNodes().get("foo").getChildren(), empty());
        assertThat(result.getAllNodes().get("foo").getData(), is("bar"));
        assertThat(result.getAllNodes().get("foo").getId(), is("foo"));
        assertThat(result.getAllNodes().get("foo").getParent(), is(nullValue()));
        assertThat(result.getRootNodes(), hasSize(1));
    }

    @Test
    void toForest3() {

        // arrange
        LinkedList<FlatNode<String, String>> flatNodes =
             new LinkedList<FlatNode<String, String>>();
        flatNodes.add(new FlatNode<String, String>("bar", Optional.of("foo"), "bar"));

        // act
        Forest<String, String> result =
             HierarchyUtilities.<String, String>toForest(flatNodes);

        // assert
        assertThat(result.getAllNodes().get("bar").getChildren(), empty());
        assertThat(result.getAllNodes().get("bar").getData(), is("bar"));
        assertThat(result.getAllNodes().get("bar").getId(), is("bar"));
        assertThat(result.getAllNodes().get("bar").getParent(), is(nullValue()));
        assertThat(result.getRootNodes(), empty());
    }

    @Test
    void toForestFlatNodesIsEmpty() {
        Forest<String, String> result =
             HierarchyUtilities.<String, String>toForest(new LinkedList<FlatNode<String, String>>());
        assertThat(result.getAllNodes().isEmpty(), is(true));
        assertThat(result.getRootNodes(), empty());
    }

    @Test
    void hasCycleReturnsFalse() {
        HashMap<String, Node<String, String>> allNodes =
             new HashMap<String, Node<String, String>>();
        allNodes.put("bar", new Node<String, String>("foo", "foo"));
        assertThat(HierarchyUtilities.<String, String>hasCycle(new Forest<String, String>(allNodes, new HashSet<Node<String, String>>())), is(false));
    }

    @Test
    void parentsReturnsEmpty() {
        assertThat(HierarchyUtilities.<String, String>parents(new Node<String, String>("bar", "foo")), empty());
    }

    @Test
    void assignDepthsReturnsEmpty() {
        assertThat(HierarchyUtilities.<String, String>assignDepths(new Forest<String, String>(new HashMap<String, Node<String, String>>(), new HashSet<Node<String, String>>())).isEmpty(), is(true));
    }
}

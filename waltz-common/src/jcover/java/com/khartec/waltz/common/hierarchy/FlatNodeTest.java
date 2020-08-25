package com.khartec.waltz.common.hierarchy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.Optional;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.common.hierarchy.FlatNode
 *
 * @author Diffblue Cover
 */

class FlatNodeTest {

    @Test
    void factory() {
        Optional<String> parentId = Optional.<String>empty();
        FlatNode<String, String> flatNode =
             new FlatNode<String, String>("1234", parentId, "something");
        assertThat(flatNode.getData(), is("something"));
        assertThat(flatNode.getId(), is("1234"));
        assertThat(flatNode.getParentId(), sameInstance(parentId));
    }
}

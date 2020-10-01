package com.khartec.waltz.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.common.MapBuilder
 *
 * @author Diffblue Cover
 */

class MapBuilderTest {

    @Test
    void from() {
        MapBuilder<String, String> mapBuilder =
             new MapBuilder<String, String>();
        assertThat(mapBuilder.from(new HashMap<String, String>()), sameInstance(mapBuilder));
    }

    @Test
    void addKIsFooAndVIsFoo() {
        MapBuilder<String, String> mapBuilder =
             new MapBuilder<String, String>();
        assertThat(mapBuilder.add("foo", "foo"), sameInstance(mapBuilder));
    }

    @Test
    void buildReturnsEmpty() {
        assertThat(new MapBuilder<String, String>().build().isEmpty(), is(true));
    }
}

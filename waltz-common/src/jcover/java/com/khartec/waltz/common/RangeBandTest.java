package com.khartec.waltz.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.common.RangeBand
 *
 * @author Diffblue Cover
 */

class RangeBandTest {

    @Test
    void factory() {
        RangeBand<Integer> rangeBand = new RangeBand<Integer>(0, 1);
        assertThat(rangeBand.getHigh(), is(1));
        assertThat(rangeBand.getLow(), is(0));
    }

    @Test
    void contains() {
        assertThat(new RangeBand<Integer>(0, 1).contains(-1), is(false));
        assertThat(new RangeBand<Integer>(null, 0).contains(1), is(false));
        assertThat(new RangeBand<Integer>(-1, 0).contains(1), is(false));
        assertThat(new RangeBand<Integer>(0, null).contains(1), is(true));
        assertThat(new RangeBand<Integer>(1, null).contains(0), is(false));
        assertThat(new RangeBand<Integer>(null, 1).contains(0), is(true));
        assertThat(new RangeBand<Integer>(-1, 1).contains(0), is(true));
    }

    @Test
    void test() {
        assertThat(new RangeBand<Integer>(-1, 0).test((Integer) 1), is(false));
        assertThat(new RangeBand<Integer>(0, 1).test((Integer) 1), is(true));
    }

    @Test
    void testEquals() {
        assertThat(new RangeBand<Integer>(null, 1).equals("foo"), is(false));
        assertThat(new RangeBand<Integer>(0, 1).equals("foo"), is(false));
        assertThat(new RangeBand<Integer>(1, null).equals("foo"), is(false));
        assertThat(new RangeBand<Integer>(0, 1).equals(null), is(false));
    }
}

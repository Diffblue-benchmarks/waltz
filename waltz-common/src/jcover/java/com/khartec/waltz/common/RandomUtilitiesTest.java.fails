package com.khartec.waltz.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.common.RandomUtilities
 *
 * @author Diffblue Cover
 */

class RandomUtilitiesTest {

    @Test
    void getRandom() {
        assertThat(RandomUtilities.getRandom(), is(notNullValue()));
    }

    @Test
    void randomIntBetween() {
        assertThat(RandomUtilities.randomIntBetween(-1, 1), is(-1));
        assertThat(RandomUtilities.randomIntBetween(0, 1), is(0));
    }

    @Test
    void randomPickXsIsFoo() {
        LinkedList<String> xs = new LinkedList<String>();
        xs.add("foo");
        assertThat(RandomUtilities.<String>randomPick(xs), is("foo"));
    }

    @Test
    void randomPick() {
        assertThat(RandomUtilities.<String>randomPick(new LinkedList<String>(), 1), empty());
        assertThat(RandomUtilities.<String>randomPick("foo"), is("foo"));
    }

    @Test
    void randomPickChoicesIsFooAndHowManyIsOne() {
        LinkedList<String> choices = new LinkedList<String>();
        choices.add("foo");
        assertThat(RandomUtilities.<String>randomPick(choices, 1), hasSize(1));
        assertThat(RandomUtilities.<String>randomPick(choices, 1).get(0), is("foo"));
    }

    @Test
    void randomPickChoicesIsFooAndHowManyIsZeroReturnsEmpty() {
        LinkedList<String> choices = new LinkedList<String>();
        choices.add("foo");
        assertThat(RandomUtilities.<String>randomPick(choices, 0), empty());
    }

    @Test
    void randomlySizedIntStreamLowerIsZeroAndUpperIsOne() {
        int[] array = RandomUtilities.randomlySizedIntStream(0, 1).toArray();
    }
}

package com.khartec.waltz.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.common.Aliases
 *
 * @author Diffblue Cover
 */

class AliasesTest {

    @Test
    void registerAliasesIsFooAndValIsFoo() {
        Aliases<String> aliases1 = new Aliases<String>();
        assertThat(aliases1.register("foo", "foo"), sameInstance(aliases1));
    }

    @Test
    void lookupAliasIsFoo() {
        assertThat(new Aliases<String>().lookup("foo").isPresent(), is(false));
    }
}

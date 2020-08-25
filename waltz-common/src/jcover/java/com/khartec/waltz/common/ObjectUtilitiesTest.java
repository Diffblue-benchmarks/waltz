package com.khartec.waltz.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.function.Predicate;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.khartec.waltz.common.ObjectUtilities
 *
 * @author Diffblue Cover
 */

class ObjectUtilitiesTest {

    @Test
    void dumpXIsFooReturnsFoo() {
        assertThat(ObjectUtilities.<String>dump("foo"), is("foo"));
    }

    @Test
    void firstNotNull() {
        assertThat(ObjectUtilities.<String>firstNotNull("Anna"), is("Anna"));
        assertThat(ObjectUtilities.<String>firstNotNull(), is(nullValue()));
        assertThat(ObjectUtilities.<String>firstNotNull(new String[] { null }), is(nullValue()));
    }

    @Test
    void anyReturnsFalse() {
        @SuppressWarnings("unchecked")
        Predicate<String> pred = mock(Predicate.class);
        when(pred.test(Mockito.<String>any()))
            .thenReturn(false);
        assertThat(ObjectUtilities.<String>any(pred, "foo"), is(false));
    }

    @Test
    void anyReturnsTrue() {
        @SuppressWarnings("unchecked")
        Predicate<String> pred = mock(Predicate.class);
        when(pred.test(Mockito.<String>any()))
            .thenReturn(true);
        assertThat(ObjectUtilities.<String>any(pred, "foo"), is(true));
    }
}

package com.khartec.waltz.common;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Predicate;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.khartec.waltz.common.Checks
 *
 * @author Diffblue Cover
 */

class ChecksTest {

    @Test
    void checkNotNullMessageIsBarAndTIsFooReturnsFoo() {
        assertThat(Checks.<String>checkNotNull("foo", "bar", new Object()), is("foo"));
    }

    @Test
    void checkAllTsIsFooReturnsFoo() {
        String[] ts = new String[] { "foo" };
        @SuppressWarnings("unchecked")
        Predicate<String> check = mock(Predicate.class);
        when(check.test(Mockito.<String>any()))
            .thenReturn(true);
        assertThat(Checks.<String>checkAll(ts, check, "bar"), Matchers.arrayContaining("foo"));
    }

    @Test
    void checkAllTsIsEmptyReturnsEmpty() {

        // arrange
        LinkedList<String> ts = new LinkedList<String>();
        @SuppressWarnings("unchecked")
        Predicate<String> check = mock(Predicate.class);

        // act
        Collection<String> result = Checks.<String>checkAll(ts, check, "bar");

        // assert
        assertThat(result, empty());
        assertThat(ts, instanceOf(Collection.class));
        assertThat((Collection<String>) ts, sameInstance(result));
    }

    @Test
    void checkOptionalIsPresentOptionalIsFooReturnsFoo() {
        assertThat(Checks.<String>checkOptionalIsPresent(Optional.of("foo"), "SHA-256"), is("foo"));
    }

    @Test
    void checkNotEmpty1() {
        LinkedList<String> ts = new LinkedList<String>();
        ts.add("foo");
        Checks.<String>checkNotEmpty(ts, "SHA-256");
    }

    @Test
    void checkNotEmpty2() {
        String[] ts = new String[] { "foo" };
        Checks.<String>checkNotEmpty(ts, "SHA-256");
    }

    @Test
    void checkNotEmptyStrIsFooReturnsFoo() {
        assertThat(Checks.checkNotEmpty("foo", "SHA-256"), is("foo"));
    }
}

package com.khartec.waltz.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Function;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.khartec.waltz.common.StringUtilities
 *
 * @author Diffblue Cover
 */

class StringUtilitiesTest {

    @Test
    void notEmpty() {
        assertThat(StringUtilities.notEmpty(""), is(false));
        assertThat(StringUtilities.notEmpty("foo"), is(true));
        assertThat(StringUtilities.notEmpty(null), is(false));
    }

    @Test
    void isEmpty() {
        assertThat(StringUtilities.isEmpty(Optional.of("foo")), is(false));
        assertThat(StringUtilities.isEmpty(Optional.<String>empty()), is(true));
        assertThat(StringUtilities.isEmpty(""), is(true));
        assertThat(StringUtilities.isEmpty("foo"), is(false));
    }

    @Test
    void ifEmpty() {
        assertThat(StringUtilities.ifEmpty("", "value"), is("value"));
        assertThat(StringUtilities.ifEmpty("foo", "value"), is("foo"));
    }

    @Test
    void parseIntegerDfltIsOneAndValueIsValueReturnsOne() {
        assertThat(StringUtilities.parseInteger("value", 1), is(1));
    }

    @Test
    void isNumericLong() {
        assertThat(StringUtilities.isNumericLong(""), is(false));
        assertThat(StringUtilities.isNumericLong("value"), is(false));
    }

    @Test
    void mkSafeStrIsFooReturnsFoo() {
        assertThat(StringUtilities.mkSafe("foo"), is("foo"));
    }

    @Test
    void limit() {
        assertThat(StringUtilities.limit("foo", 1), is("f"));
        assertThat(StringUtilities.limit(null, 1), is(nullValue()));
    }

    @Test
    void length() {
        assertThat(StringUtilities.length(""), is(0));
        assertThat(StringUtilities.length("foo"), is(3));
        assertThat(StringUtilities.length(null), is(0));
    }

    @Test
    void joinValuesIsValueReturnsValue() {
        LinkedList<String> values = new LinkedList<String>();
        values.add("value");
        assertThat(StringUtilities.join(values, ","), is("value"));
    }

    @Test
    void joinUsingValuesIsValueReturnsFoo() {
        LinkedList<String> values = new LinkedList<String>();
        values.add("value");
        @SuppressWarnings("unchecked")
        Function<String, String> toStringFn = mock(Function.class);
        when(toStringFn.apply(Mockito.<String>any()))
            .thenReturn("foo");
        assertThat(StringUtilities.<String>joinUsing(values, toStringFn, ","), is("foo"));
    }

    @Test
    void splitThenMapSeparatorIsEmptyAndStrIsBar() {
        @SuppressWarnings("unchecked")
        Function<String, String> itemTransformer = mock(Function.class);
        assertThat(StringUtilities.<String>splitThenMap("bar", "", itemTransformer), empty());
    }

    @Test
    void splitThenMapStrIsEmpty() {
        @SuppressWarnings("unchecked")
        Function<String, String> itemTransformer = mock(Function.class);
        assertThat(StringUtilities.<String>splitThenMap("", "bar", itemTransformer), empty());
    }

    @Test
    void splitThenMapStrIsFooReturnsFoo() {
        @SuppressWarnings("unchecked")
        Function<String, String> itemTransformer = mock(Function.class);
        when(itemTransformer.apply(Mockito.<String>any()))
            .thenReturn("foo");
        assertThat(StringUtilities.<String>splitThenMap("foo", "bar", itemTransformer), hasSize(1));
        assertThat(StringUtilities.<String>splitThenMap("foo", "bar", itemTransformer).get(0), is("foo"));
    }

    @Test
    void tokenise() {
        assertThat(StringUtilities.tokenise(""), empty());
        assertThat(StringUtilities.tokenise("value"), hasSize(1));
        assertThat(StringUtilities.tokenise("value").get(0), is("value"));
    }

    @Test
    void lowerValueIsValueReturnsValue() {
        assertThat(StringUtilities.lower("value"), is("value"));
    }

    @Test
    void firstChar() {
        assertThat(StringUtilities.firstChar("", '\u0000'), is('\u0000'));
        assertThat(StringUtilities.firstChar("Anna", 'a'), is('A'));
        assertThat(StringUtilities.firstChar("", 'a'), is('a'));
        assertThat(StringUtilities.firstChar(null, 'a'), is('a'));
    }

    @Test
    void toOptional() {
        assertThat(StringUtilities.toOptional("").isPresent(), is(false));
        assertThat(StringUtilities.toOptional("foo").get(), is("foo"));
    }
}

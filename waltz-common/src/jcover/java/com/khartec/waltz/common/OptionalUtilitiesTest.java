package com.khartec.waltz.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.Optional;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.common.OptionalUtilities
 *
 * @author Diffblue Cover
 */

class OptionalUtilitiesTest {

    @Test
    void maybeValueIsValueReturnsValue() {
        assertThat(OptionalUtilities.<String>maybe("value").get(), is("value"));
    }

    @Test
    void toList() {
        assertThat(OptionalUtilities.<String>toList(null), empty());
        assertThat(OptionalUtilities.<String>toList(Optional.of("foo")), hasSize(1));
        assertThat(OptionalUtilities.<String>toList(Optional.of("foo")).get(0), is("foo"));
    }

    @Test
    void contentsEqual() {
        assertThat(OptionalUtilities.<String>contentsEqual(Optional.<String>empty(), "hello"), is(false));
        assertThat(OptionalUtilities.<String>contentsEqual(Optional.of("foo"), "hello"), is(false));
        assertThat(OptionalUtilities.<String>contentsEqual(Optional.<String>empty(), null), is(true));
    }

    @Test
    void ofNullableOptional() {

        // arrange
        Optional<String> nullable = Optional.<String>empty();

        // act
        Optional<String> result =
             OptionalUtilities.<String>ofNullableOptional(nullable);

        // assert
        assertThat(result.isPresent(), is(false));
        assertThat(nullable, sameInstance(result));
    }

    @Test
    void ofNullableOptionalNullableIsNull() {
        assertThat(OptionalUtilities.<String>ofNullableOptional(null).isPresent(), is(false));
    }
}

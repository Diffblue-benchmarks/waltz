package com.khartec.waltz.common.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.common.exception.DuplicateKeyException
 *
 * @author Diffblue Cover
 */

class DuplicateKeyExceptionTest {

    @Test
    void factory1() {
        DuplicateKeyException duplicateKeyException =
             new DuplicateKeyException("an error has happened");
        assertThat(duplicateKeyException.getCause(), is(nullValue()));
        assertThat(duplicateKeyException.getMessage(), is("an error has happened"));
    }

    @Test
    void factory2() {
        DuplicateKeyException duplicateKeyException =
             new DuplicateKeyException("an error has happened", new InsufficientPrivelegeException("an error has happened"));
        assertThat(duplicateKeyException.getCause().getCause(), is(nullValue()));
        assertThat(duplicateKeyException.getCause().getMessage(), is("an error has happened"));
        assertThat(duplicateKeyException.getMessage(), is("an error has happened"));
    }
}
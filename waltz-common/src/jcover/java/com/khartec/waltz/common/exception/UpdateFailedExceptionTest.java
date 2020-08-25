package com.khartec.waltz.common.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.common.exception.UpdateFailedException
 *
 * @author Diffblue Cover
 */

class UpdateFailedExceptionTest {

    @Test
    void factory1() {
        UpdateFailedException updateFailedException =
             new UpdateFailedException("DE", "an error has happened");
        assertThat(updateFailedException.getCode(), is("DE"));
        assertThat(updateFailedException.getCause(), is(nullValue()));
        assertThat(updateFailedException.getMessage(), is("an error has happened"));
    }

    @Test
    void factory2() {
        UpdateFailedException updateFailedException =
             new UpdateFailedException("DE", "an error has happened", new InsufficientPrivelegeException("an error has happened"));
        assertThat(updateFailedException.getCode(), is("DE"));
        assertThat(updateFailedException.getCause().getCause(), is(nullValue()));
        assertThat(updateFailedException.getCause().getMessage(), is("an error has happened"));
        assertThat(updateFailedException.getMessage(), is("an error has happened"));
    }
}

package com.khartec.waltz.common.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.common.exception.NotFoundException
 *
 * @author Diffblue Cover
 */

class NotFoundExceptionTest {

    @Test
    void factory1() {
        NotFoundException notFoundException =
             new NotFoundException("DE", "an error has happened");
        assertThat(notFoundException.getCode(), is("DE"));
        assertThat(notFoundException.getCause(), is(nullValue()));
        assertThat(notFoundException.getMessage(), is("an error has happened"));
    }

    @Test
    void factory2() {
        Exception cause = new Exception();
        cause.setStackTrace(new StackTraceElement[] { });
        NotFoundException notFoundException =
             new NotFoundException("DE", "an error has happened", cause);
        assertThat(notFoundException.getCode(), is("DE"));
        assertThat(notFoundException.getCause().getCause(), is(nullValue()));
        assertThat(notFoundException.getCause().getMessage(), is(nullValue()));
        assertThat(notFoundException.getMessage(), is("an error has happened"));
    }
}

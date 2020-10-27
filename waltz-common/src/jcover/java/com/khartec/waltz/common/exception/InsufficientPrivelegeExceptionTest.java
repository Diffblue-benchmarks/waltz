package com.khartec.waltz.common.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.common.exception.InsufficientPrivelegeException
 *
 * @author Diffblue Cover
 */

class InsufficientPrivelegeExceptionTest {

    @Test
    void factory() {
        InsufficientPrivelegeException insufficientPrivelegeException =
             new InsufficientPrivelegeException("an error has happened");
        StackTraceElement[] stackTrace =
             new StackTraceElement[] { new StackTraceElement("java.lang.Object", "toString", "Object.java", 1) };
        insufficientPrivelegeException.setStackTrace(stackTrace);
        assertThat(insufficientPrivelegeException.getCause(), is(nullValue()));
        assertThat(insufficientPrivelegeException.getMessage(), is("an error has happened"));
    }
}

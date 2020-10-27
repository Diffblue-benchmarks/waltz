package com.khartec.waltz.model.exceptions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.exceptions.NotAuthorizedException
 *
 * @author Diffblue Cover
 */

class NotAuthorizedExceptionTest {

    @Test
    void factory() {
        NotAuthorizedException notAuthorizedException =
             new NotAuthorizedException();
        StackTraceElement[] stackTrace =
             new StackTraceElement[] { new StackTraceElement("java.lang.Object", "toString", "Object.java", 1) };
        notAuthorizedException.setStackTrace(stackTrace);
        assertThat(notAuthorizedException.getCause(), is(nullValue()));
        assertThat(notAuthorizedException.getMessage(), is("User is not authorized to perform that action"));
    }
}

package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.UserTimestamp
 *
 * @author Diffblue Cover
 */

class UserTimestampTest {

    @Test
    void at() {
        assertThat(Math.abs(java.time.Duration.between(LocalDateTime.now(), UserTimestamp.mkForUser("root").at()).getSeconds())<=10L, is(true));
    }

    @Test
    void mkForUser() {
        // pojo UserTimestamp
        // pojo UserTimestamp
    }
}

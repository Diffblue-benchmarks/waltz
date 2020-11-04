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
        assertThat(
            Math.abs(java.time.Duration.between(LocalDateTime.now(), UserTimestamp.mkForUser("root").at()).getSeconds())
            <= 10L, is(true));
    }

    @Test
    void mkForUser() {
        // pojo UserTimestamp UserTimestamp.mkForUser("root", Timestamp.valueOf("2019-12-31 23:10:59"))
        // pojo UserTimestamp UserTimestamp.mkForUser("root", LocalDateTime.of(LocalDate.of(2_000, 1, 1), LocalTime.of(10, 50, 22)))
    }
}

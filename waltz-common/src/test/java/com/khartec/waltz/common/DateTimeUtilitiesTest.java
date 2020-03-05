/*
 * Waltz - Enterprise Architecture
 * Copyright (C) 2016, 2017, 2018, 2019 Waltz open source project
 * See README.md for more information
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific
 *
 */

package com.khartec.waltz.common;

import org.junit.Test;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;

public class DateTimeUtilitiesTest {

    @Test
    public void dateTimeConversionsReturnNullIfGivenNull() {
        assertNull(DateTimeUtilities.toSqlDate((Date) null));
        assertNull(DateTimeUtilities.toSqlDate((LocalDate) null));
        assertNull(DateTimeUtilities.toLocalDateTime(null));
        assertNull(DateTimeUtilities.toLocalDate(null));
    }

    @Test
    public void nowUtcTest() throws Exception {
        // Arrange and Act
        LocalDateTime actual = DateTimeUtilities.nowUtc();

        // Assert
        assertEquals(2019, actual.getYear());
    }

    @Test
    public void nowUtcTimestampTest() throws Exception {
        // Arrange and Act
        Timestamp actual = DateTimeUtilities.nowUtcTimestamp();

        // Assert
        assertEquals(119, actual.getYear());
    }

    @Test
    public void toLocalDateTest() throws Exception {
        // Arrange
        java.util.Date date = new java.util.Date(1L);

        // Act
        LocalDate actual = DateTimeUtilities.toLocalDate(date);

        // Assert
        assertEquals(1970, actual.getYear());
    }

    @Test
    public void toLocalDateTest2() throws Exception {
        // Arrange
        Timestamp timestamp = new Timestamp(1L);

        // Act
        LocalDate actual = DateTimeUtilities.toLocalDate(timestamp);

        // Assert
        assertEquals(1970, actual.getYear());
    }

    @Test
    public void toLocalDateTimeTest() throws Exception {
        // Arrange
        java.util.Date date = new java.util.Date(1L);

        // Act
        LocalDateTime actual = DateTimeUtilities.toLocalDateTime(date);

        // Assert
        assertEquals(1970, actual.getYear());
    }

    @Test
    public void toSqlDateTest() throws Exception {
        // Arrange
        java.util.Date date = new java.util.Date(1L);

        // Act
        java.sql.Date actual = DateTimeUtilities.toSqlDate(date);

        // Assert
        assertEquals(70, actual.getYear());
    }

    @Test
    public void toSqlDateTest2() throws Exception {
        // Arrange
        LocalDate localDate = null;

        // Act
        Date actual = DateTimeUtilities.toSqlDate(localDate);

        // Assert
        assertEquals(null, actual);
    }

    @Test
    public void todayTest() throws Exception {
        // Arrange and Act
        LocalDate actual = DateTimeUtilities.today();

        // Assert
        assertEquals(2019, actual.getYear());
    }

}

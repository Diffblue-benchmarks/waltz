package com.khartec.waltz.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.DayOfWeek;
import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Function;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.khartec.waltz.common.EnumUtilities
 *
 * @author Diffblue Cover
 */

class EnumUtilitiesTest {

    @Test
    void readEnumEnumClassIsDayOfWeekAndValueIsValueReturnsMonday() {
        @SuppressWarnings("unchecked")
        Function<String, DayOfWeek> failedParseSupplier = mock(Function.class);
        when(failedParseSupplier.apply(Mockito.<String>any()))
            .thenReturn(DayOfWeek.MONDAY);
        assertThat(EnumUtilities.<DayOfWeek>readEnum("value", DayOfWeek.class, failedParseSupplier), is(DayOfWeek.MONDAY));
    }

    @Test
    void parseEnumWithAliases1() {
        @SuppressWarnings("unchecked")
        Function<String, DayOfWeek> failedParseSupplier = mock(Function.class);
        when(failedParseSupplier.apply(Mockito.<String>any()))
            .thenReturn(DayOfWeek.MONDAY);
        assertThat(EnumUtilities.<DayOfWeek>parseEnumWithAliases("value", DayOfWeek.class, failedParseSupplier, new Aliases<DayOfWeek>()), is(DayOfWeek.MONDAY));
    }

    @Test
    void parseEnumWithAliases2() {
        @SuppressWarnings("unchecked")
        Function<String, DayOfWeek> failedParseSupplier = mock(Function.class);
        @SuppressWarnings("unchecked")
        Aliases<DayOfWeek> aliases = mock(Aliases.class);
        when(aliases.lookup(Mockito.<String>any()))
            .thenReturn(Optional.of(DayOfWeek.MONDAY));
        assertThat(EnumUtilities.<DayOfWeek>parseEnumWithAliases("value", DayOfWeek.class, failedParseSupplier, aliases), is(DayOfWeek.MONDAY));
    }

    @Test
    void names2() {
        assertThat(EnumUtilities.<DayOfWeek>names(DayOfWeek.MONDAY), hasSize(1));
        assertThat(EnumUtilities.<DayOfWeek>names(DayOfWeek.MONDAY), hasItem("MONDAY"));
    }

    @Test
    void names1() {
        LinkedList<DayOfWeek> enums = new LinkedList<DayOfWeek>();
        enums.add(DayOfWeek.MONDAY);
        assertThat(EnumUtilities.<DayOfWeek>names(enums), hasSize(1));
        assertThat(EnumUtilities.<DayOfWeek>names(enums), hasItem("MONDAY"));
    }
}

package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.EndOfLifeStatus
 *
 * @author Diffblue Cover
 */

class EndOfLifeStatusTest {

    @Test
    void valuesReturnsEnd_of_lifeNot_end_of_life() {
        EndOfLifeStatus[] result = EndOfLifeStatus.values();
        assertThat(result[0], is(EndOfLifeStatus.END_OF_LIFE));
        assertThat(result[1], is(EndOfLifeStatus.NOT_END_OF_LIFE));
    }

    @Test
    void calculateEndOfLifeStatus() throws java.text.ParseException {
        assertThat(EndOfLifeStatus.calculateEndOfLifeStatus(null), is(EndOfLifeStatus.NOT_END_OF_LIFE));
        assertThat(EndOfLifeStatus.calculateEndOfLifeStatus(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31")), is(EndOfLifeStatus.END_OF_LIFE));
    }
}

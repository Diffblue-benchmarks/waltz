package com.khartec.waltz.model.person;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.person.PersonKind
 *
 * @author Diffblue Cover
 */

class PersonKindTest {

    @Test
    void valuesReturnsEmployeeContractorConsultant() {
        PersonKind[] result = PersonKind.values();
        assertThat(result[0], is(PersonKind.EMPLOYEE));
        assertThat(result[1], is(PersonKind.CONTRACTOR));
        assertThat(result[2], is(PersonKind.CONSULTANT));
    }
}

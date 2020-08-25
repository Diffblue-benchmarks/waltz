package com.khartec.waltz.model.physical_specification_definition;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.physical_specification_definition.PhysicalSpecDefinitionType
 *
 * @author Diffblue Cover
 */

class PhysicalSpecDefinitionTypeTest {

    @Test
    void valuesReturnsDelimited() {
        assertThat(PhysicalSpecDefinitionType.values()[0], is(PhysicalSpecDefinitionType.DELIMITED));
    }
}

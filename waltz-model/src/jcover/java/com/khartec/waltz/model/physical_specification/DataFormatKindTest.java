package com.khartec.waltz.model.physical_specification;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.khartec.waltz.model.physical_specification.DataFormatKind
 *
 * @author Diffblue JCover
 */

public class DataFormatKindTest {

    @Test
    public void valuesReturnsBINARYDATABASEFLAT_FILEJSONOTHERUNSTRUCTUREDUNKNOWNXML() {
        DataFormatKind[] result = DataFormatKind.values();
        assertThat(result[0], is(DataFormatKind.BINARY));
        assertThat(result[1], is(DataFormatKind.DATABASE));
        assertThat(result[2], is(DataFormatKind.FLAT_FILE));
        assertThat(result[3], is(DataFormatKind.JSON));
        assertThat(result[4], is(DataFormatKind.OTHER));
        assertThat(result[5], is(DataFormatKind.UNSTRUCTURED));
        assertThat(result[6], is(DataFormatKind.UNKNOWN));
        assertThat(result[7], is(DataFormatKind.XML));
    }
}

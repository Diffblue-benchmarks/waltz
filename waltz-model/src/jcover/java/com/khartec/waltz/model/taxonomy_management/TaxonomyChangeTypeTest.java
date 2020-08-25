package com.khartec.waltz.model.taxonomy_management;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.taxonomy_management.TaxonomyChangeType
 *
 * @author Diffblue Cover
 */

class TaxonomyChangeTypeTest {

    @Test
    void valuesReturnsAdd_peerAdd_childRemoveDeprecateUpdate_nameUpdate_descriptionUpdate_concretenessUpdate_external_idMoveMerge() {
        TaxonomyChangeType[] result = TaxonomyChangeType.values();
        assertThat(result[0], is(TaxonomyChangeType.ADD_PEER));
        assertThat(result[1], is(TaxonomyChangeType.ADD_CHILD));
        assertThat(result[2], is(TaxonomyChangeType.REMOVE));
        assertThat(result[3], is(TaxonomyChangeType.DEPRECATE));
        assertThat(result[4], is(TaxonomyChangeType.UPDATE_NAME));
        assertThat(result[5], is(TaxonomyChangeType.UPDATE_DESCRIPTION));
        assertThat(result[6], is(TaxonomyChangeType.UPDATE_CONCRETENESS));
        assertThat(result[7], is(TaxonomyChangeType.UPDATE_EXTERNAL_ID));
        assertThat(result[8], is(TaxonomyChangeType.MOVE));
        assertThat(result[9], is(TaxonomyChangeType.MERGE));
    }
}

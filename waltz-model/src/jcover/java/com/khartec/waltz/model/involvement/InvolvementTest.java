package com.khartec.waltz.model.involvement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.khartec.waltz.model.EntityReference;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.involvement.Involvement
 *
 * @author Diffblue Cover
 */

class InvolvementTest {

    @Test
    void mkInvolvementInvolvementKindIdIsOneAndIsReadOnlyIsFalseAndProvenanceIsFoo() {
        EntityReference entityRef = mock(EntityReference.class);
        assertThat(Involvement.mkInvolvement(entityRef, "1234", 1, "foo", false).isReadOnly(), is(false));
    }
}

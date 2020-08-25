package com.khartec.waltz.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.EntityLinkUtilities
 *
 * @author Diffblue Cover
 */

class EntityLinkUtilitiesTest {

    @Test
    void mkIdLinkIdIsOneAndKindIsActor() {
        assertThat(EntityLinkUtilities.mkIdLink("ZGF0YQ==", EntityKind.ACTOR, 1L), is("ZGF0YQ==entity/ACTOR/id/1"));
    }

    @Test
    void mkExternalIdLinkKindIsActor() {
        assertThat(EntityLinkUtilities.mkExternalIdLink("ZGF0YQ==", EntityKind.ACTOR, "1234"), is("ZGF0YQ==entity/ACTOR/external-id/1234"));
    }
}

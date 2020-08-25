package com.khartec.waltz.model.usage_info;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.usage_info.UsageKind
 *
 * @author Diffblue Cover
 */

class UsageKindTest {

    @Test
    void valuesReturnsConsumerDistributorModifierOriginator() {
        UsageKind[] result = UsageKind.values();
        assertThat(result[0], is(UsageKind.CONSUMER));
        assertThat(result[1], is(UsageKind.DISTRIBUTOR));
        assertThat(result[2], is(UsageKind.MODIFIER));
        assertThat(result[3], is(UsageKind.ORIGINATOR));
    }
}

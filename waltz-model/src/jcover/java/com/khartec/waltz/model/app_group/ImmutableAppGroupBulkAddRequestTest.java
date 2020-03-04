package com.khartec.waltz.model.app_group;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for com.khartec.waltz.model.app_group.ImmutableAppGroupBulkAddRequest
 *
 * @author Diffblue JCover
 */

public class ImmutableAppGroupBulkAddRequestTest {

    @Test
    public void applicationIds() {
        assertTrue(ImmutableAppGroupBulkAddRequest.copyOf(ImmutableAppGroupBulkAddRequest.fromJson(new ImmutableAppGroupBulkAddRequest.Json())).applicationIds().isEmpty());
        assertTrue(ImmutableAppGroupBulkAddRequest.fromJson(new ImmutableAppGroupBulkAddRequest.Json()).applicationIds().isEmpty());
    }

    @Test
    public void unknownIdentifiersReturnsEmpty() {
        assertTrue(ImmutableAppGroupBulkAddRequest.fromJson(new ImmutableAppGroupBulkAddRequest.Json()).unknownIdentifiers().isEmpty());
    }

    @Test
    public void withApplicationIds() {
        // pojo ImmutableAppGroupBulkAddRequest
        // pojo ImmutableAppGroupBulkAddRequest
    }

    @Test
    public void withUnknownIdentifiersElementsIsFoo() {
        // pojo ImmutableAppGroupBulkAddRequest
    }
}

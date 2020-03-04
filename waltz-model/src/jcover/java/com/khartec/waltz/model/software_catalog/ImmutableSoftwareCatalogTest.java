package com.khartec.waltz.model.software_catalog;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for com.khartec.waltz.model.software_catalog.ImmutableSoftwareCatalog
 *
 * @author Diffblue JCover
 */

public class ImmutableSoftwareCatalogTest {

    @Test
    public void packages() {
        assertTrue(ImmutableSoftwareCatalog.copyOf(ImmutableSoftwareCatalog.fromJson(new ImmutableSoftwareCatalog.Json())).packages().isEmpty());
        assertTrue(ImmutableSoftwareCatalog.fromJson(new ImmutableSoftwareCatalog.Json()).packages().isEmpty());
    }

    @Test
    public void usagesReturnsEmpty() {
        assertTrue(ImmutableSoftwareCatalog.fromJson(new ImmutableSoftwareCatalog.Json()).usages().isEmpty());
    }

    @Test
    public void versionsReturnsEmpty() {
        assertTrue(ImmutableSoftwareCatalog.fromJson(new ImmutableSoftwareCatalog.Json()).versions().isEmpty());
    }
}

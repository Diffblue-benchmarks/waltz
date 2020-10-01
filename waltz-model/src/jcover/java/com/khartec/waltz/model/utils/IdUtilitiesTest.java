package com.khartec.waltz.model.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.khartec.waltz.model.IdProvider;

import java.util.LinkedList;
import java.util.Optional;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.utils.IdUtilities
 *
 * @author Diffblue Cover
 */

class IdUtilitiesTest {

    @Test
    void toIdsReturnsEmpty() {
        LinkedList<IdProvider> xs = new LinkedList<IdProvider>();
        IdProvider idProvider = mock(IdProvider.class);
        when(idProvider.id())
            .thenReturn(Optional.<Long>empty());
        xs.add(idProvider);
        assertThat(IdUtilities.toIds(xs), empty());
    }

    @Test
    void toIdArrayXsIsEmptyReturnsEmpty() {
        assertThat(IdUtilities.toIdArray(new LinkedList<IdProvider>()).length, is(0));
    }

    @Test
    void ensureHasIdExceptionMessageIsBarReturnsOne() {
        IdProvider idProvider = mock(IdProvider.class);
        when(idProvider.id())
            .thenReturn(Optional.of(1L));
        assertThat(IdUtilities.ensureHasId(idProvider, "bar"), is(1L));
    }

    @Test
    void getters() {
        assertThat(IdUtilities.<IdProvider>indexById(new LinkedList<IdProvider>()).isEmpty(), is(true));
        assertThat(IdUtilities.<IdProvider>indexByOptId(new LinkedList<IdProvider>()).isEmpty(), is(true));
    }

    @Test
    void indexById() {
        LinkedList<IdProvider> ts = new LinkedList<IdProvider>();
        IdProvider idProvider = mock(IdProvider.class);
        when(idProvider.id())
            .thenReturn(Optional.of(1L));
        ts.add(idProvider);
        assertThat(IdUtilities.<IdProvider>indexById(ts).get(1L), sameInstance(idProvider));
    }
}

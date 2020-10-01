package com.khartec.waltz.model.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.khartec.waltz.model.IdProvider;

import java.util.LinkedList;
import java.util.Optional;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.utils.IdUtilities
 *
 * @author Diffblue Cover
 */

class IdUtilitiesTest {

    @Test
    void toIdsReturnsOne() {
        LinkedList<IdProvider> xs = new LinkedList<IdProvider>();
        IdProvider idProvider = mock(IdProvider.class);
        when(idProvider.id())
            .thenReturn(Optional.of(1L));
        xs.add(idProvider);
        assertThat(IdUtilities.toIds(xs), hasSize(1));
        assertThat(IdUtilities.toIds(xs), hasItem(1L));
    }

    @Test
    void toIdArrayReturnsOne() {
        LinkedList<IdProvider> xs = new LinkedList<IdProvider>();
        IdProvider idProvider = mock(IdProvider.class);
        when(idProvider.id())
            .thenReturn(Optional.of(1L));
        xs.add(idProvider);
        assertThat(IdUtilities.toIdArray(xs), Matchers.arrayContaining(1L));
    }

    @Test
    void ensureHasIdReturnsOne() {
        IdProvider idProvider = mock(IdProvider.class);
        when(idProvider.id())
            .thenReturn(Optional.of(1L));
        assertThat(IdUtilities.ensureHasId(idProvider, "an error has happened"), is(1L));
    }

    @Test
    void indexByOptId() {
        LinkedList<IdProvider> ts = new LinkedList<IdProvider>();
        Optional<Long> optional = Optional.of(1L);
        IdProvider idProvider = mock(IdProvider.class);
        when(idProvider.id())
            .thenReturn(optional);
        ts.add(idProvider);
        assertThat(IdUtilities.<IdProvider>indexByOptId(ts).get(optional), sameInstance(idProvider));
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

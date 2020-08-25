package com.khartec.waltz.model.staticpanel;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.staticpanel.ContentKind
 *
 * @author Diffblue Cover
 */

class ContentKindTest {

    @Test
    void valuesReturnsHtmlMarkdown() {
        ContentKind[] result = ContentKind.values();
        assertThat(result[0], is(ContentKind.HTML));
        assertThat(result[1], is(ContentKind.MARKDOWN));
    }
}

package com.khartec.waltz.model.system.job_log;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.system.job_log.JobStatus
 *
 * @author Diffblue Cover
 */

class JobStatusTest {

    @Test
    void valuesReturnsSuccessFailureIn_progress() {
        JobStatus[] result = JobStatus.values();
        assertThat(result[0], is(JobStatus.SUCCESS));
        assertThat(result[1], is(JobStatus.FAILURE));
        assertThat(result[2], is(JobStatus.IN_PROGRESS));
    }
}

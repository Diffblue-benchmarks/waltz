package com.khartec.waltz.model.user;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.Set;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.khartec.waltz.model.user.SystemRole
 *
 * @author Diffblue Cover
 */

class SystemRoleTest {

    @Test
    void valuesReturnsAdminApp_editorAnonymousAttestation_adminAuthoritative_source_editorBeta_testerBookmark_editorCapability_editorChange_initiative_editorChange_set_editorLineage_editorLogical_data_flow_editorOrg_unit_editorRating_editorScenario_adminScenario_editorSurvey_adminSurvey_template_adminTaxonomy_editorUser_admin() {
        SystemRole[] result = SystemRole.values();
        assertThat(result[0], is(SystemRole.ADMIN));
        assertThat(result[1], is(SystemRole.APP_EDITOR));
        assertThat(result[2], is(SystemRole.ANONYMOUS));
        assertThat(result[3], is(SystemRole.ATTESTATION_ADMIN));
        assertThat(result[4], is(SystemRole.AUTHORITATIVE_SOURCE_EDITOR));
        assertThat(result[5], is(SystemRole.BETA_TESTER));
        assertThat(result[6], is(SystemRole.BOOKMARK_EDITOR));
        assertThat(result[7], is(SystemRole.CAPABILITY_EDITOR));
        assertThat(result[8], is(SystemRole.CHANGE_INITIATIVE_EDITOR));
        assertThat(result[9], is(SystemRole.CHANGE_SET_EDITOR));
        assertThat(result[10], is(SystemRole.LINEAGE_EDITOR));
        assertThat(result[11], is(SystemRole.LOGICAL_DATA_FLOW_EDITOR));
        assertThat(result[12], is(SystemRole.ORG_UNIT_EDITOR));
        assertThat(result[13], is(SystemRole.RATING_EDITOR));
        assertThat(result[14], is(SystemRole.SCENARIO_ADMIN));
        assertThat(result[15], is(SystemRole.SCENARIO_EDITOR));
        assertThat(result[16], is(SystemRole.SURVEY_ADMIN));
        assertThat(result[17], is(SystemRole.SURVEY_TEMPLATE_ADMIN));
        assertThat(result[18], is(SystemRole.TAXONOMY_EDITOR));
        assertThat(result[19], is(SystemRole.USER_ADMIN));
    }

    @Test
    void allNames() {
        Set<String> result = SystemRole.allNames();
    }
}

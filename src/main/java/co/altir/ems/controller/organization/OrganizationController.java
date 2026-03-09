package co.altir.ems.controller.organization;

import co.altir.dbmanagement.dataaccess.openapidsl.endpoint.HttpMethod;
import co.altir.dbmanagement.dataaccess.openapidsl.endpoint.annotations.DslCrudEndpoints;
import co.altir.ems.model.organization.Organization;

// Source cell: Organization (organization)::A2
public interface OrganizationController {

  @DslCrudEndpoints(
      path = "/organization",
      methods = {
        HttpMethod.GET,
        HttpMethod.GET_BY_ID,
        HttpMethod.POST,
        HttpMethod.PATCH,
        HttpMethod.DELETE
      })
  Organization crudEndpointsForOrganization();
}

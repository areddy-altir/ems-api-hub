package co.altir.ems.controller.organization;

import co.altir.dbmanagement.dataaccess.openapidsl.endpoint.HttpMethod;
import co.altir.dbmanagement.dataaccess.openapidsl.endpoint.annotations.DslCrudEndpoints;
import co.altir.ems.model.organization.EmployeeRelation;

// Source cell: Organization (organization)::A42
public interface EmployeeRelationController {

  @DslCrudEndpoints(
      path = "/employee-relations",
      methods = {HttpMethod.POST, HttpMethod.DELETE})
  EmployeeRelation crudEndpointsForEmployeeRelation();
}

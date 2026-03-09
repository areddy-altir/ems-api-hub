gipackage co.altir.ems.controller.organization;

import co.altir.dbmanagement.dataaccess.openapidsl.endpoint.HttpMethod;
import co.altir.dbmanagement.dataaccess.openapidsl.endpoint.annotations.DslCrudEndpoints;
import co.altir.dbmanagement.dataaccess.openapidsl.endpoint.annotations.DslEndpoint;
import co.altir.ems.model.common.EmployeeHierarchyNode;
import co.altir.ems.model.organization.Employee;
import java.util.List;
import java.util.UUID;

// Source cell: Organization (organization)::A24
public interface EmployeeController {

  @DslCrudEndpoints(
      path = "/employees",
      methods = {
        HttpMethod.GET,
        HttpMethod.GET_BY_ID,
        HttpMethod.POST,
        HttpMethod.PATCH,
        HttpMethod.DELETE
      })
  Employee crudEndpointsForEmployee();

  /** Assign or change role of an employee */
  @DslEndpoint(path = "/employees/{employeeId}/role", method = HttpMethod.PATCH)
  Employee updateEmployeeRole(UUID employeeId);

  /** Returns employees directly reporting to this employee */
  @DslEndpoint(path = "/employees/{employeeId}/subordinates", method = HttpMethod.GET)
  List<Employee> getSubordinates(UUID employeeId);

  /** Get full downward hierarchy */
  @DslEndpoint(path = "/employees/{employeeId}/hierarchy", method = HttpMethod.GET)
  EmployeeHierarchyNode getHierarchy(UUID employeeId);

  /** Returns direct supervisor of this employee */
  @DslEndpoint(path = "/employees/{employeeId}/supervisor", method = HttpMethod.GET)
  Employee getSupervisor(UUID employeeId);

  @DslEndpoint(path = "/employees/search", method = HttpMethod.GET)
  List<Employee> searchEmployees();
}

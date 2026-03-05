package co.altir.ems.model.common;

import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslRequired;
import co.altir.ems.model.organization.EmployeeRole;
import lombok.Data;
import lombok.experimental.Accessors;

// Source cell: Common Fragments (common)::A18
@Accessors(chain = true)
@Data
public class UpdateEmployeeRoleRequest {
  @DslRequired() private EmployeeRole role;
}

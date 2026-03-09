package co.altir.ems.model.organization;

import lombok.experimental.FieldNameConstants;

// Source cell: Organization (organization)::A34
@FieldNameConstants(onlyExplicitlyIncluded = true)
public enum EmployeeRole {
  @FieldNameConstants.Include
  EMPLOYEE,
  @FieldNameConstants.Include
  MANAGER,
  @FieldNameConstants.Include
  SENIOR_MANAGER,
  @FieldNameConstants.Include
  ADMIN,
  @FieldNameConstants.Include
  HR,
}

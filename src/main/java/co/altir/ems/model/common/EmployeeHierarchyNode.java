package co.altir.ems.model.common;

import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslFragmentProjection;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslRequired;
import co.altir.ems.model.organization.Employee;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

// Source cell: Common Fragments (common)::A22
@Accessors(chain = true)
@Data
public class EmployeeHierarchyNode {

  /** employee details */
  @DslRequired()
  @DslFragmentProjection("SUMMARY")
  private Employee employee;

  /** employees reporting to this employee */
  private List<EmployeeHierarchyNode> children;
}

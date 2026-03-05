package co.altir.ems.model.organization;

import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslFragmentProjection;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslJpaEntity;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslManyToOne;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslOneToOne;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslRequired;
import co.altir.ems.model.common.BaseAuditFields;
import java.util.UUID;
import lombok.Data;
import lombok.experimental.Accessors;

// Source cell: Organization (organization)::A24
@Accessors(chain = true)
@Data
@DslJpaEntity("employees")
public class Employee extends BaseAuditFields {

  private UUID id;

  @DslManyToOne
  @DslFragmentProjection("SUMMARY")
  @DslRequired()
  private Organization organization;

  @DslOneToOne
  @DslFragmentProjection("SUMMARY")
  @DslRequired()
  private User user;

  @DslFragmentProjection({"SUMMARY", "FULL"})
  private EmployeeRole role;
}

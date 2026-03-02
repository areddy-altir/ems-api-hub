package co.altir.ems.model.organization;

import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.*;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslJpaEntity;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslRequired;
import co.altir.ems.model.common.BaseAuditFields;
import java.util.List;
import java.util.UUID;
import lombok.Data;
import lombok.experimental.Accessors;

// Source cell: Organization (organization)::A34
@Accessors(chain = true)
@Data
@DslJpaEntity("managers")
public class Manager extends BaseAuditFields {

  private UUID id;

  @DslManyToOne
  @DslFragmentProjection({"SUMMARY", "FULL"})
  @DslRequired()
  private Organization organization;

  @DslFragmentProjection({"SUMMARY", "FULL"})
  @DslOneToOne
  @DslRequired()
  private User user;

  @DslFragmentProjection("FULL")
  @DslOneToMany(mappedBy = "manager")
  private List<Employee> employee;
}

package co.altir.ems.model.organization;

import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslFragmentProjection;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslJpaEntity;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslOneToMany;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslRequired;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslScope;
import co.altir.ems.model.common.Address;
import co.altir.ems.model.common.BaseAuditFields;
import java.util.List;
import java.util.UUID;
import lombok.Data;
import lombok.experimental.Accessors;

// Source cell: Organization (organization)::A2
@Accessors(chain = true)
@Data
@DslJpaEntity("organizations")
public class Organization extends BaseAuditFields {

  private UUID id;

  @DslFragmentProjection({"SUMMARY", "FULL"})
  @DslRequired()
  private String name;

  @DslFragmentProjection("FULL")
  @DslRequired()
  private Address address;

  @DslScope()
  @DslFragmentProjection("FULL")
  @DslOneToMany(mappedBy = "organization")
  private List<Employee> employees;
}

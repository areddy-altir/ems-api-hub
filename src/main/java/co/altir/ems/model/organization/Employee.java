package co.altir.ems.model.organization;

import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslEsDocument;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslFragmentProjection;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslJpaEntity;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslManyToOne;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslOneToOne;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslRequired;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslScope;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.Scope;
import co.altir.ems.model.common.Searchable;
import java.util.UUID;
import lombok.Data;
import lombok.experimental.Accessors;

// Source cell: Organization (organization)::A24
@Accessors(chain = true)
@Data
@DslJpaEntity("employees")
@DslEsDocument("employees")
public class Employee extends Searchable {

  private UUID id;

  @DslManyToOne
  @DslFragmentProjection("SUMMARY")
  @DslRequired()
  @DslScope({Scope.DTO, Scope.JPA, Scope.ES})
  private Organization organization;

  @DslOneToOne
  @DslFragmentProjection("SUMMARY")
  @DslRequired()
  @DslScope({Scope.DTO, Scope.JPA, Scope.ES})
  private User user;

  @DslFragmentProjection({"SUMMARY", "FULL"})
  @DslScope({Scope.DTO, Scope.JPA, Scope.ES})
  private EmployeeRole role;
}

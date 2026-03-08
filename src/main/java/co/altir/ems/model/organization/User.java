package co.altir.ems.model.organization;

import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslEsDocument;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslFragmentProjection;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslJpaEntity;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslRequired;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslScope;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.Scope;
import co.altir.ems.model.common.Address;
import co.altir.ems.model.common.BaseAuditFields;
import jakarta.persistence.Column;
import java.util.UUID;
import lombok.Data;
import lombok.experimental.Accessors;

// Source cell: Organization (organization)::A12
@Accessors(chain = true)
@Data
@DslJpaEntity("users")
@DslEsDocument("users")
public class User extends BaseAuditFields {

  private UUID id;

  @DslFragmentProjection({"SUMMARY", "FULL"})
  @DslRequired()
  @DslScope({Scope.DTO, Scope.JPA, Scope.ES})
  private String firstname;

  @DslFragmentProjection({"SUMMARY", "FULL"})
  @DslRequired()
  @DslScope({Scope.DTO, Scope.JPA, Scope.ES})
  private String lastname;

  @DslFragmentProjection({"SUMMARY", "FULL"})
  @Column(unique = true)
  @DslRequired()
  @DslScope({Scope.DTO, Scope.JPA, Scope.ES})
  private String email;

  @DslFragmentProjection("FULL")
  @DslRequired()
  @DslScope({Scope.DTO, Scope.JPA, Scope.ES})
  private String phone;

  @DslFragmentProjection("FULL")
  @DslRequired()
  private Address address;
}

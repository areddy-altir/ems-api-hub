package co.altir.ems.model.organization;

import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslFragmentProjection;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslJpaEntity;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslRequired;
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
public class User extends BaseAuditFields {

  private UUID id;

  @DslFragmentProjection({"SUMMARY", "FULL"})
  @DslRequired()
  private String firstname;

  @DslFragmentProjection({"SUMMARY", "FULL"})
  @DslRequired()
  private String lastname;

  @DslFragmentProjection({"SUMMARY", "FULL"})
  @Column(unique = true)
  @DslRequired()
  private String email;

  @DslFragmentProjection("FULL")
  @DslRequired()
  private String phone;

  @DslFragmentProjection("FULL")
  @DslRequired()
  private Address address;
}

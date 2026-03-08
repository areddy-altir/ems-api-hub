package co.altir.ems.model.organization;

import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslEsDocument;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslRequired;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslScope;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.Scope;
import java.util.UUID;
import lombok.Data;
import lombok.experimental.Accessors;

// Source cell: Organization (organization)::A50
@Accessors(chain = true)
@Data
@DslEsDocument("employee_search_documents")
public class EmployeeSearchDocument {

  @DslScope({Scope.DTO, Scope.ES})
  @DslRequired()
  private UUID employeeId;

  @DslScope({Scope.DTO, Scope.ES})
  @DslRequired()
  private UUID organizationId;

  @DslScope({Scope.DTO, Scope.ES})
  @DslRequired()
  private String role;

  @DslScope({Scope.DTO, Scope.ES})
  @DslRequired()
  private String firstName;

  @DslScope({Scope.DTO, Scope.ES})
  @DslRequired()
  private String lastName;

  @DslScope({Scope.DTO, Scope.ES})
  @DslRequired()
  private String email;

  @DslScope({Scope.DTO, Scope.ES})
  private String phone;

  @DslScope({Scope.DTO, Scope.ES})
  @DslRequired()
  private Boolean active;
}

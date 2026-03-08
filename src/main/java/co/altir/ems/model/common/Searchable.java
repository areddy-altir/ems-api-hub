package co.altir.ems.model.common;

import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslScope;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.Scope;
import lombok.Data;
import lombok.experimental.Accessors;

// Source cell: Common Fragments (common)::A9
@Accessors(chain = true)
@Data
public class Searchable extends BaseAuditFields {

  @DslScope({Scope.DTO, Scope.ES})
  private String globalSearch;
}

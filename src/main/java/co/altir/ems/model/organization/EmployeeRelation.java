package co.altir.ems.model.organization;

import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslJpaEntity;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslManyToOne;
import co.altir.dbmanagement.dataaccess.openapidsl.schema.annotations.DslRequired;
import co.altir.ems.model.common.BaseAuditFields;
import java.util.UUID;
import lombok.Data;
import lombok.experimental.Accessors;

// Source cell: Organization (organization)::A42
@Accessors(chain = true)
@Data
@DslJpaEntity("employee_relations")
public class EmployeeRelation extends BaseAuditFields {

  private UUID id;

  @DslManyToOne @DslRequired() private Employee supervisor;

  @DslManyToOne @DslRequired() private Employee subordinate;
}

package co.altir.ems.model.organization;

import java.util.UUID;
import lombok.Data;
import lombok.experimental.Accessors;

// Source cell: Organization (organization)::A66
@Accessors(chain = true)
@Data
public class EmployeeSuggest {

  private String query;

  private UUID organization;

  private String role;
}

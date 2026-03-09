package co.altir.ems.model.organization;

import java.util.List;
import java.util.UUID;
import lombok.Data;
import lombok.experimental.Accessors;

// Source cell: Organization (organization)::A50
@Accessors(chain = true)
@Data
public class EmployeeFilter {

  private String globalSearch;

  private List<UUID> organization;

  private Boolean active;
}

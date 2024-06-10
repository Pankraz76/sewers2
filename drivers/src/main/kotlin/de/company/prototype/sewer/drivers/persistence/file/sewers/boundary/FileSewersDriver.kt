package de.company.prototype.sewer.drivers.persistence.file.sewers.boundary

import de.company.prototype.sewer.drivers.adapters.sewers.boundary.SewersAdapter
import jakarta.enterprise.context.ApplicationScoped
import java.util.*

@ApplicationScoped
class FileSewersDriver : SewersAdapter {
  override fun observe(id: UUID): Set<Any> {
    TODO("Not yet implemented")
  }

  override fun indicate(sewer: UUID, kpi: Any) {
    TODO("Not yet implemented")
  }

}

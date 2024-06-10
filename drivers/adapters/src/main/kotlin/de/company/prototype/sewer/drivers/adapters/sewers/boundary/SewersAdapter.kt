package de.company.prototype.sewer.drivers.adapters.sewers.boundary

import java.util.*

interface SewersAdapter {
  fun observe(id: UUID): Set<Any>
  fun indicate(sewer: UUID, kpi: Any)
}
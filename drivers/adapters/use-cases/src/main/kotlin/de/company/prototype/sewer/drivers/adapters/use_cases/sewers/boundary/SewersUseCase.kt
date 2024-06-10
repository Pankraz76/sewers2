package de.company.prototype.sewer.drivers.adapters.use_cases.sewers.boundary

import java.util.*

interface SewersUseCase {
  fun observe(id: UUID): Set<Any>
  fun indicate(sewer: UUID, kpi: Any)
}
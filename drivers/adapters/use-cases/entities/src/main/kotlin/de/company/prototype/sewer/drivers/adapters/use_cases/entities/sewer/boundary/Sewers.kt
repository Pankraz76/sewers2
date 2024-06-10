package de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.boundary

import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.boundary.control.entity.Sewer
import java.util.*

interface Sewers {
  fun observe(id: UUID): Set<Sewer>
  fun indicate(sewer: Sewer)
}

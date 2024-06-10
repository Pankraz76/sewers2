package de.company.prototype.sewer.drivers.adapters.sewers.boundary

import de.company.prototype.sewer.drivers.adapters.use_cases.sewers.boundary.SewersUseCase
import jakarta.enterprise.context.ApplicationScoped
import java.util.*

@ApplicationScoped
class SewersAdapterBridge(
  private val sewers: SewersAdapter
) : SewersUseCase {
  override fun observe(id: UUID): Set<Any> {
    return sewers.observe(id)
  }

  override fun indicate(sewer: UUID, kpi: Any) {
    sewers.indicate(sewer, kpi)
  }
}

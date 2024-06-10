package de.company.prototype.sewer.drivers.adapters.use_cases.sewers.boundary

import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.boundary.Sewers
import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.boundary.control.entity.Sewer
import jakarta.enterprise.context.ApplicationScoped
import java.util.*

@ApplicationScoped
class SewersUseCaseBridge(
  private val sewers: SewersUseCase
) : Sewers {
  override fun observe(id: UUID): Set<Sewer> {
    return sewers.observe(id) as Set<Sewer>
  }

  override fun indicate(sewer: Sewer) {
    TODO("Not yet implemented")
  }


}

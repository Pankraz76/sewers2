package de.company.prototype.sewer.drivers.adapters.use_cases.observe.boundary

import de.company.prototype.sewer.drivers.adapters.use_cases.entities.observe.boundary.SewerObservationService
import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.boundary.control.entity.Sewer
import de.company.prototype.woodpecker.common.bce.boundary.FunctionalService
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class SewerObservationUseCase(
  private val sewerObservation: SewerObservationService
) : FunctionalService<String, Set<Sewer>> {

  override fun serve(input: String): Set<Sewer> {
    return sewerObservation.serve(input)
  }
}

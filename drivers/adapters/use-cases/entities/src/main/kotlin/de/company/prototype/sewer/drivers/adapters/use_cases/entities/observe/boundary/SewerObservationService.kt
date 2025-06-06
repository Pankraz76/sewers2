package de.company.prototype.sewer.drivers.adapters.use_cases.entities.observe.boundary

import de.company.prototype.sewer.drivers.adapters.use_cases.entities.observe.boundary.control.SewerObservationComponent
import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.boundary.control.entity.Sewer
import de.company.prototype.woodpecker.common.bce.boundary.FunctionalService
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class SewerObservationService(
  private val sewerObservation: SewerObservationComponent
) : FunctionalService<String, Set<Sewer>> {

  override fun serve(args: String): Set<Sewer> {
    return sewerObservation.execute(args)
  }
}
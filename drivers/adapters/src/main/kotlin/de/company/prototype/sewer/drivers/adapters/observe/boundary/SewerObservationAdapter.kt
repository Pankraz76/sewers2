package de.company.prototype.sewer.drivers.adapters.observe.boundary

import de.company.prototype.sewer.drivers.adapters.use_cases.observe.boundary.SewerObservationUseCase
import de.company.prototype.woodpecker.common.bce.boundary.FunctionalService
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class SewerObservationAdapter(
  private val sewerObservation: SewerObservationUseCase
) : FunctionalService<String, Set<Any>> {

  override fun serve(args: String): Set<Any> {
    return sewerObservation.serve(args)
  }

}

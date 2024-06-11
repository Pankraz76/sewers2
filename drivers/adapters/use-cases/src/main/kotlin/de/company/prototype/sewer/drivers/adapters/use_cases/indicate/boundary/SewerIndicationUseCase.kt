package de.company.prototype.sewer.drivers.adapters.use_cases.indicate.boundary

import de.company.prototype.sewer.drivers.adapters.use_cases.entities.indicate.boundary.SewerOverflowIndicationService
import de.company.prototype.woodpecker.common.bce.boundary.Service
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class SewerIndicationUseCase(
  private val sewerOverflowIndication: SewerOverflowIndicationService,
) : Service<Map<String, String>> {

  override fun serve(args: Map<String, String>) {
    sewerOverflowIndication.serve(args)
  }
}

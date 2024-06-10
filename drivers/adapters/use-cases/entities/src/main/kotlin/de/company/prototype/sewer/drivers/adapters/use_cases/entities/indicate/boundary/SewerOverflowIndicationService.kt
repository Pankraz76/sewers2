package de.company.prototype.sewer.drivers.adapters.use_cases.entities.indicate.boundary

import de.company.prototype.sewer.drivers.adapters.use_cases.entities.indicate.boundary.control.SewerOverflowIndicationComponent
import de.company.prototype.woodpecker.common.bce.boundary.Service
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class SewerOverflowIndicationService(
  private val sewerOverflowIndication: SewerOverflowIndicationComponent
) : Service<Map<String, String>> {
  override fun serve(args: Map<String, String>) {
    return sewerOverflowIndication.execute(args)
  }
}
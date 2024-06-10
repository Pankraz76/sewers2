package de.company.prototype.sewer.drivers.adapters.use_cases.entities.indicate.boundary

import de.company.prototype.woodpecker.common.bce.boundary.Service
import de.company.prototype.sewer.drivers.adapters.use_cases.entities.indicate.boundary.control.SewerOverflowIndicationComponent
import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.boundary.control.entity.Sewer
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class SewerOverflowIndicationService(
  private val sewerOverflowIndication: SewerOverflowIndicationComponent
) : Service<Sewer> {
  override fun serve(input: Sewer) {
    return sewerOverflowIndication.execute(input)
  }
}
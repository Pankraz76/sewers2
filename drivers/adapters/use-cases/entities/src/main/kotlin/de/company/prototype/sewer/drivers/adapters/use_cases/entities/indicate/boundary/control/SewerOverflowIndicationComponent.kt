package de.company.prototype.sewer.drivers.adapters.use_cases.entities.indicate.boundary.control

import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.boundary.Sewers
import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.boundary.control.entity.Sewer
import de.company.prototype.woodpecker.common.bce.boundary.control.Component
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class SewerOverflowIndicationComponent(
  private val sewers: Sewers
) : Component<Sewer> {

  override fun execute(input: Sewer) {
    return sewers.indicate(input.id, input.kpi)
  }
}

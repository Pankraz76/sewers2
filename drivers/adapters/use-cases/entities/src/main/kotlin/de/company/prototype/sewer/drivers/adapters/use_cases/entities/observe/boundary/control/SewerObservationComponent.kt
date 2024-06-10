package de.company.prototype.sewer.drivers.adapters.use_cases.entities.observe.boundary.control

import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.boundary.Sewers
import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.boundary.control.entity.Sewer
import de.company.prototype.woodpecker.common.bce.boundary.control.FunctionalComponent
import jakarta.enterprise.context.ApplicationScoped
import java.util.UUID.fromString

@ApplicationScoped
class SewerObservationComponent(
  private val sewers: Sewers
) : FunctionalComponent<String, Set<Sewer>> {

  override fun execute(args: String): Set<Sewer> {
    return sewers.observe(fromString(args))
  }
}

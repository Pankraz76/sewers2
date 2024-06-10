package de.company.prototype.sewer.drivers.adapters.use_cases.entities.indicate.boundary.control

import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.boundary.Sewers
import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.boundary.control.entity.Sewer
import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.problem.boundary.control.entity.Problem
import de.company.prototype.woodpecker.common.bce.boundary.control.Component
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class RainIndicationComponent(
  private val sewers: Sewers
) : Component<Map<String, Any>> {

  override fun execute(args: Map<String, Any>) {
    return check(
      args["indication.rain"] as Int,
      args["sewer"] as Sewer)
  }

  private fun check(rainPercentage: Int, sewer: Sewer) {
    sewer.problems.plus(Problem("rain shortage", 100 - rainPercentage))
    return sewers.indicate(sewer)
  }
}

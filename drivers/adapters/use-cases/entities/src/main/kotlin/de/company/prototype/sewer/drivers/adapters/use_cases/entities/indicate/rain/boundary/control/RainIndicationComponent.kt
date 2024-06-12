package de.company.prototype.sewer.drivers.adapters.use_cases.entities.indicate.rain.boundary.control

import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.boundary.control.entity.Sewer
import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.problem.boundary.control.entity.Problem
import de.company.prototype.woodpecker.common.bce.boundary.control.Component
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class RainIndicationComponent : Component<Map<String, String>> {

  override fun execute(args: Map<String, String>) {
    return check(
      args["indication.rain"] as Int,
      args["sewer"] as Sewer)
  }

  private fun check(rainPercentage: Int, sewer: Sewer) {
    sewer.problems.plus(Problem("rain shortage", 100 - rainPercentage))
  }
}

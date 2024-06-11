package de.company.prototype.sewer.drivers.adapters.indicate.boundary

import de.company.prototype.sewer.drivers.adapters.use_cases.indicate.boundary.SewerIndicationUseCase
import de.company.prototype.woodpecker.common.bce.boundary.Service
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class SewerIndicationAdapter(
  private val sewerIndication: SewerIndicationUseCase,
) : Service<String> {
  override fun serve(args: String) {
    sewerIndication.serve(args as Map<String, String>)
  }

}

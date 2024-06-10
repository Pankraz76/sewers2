package de.company.prototype.sewer.drivers.adapters.use_cases.indicate.boundary

import com.fasterxml.jackson.databind.ObjectMapper
import de.company.prototype.sewer.drivers.adapters.use_cases.entities.indicate.boundary.SewerOverflowIndicationService
import de.company.prototype.woodpecker.common.bce.boundary.Service
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class SewerIndicationUseCase(
  private val sewerOverflowIndication: SewerOverflowIndicationService,
  private val objectMapper: ObjectMapper
) : Service<String> {

  override fun serve(args: String) {
    sewerOverflowIndication.serve(objectMapper.readValue(args, Map::class.java) as Map<String, String>)
  }
}

package de.company.prototype.sewer.drivers.rest.observe.boundary

import com.fasterxml.jackson.databind.ObjectMapper
import de.company.prototype.sewer.drivers.adapters.observe.boundary.SewerObservationAdapter
import de.company.prototype.woodpecker.common.bce.boundary.FunctionalService
import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.GET
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType.APPLICATION_JSON

@ApplicationScoped
@Produces(APPLICATION_JSON)
class ObservationResourceDriver(
  private val sewerObservation: SewerObservationAdapter,
  private val objectMapper: ObjectMapper
) : FunctionalService<String, String> {

  @GET
  override fun serve(input: String): String {
    return objectMapper.writeValueAsString(map(sewerObservation.serve(input)))
  }

  private fun map(serve: Set<Any>) =
    mapOf(
      Pair("size", serve.size),
      Pair("sewer", serve))
}

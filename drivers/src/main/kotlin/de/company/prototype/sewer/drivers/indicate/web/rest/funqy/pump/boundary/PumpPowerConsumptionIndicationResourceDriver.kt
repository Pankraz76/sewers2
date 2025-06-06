package de.company.prototype.sewer.drivers.indicate.web.rest.funqy.pump.boundary

import de.company.prototype.sewer.drivers.adapters.indicate.boundary.SewerIndicationAdapter
import de.company.prototype.woodpecker.common.bce.boundary.Service
import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.PUT
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType.APPLICATION_JSON
import org.jboss.resteasy.reactive.ResponseStatus

@ApplicationScoped
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
class PumpPowerConsumptionIndicationResourceDriver(
  private val sewerIndication: SewerIndicationAdapter,
) : Service<String> {

  @PUT
  @Path("pumpPowerConsumption")
  @ResponseStatus(204)
  override fun serve(args: String) {
    sewerIndication.serve(args)
  }

}

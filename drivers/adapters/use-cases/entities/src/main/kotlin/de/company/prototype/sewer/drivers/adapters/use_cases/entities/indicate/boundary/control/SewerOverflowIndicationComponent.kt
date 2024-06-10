package de.company.prototype.sewer.drivers.adapters.use_cases.entities.indicate.boundary.control

import de.company.prototype.sewer.drivers.adapters.use_cases.entities.indicate.pump.boundary.control.PumpIndicationComponent
import de.company.prototype.sewer.drivers.adapters.use_cases.entities.indicate.rain.boundary.control.RainShortageIndicationComponent
import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.boundary.Sewers
import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.boundary.control.entity.Sewer
import de.company.prototype.woodpecker.common.bce.boundary.control.Component
import jakarta.enterprise.context.ApplicationScoped
import java.util.UUID.fromString

@ApplicationScoped
class SewerOverflowIndicationComponent(
  private val sewers: Sewers,
  private val rainShortageIndication: RainShortageIndicationComponent,
  private val pumpIndication: PumpIndicationComponent
) : Component<Map<String, String>> {

  override fun execute(args: Map<String, String>) {
    return execute(
      sewers.observe(fromString(args["id"])).first(),
      args)
  }

  private fun execute(sewer: Sewer,
                      args: Map<String, String>) {
    execute(mapOf(
      Pair("sewer", sewer),
      Pair("indication", args["indication"].toString())))
    return sewers.indicate(sewer)
  }

  private fun execute(args: Map<String, Any>) {
    rainShortageIndication.execute(args)
    pumpIndication.execute(args)
  }
}

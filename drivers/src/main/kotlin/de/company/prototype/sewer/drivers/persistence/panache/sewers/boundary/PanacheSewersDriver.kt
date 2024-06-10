package de.company.prototype.sewer.drivers.persistence.panache.sewers.boundary

import de.company.prototype.sewer.drivers.adapters.sewers.boundary.SewersAdapter
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped
import java.util.*

@ApplicationScoped
class PanacheSewersDriver(
  private val panacheRepository: PanacheRepository<Any>,
  private val SewersAdapter: SewersAdapter
) : SewersAdapter {
  override fun observe(id: UUID): Set<Any> {
    TODO("Not yet implemented")
  }

  override fun indicate(sewer: UUID, kpi: Any) {
    TODO("Not yet implemented")
  }

}

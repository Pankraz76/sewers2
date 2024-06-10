package de.company.prototype.sewer.drivers.persistence.orchestrator.sewers.boundary

import de.company.prototype.sewer.drivers.adapters.sewers.boundary.SewersAdapter
import de.company.prototype.sewer.drivers.persistence.aws.dynamo.sewers.boundary.DynamoSewersDriver
import de.company.prototype.sewer.drivers.persistence.aws.s3.sewers.boundary.S3SewersDriver
import de.company.prototype.sewer.drivers.persistence.file.sewers.boundary.FileSewersDriver
import de.company.prototype.sewer.drivers.persistence.panache.sewers.boundary.PanacheSewersDriver
import jakarta.enterprise.context.ApplicationScoped
import java.util.*

@ApplicationScoped
class SewersDriverOrchestrator(
  private val file: FileSewersDriver,
  private val pa: PanacheSewersDriver,
  private val file2: DynamoSewersDriver,
  private val file23: S3SewersDriver
) : SewersAdapter {
  override fun observe(id: UUID): Set<Any> {
    return file.observe(id)
  }

  override fun indicate(sewer: UUID, kpi: Any) {
    file.indicate(sewer, kpi)
  }

}

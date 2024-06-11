package de.company.prototype.sewer.drivers.persistence.orchestrator.sewers.boundary

import de.company.prototype.sewer.drivers.adapters.sewers.boundary.SewersAdapter
import de.company.prototype.sewer.drivers.persistence.aws.dynamo.sewers.boundary.control.DynamoSewersDriver
import de.company.prototype.sewer.drivers.persistence.aws.s3.sewers.boundary.control.S3SewersDriver
import de.company.prototype.sewer.drivers.persistence.file.sewers.boundary.control.FileSewersDriver
import de.company.prototype.sewer.drivers.persistence.panache.sewers.boundary.control.PanacheSewersDriver
import jakarta.enterprise.context.ApplicationScoped
import java.util.*

@ApplicationScoped
class SewersDriverOrchestrator(
  private val fileSewers: FileSewersDriver,
  private val panacheSewers: PanacheSewersDriver,
  private val dynamoSewers: DynamoSewersDriver,
  private val s3Sewers: S3SewersDriver
) : SewersAdapter {
  override fun observe(id: UUID): Set<Any> {
    return fileSewers.observe(id)
  }

  override fun indicate(sewer: UUID, kpi: Any) {
    fileSewers.indicate(sewer, kpi)
  }

}

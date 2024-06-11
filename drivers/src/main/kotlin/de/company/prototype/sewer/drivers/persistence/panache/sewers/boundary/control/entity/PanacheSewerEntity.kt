package de.company.prototype.sewer.drivers.persistence.panache.sewers.boundary.control.entity

import de.company.prototype.sewer.drivers.persistence.panache.sewers.kpi.boundary.control.entity.KeyPerformanceIndicator
import de.company.prototype.sewer.drivers.persistence.panache.sewers.problem.boundary.control.entity.Problem
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import jakarta.annotation.Nonnull
import jakarta.persistence.Entity

@Entity
data class PanacheSewerEntity(
  @Nonnull
  val kpi: KeyPerformanceIndicator,
  @Nonnull
  var problems: Set<Problem>
) : PanacheEntity()
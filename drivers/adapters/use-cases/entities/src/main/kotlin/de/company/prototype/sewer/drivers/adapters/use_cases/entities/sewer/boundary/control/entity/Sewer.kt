package de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.boundary.control.entity

import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.kpi.boundary.control.entity.KeyPerformanceIndicator
import de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.problem.boundary.control.entity.Problem
import jakarta.annotation.Nonnull
import java.util.*

data class Sewer(
  @Nonnull
  val id: UUID,
  @Nonnull
  val kpi: KeyPerformanceIndicator,
  @Nonnull
  val problem: Problem
)

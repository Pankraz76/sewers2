package de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.kpi.boundary.control.entity

import jakarta.annotation.Nonnull

data class KeyPerformanceIndicator(
  @Nonnull
  val pumpPowerConsumption: String,
  @Nonnull
  val flow: String,
  @Nonnull
  val rainfall: Number
)

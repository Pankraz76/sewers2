package de.company.prototype.sewer.drivers.persistence.panache.sewers.kpi.boundary.control.entity

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import jakarta.annotation.Nonnull
import jakarta.persistence.Entity

@Entity
data class KeyPerformanceIndicator(
  @Nonnull
  val pumpPowerConsumption: String,
  @Nonnull
  val flow: String,
  @Nonnull
  val rainfall: Number
) : PanacheEntity()
package de.company.prototype.sewer.drivers.persistence.panache.sewers.boundary.control.entity

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import jakarta.annotation.Nonnull
import jakarta.annotation.Nullable
import jakarta.persistence.Entity

@Entity
data class Problem(
  @Nullable
  val reason: String,
  @Nonnull
  val overflowIndication: Number
) : PanacheEntity()

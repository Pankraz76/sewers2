package de.company.prototype.sewer.drivers.adapters.use_cases.entities.sewer.problem.boundary.control.entity

import jakarta.annotation.Nonnull
import jakarta.annotation.Nullable

data class Problem(
  @Nullable
  val reason: String,
  @Nonnull
  val overflowIndication: Number
)

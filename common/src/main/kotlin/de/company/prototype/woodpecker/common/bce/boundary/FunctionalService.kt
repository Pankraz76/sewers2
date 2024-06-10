package de.company.prototype.woodpecker.common.bce.boundary

interface FunctionalService<Input, Output> {
  fun serve(input: Input): Output
}

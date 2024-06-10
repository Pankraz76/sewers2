package de.company.prototype.woodpecker.common.bce.boundary

interface FunctionalService<Input, Output> {
  fun serve(args: Input): Output
}

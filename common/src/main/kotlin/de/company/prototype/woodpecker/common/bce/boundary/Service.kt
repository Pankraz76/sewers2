package de.company.prototype.woodpecker.common.bce.boundary

interface Service<Input> {
  fun serve(input: Input)
}

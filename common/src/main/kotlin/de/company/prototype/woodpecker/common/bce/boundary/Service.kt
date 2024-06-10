package de.company.prototype.woodpecker.common.bce.boundary

interface Service<Input> {
  fun serve(args: Input)
}

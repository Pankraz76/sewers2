package de.company.prototype.woodpecker.common.bce.boundary.control

interface FunctionalComponent<Input, Output> {
  fun execute(args: Input): Output
}

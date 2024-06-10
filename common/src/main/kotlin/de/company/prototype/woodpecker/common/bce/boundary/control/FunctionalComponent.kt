package de.company.prototype.woodpecker.common.bce.boundary.control

interface FunctionalComponent<Input, Output> {
  fun execute(input: Input): Output
}

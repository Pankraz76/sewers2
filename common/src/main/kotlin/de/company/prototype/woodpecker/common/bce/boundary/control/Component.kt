package de.company.prototype.woodpecker.common.bce.boundary.control

interface Component<Input> {
  fun execute(input: Input)
}

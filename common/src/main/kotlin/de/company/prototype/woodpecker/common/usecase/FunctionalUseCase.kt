package de.company.prototype.woodpecker.common.usecase

interface FunctionalUseCase<Input, Output> {
  fun action(input: Input): Output
}

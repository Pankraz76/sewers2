package de.company.prototype.woodpecker.common.usecase

interface UseCase<Input> {
  fun action(input: Input)
}

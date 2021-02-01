package com.ineverleft.leraning.designPattern.strategyTree.core;

public interface StrategyMapper<T, R> {

  StrategyHandler<T, R> get(T param);
}

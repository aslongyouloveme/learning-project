package com.ineverleft.leraning.designPattern.strategyTree.core;

import javax.annotation.PostConstruct;
import java.util.Objects;

/**
 * @Description @ClassName AbstractStrategyRouter @Author ineverleft
 *
 * @date 2021.01.28 16:01
 */
public abstract class AbstractStrategyRouter<T, R> {

  public StrategyMapper<T, R> strategyMapper;

  @PostConstruct
  private void abstractInit() {
    strategyMapper = registerStrategyMapper();
    Objects.requireNonNull(strategyMapper, "strategyMapper cannot be null");
  }

  @SuppressWarnings("unchecked")
  private StrategyHandler<T, R> defaultStrategyHandler = StrategyHandler.DEFAULT;

  public R applyStrategy(T param) {
    StrategyHandler<T, R> strategyHandler = strategyMapper.get(param);
    if (strategyHandler != null) {
      return strategyHandler.apply(param);
    }

    return defaultStrategyHandler.apply(param);
  }

  public abstract StrategyMapper<T, R> registerStrategyMapper();

  public StrategyHandler<T, R> getDefaultStrategyHandler() {
    return defaultStrategyHandler;
  }

  public void setDefaultStrategyHandler(StrategyHandler<T, R> defaultStrategyHandler) {
    this.defaultStrategyHandler = defaultStrategyHandler;
  }
}

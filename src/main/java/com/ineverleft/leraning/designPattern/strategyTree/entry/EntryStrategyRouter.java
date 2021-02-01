package com.ineverleft.leraning.designPattern.strategyTree.entry;

import com.ineverleft.leraning.designPattern.strategyTree.core.AbstractStrategyRouter;
import com.ineverleft.leraning.designPattern.strategyTree.core.StrategyMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description @ClassName StrategyRouter @Author ineverleft
 *
 * @date 2021.01.28 16:40
 */
@Service
public class EntryStrategyRouter extends AbstractStrategyRouter {

  @Resource private EntryStrategyMapper entryStrategyMapper;
  @Override
  public StrategyMapper registerStrategyMapper() {
    return entryStrategyMapper;
  }
}

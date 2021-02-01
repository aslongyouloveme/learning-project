package com.ineverleft.leraning.designPattern.strategyTree.firstTree;

import com.ineverleft.leraning.designPattern.strategyTree.secondTree.StudentStrategyMapper;
import com.ineverleft.leraning.designPattern.strategyTree.core.AbstractStrategyRouter;
import com.ineverleft.leraning.designPattern.strategyTree.core.StrategyHandler;
import com.ineverleft.leraning.designPattern.strategyTree.core.StrategyMapper;
import org.springframework.stereotype.Service;

/**
 * @Description @ClassName TestHandler @Author ineverleft
 *
 * @date 2021.01.28 16:04
 */
@Service
public class ApiStrategyRouterV2 extends AbstractStrategyRouter implements StrategyHandler {

  @Override
  public StrategyMapper registerStrategyMapper() {
    return new StudentStrategyMapper();
  }

  @Override
  public Object apply(Object param) {
    System.out.println("v2 被调用了");
    return null;
  }
}

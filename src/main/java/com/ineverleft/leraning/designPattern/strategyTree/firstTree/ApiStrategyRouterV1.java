package com.ineverleft.leraning.designPattern.strategyTree.firstTree;

import com.ineverleft.leraning.designPattern.strategyTree.secondTree.StudentStrategyMapper;
import com.ineverleft.leraning.designPattern.strategyTree.core.AbstractStrategyRouter;
import com.ineverleft.leraning.designPattern.strategyTree.core.StrategyHandler;
import com.ineverleft.leraning.designPattern.strategyTree.core.StrategyMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description @ClassName TestHandler @Author ineverleft
 *
 * @date 2021.01.28 16:04
 */
@Service
public class ApiStrategyRouterV1 extends AbstractStrategyRouter implements StrategyHandler {

  @Resource private StudentStrategyMapper studentStrategyMapper;

  @Override
  public StrategyMapper registerStrategyMapper() {
    return studentStrategyMapper;
  }

  @Override
  public Object apply(Object param) {
    System.out.println("v1 被调用了");
    this.applyStrategy(param);
    return null;
  }
}

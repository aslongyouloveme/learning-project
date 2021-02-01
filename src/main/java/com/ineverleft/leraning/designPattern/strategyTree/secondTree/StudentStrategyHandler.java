package com.ineverleft.leraning.designPattern.strategyTree.secondTree;

import com.ineverleft.leraning.designPattern.strategyTree.core.StrategyHandler;
import org.springframework.stereotype.Service;

/**
 * @Description @ClassName StudentStrategyHandler @Author ineverleft
 *
 * @date 2021.01.28 16:23
 */
@Service
public class StudentStrategyHandler implements StrategyHandler {
  @Override
  public Object apply(Object param) {
    System.out.println("哈哈");
    return null;
  }
}

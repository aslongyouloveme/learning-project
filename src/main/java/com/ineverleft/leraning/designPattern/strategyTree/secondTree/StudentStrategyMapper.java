package com.ineverleft.leraning.designPattern.strategyTree.secondTree;

import com.ineverleft.leraning.designPattern.strategyTree.core.StrategyHandler;
import com.ineverleft.leraning.designPattern.strategyTree.core.StrategyMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description @ClassName StudentStrategyMapper @Author ineverleft
 *
 * @date 2021.01.28 16:22
 */
@Service
public class StudentStrategyMapper implements StrategyMapper {

  @Resource private StudentStrategyHandler studentStrategyHandler;

  @Override
  public StrategyHandler get(Object param) {
    return studentStrategyHandler;
  }
}

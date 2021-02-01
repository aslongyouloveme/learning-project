package com.ineverleft.leraning.designPattern.strategyTree.entry;

import com.ineverleft.leraning.designPattern.strategyTree.firstTree.ApiStrategyRouterV1;
import com.ineverleft.leraning.designPattern.strategyTree.firstTree.ApiStrategyRouterV2;
import com.ineverleft.leraning.designPattern.strategyTree.core.StrategyHandler;
import com.ineverleft.leraning.designPattern.strategyTree.core.StrategyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description @ClassName TopStrategyMapper @Author ineverleft
 * @date 2021.01.28 16:45
 */
@Service
public class EntryStrategyMapper implements StrategyMapper {

    @Resource
    private ApiStrategyRouterV1 apiStrategyRouterV1;
    @Autowired
    private ApiStrategyRouterV2 apiStrategyRouterV2;

    @Override
    public StrategyHandler get(Object param) {
        if (param.equals("1")) {
            return apiStrategyRouterV1;
        } else if (param.equals("2")) {
            return apiStrategyRouterV2;
        }
        return null;
    }
}

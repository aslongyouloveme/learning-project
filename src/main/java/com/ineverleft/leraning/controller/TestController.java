package com.ineverleft.leraning.controller;

import com.ineverleft.leraning.designPattern.strategyTree.firstTree.ApiStrategyRouterV1;
import com.ineverleft.leraning.designPattern.strategyTree.firstTree.ApiStrategyRouterV2;
import com.ineverleft.leraning.designPattern.strategyTree.entry.EntryStrategyRouter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description @ClassName TestController @Author ineverleft
 *
 * @date 2021.01.27 20:14
 */
@RestController
public class TestController {

  @Resource private TestService testService;
  @Resource EntryStrategyRouter router;
  @Resource private ApiStrategyRouterV1 apiStrategyRouterV1;
  @Autowired
  private ApiStrategyRouterV2 apiStrategyRouterV2;

  @GetMapping
  Object test() {
    return router.applyStrategy("1");
  }

//  @GetMapping
//  Object test(@RequestParam("phoneNumber") String number) {
//    if (number.equals("18349296521")) {
//      return "尚飞";
//    } else if (number.equals("18384193521")) {
//      return "徐蓉";
//    }
//    return "你好";
//  }
}

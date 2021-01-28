package com.ineverleft.leraning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description @ClassName TestController @Author ineverleft
 *
 * @date 2021.01.27 20:14
 */
@RestController
public class TestController {

  @GetMapping
  Object test(@RequestParam("phoneNumber") String number) {
    if (number.equals("18349296521")) {
      return "尚飞";
    } else if (number.equals("18384193521")) {
      return "徐蓉";
    }
    return "你好";
  }
}

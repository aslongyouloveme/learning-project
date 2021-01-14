package com.ineverleft.leraning.redis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class LockServiceTest {

  @Resource LockService lockService;

//  @Test
//  void lock() throws Exception {
//    lockService.lock();
//  }
}

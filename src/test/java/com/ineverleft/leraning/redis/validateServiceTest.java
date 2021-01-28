package com.ineverleft.leraning.redis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class validateServiceTest {

  @Resource private validateService validateService;

  @Test
  void validate() {
    String json = "{\n" +
            "\t\"awardTy10pe\": \"balance\",\n" +
            "\t\"awardAmount\": 1001,\n" +
            "\t\"description\": \"牛逼\",\n" +
            "\t\"channelUrl\": \"https://t.yowin.mobi/click/fyOvdBC0wo7W0b1g2NpXHB?did={deviceId}&sid=bt_offers&chn=c1&ext={extension}}\",\n" +
            "\t\"getButton\": \"世界\",\n" +
            "\t\"showButton\": \"你好\"\n" +
            "}";
    String key = "IntegralTask_04";
    validateService.validateObject(json, key);
  }
}

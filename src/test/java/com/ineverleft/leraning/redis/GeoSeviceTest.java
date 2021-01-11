package com.ineverleft.leraning.redis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GeoSeviceTest {

  @Resource private GeoSevice geoSevice;

  @Test
  public void geoAdd() {
    geoSevice.geoAdd();
  }

  @Test
  public void geoGetRadius() {
    geoSevice.geoGetRadius();
  }
}

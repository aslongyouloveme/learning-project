package com.ineverleft.leraning.redis;

import cn.hutool.core.convert.Convert;
import com.google.common.collect.Lists;
import org.springframework.data.geo.*;
import org.springframework.data.redis.connection.RedisGeoCommands;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description @ClassName GeoSevice @Author ineverleft
 *
 * @date 2021.01.11 13:59
 */
@Service
public class GeoSevice {

  @Resource private RedisTemplate<String, String> redisTemplate;

  public void geoAdd() {

    RedisGeoCommands.GeoLocation<String> geoLocation1 =
        new RedisGeoCommands.GeoLocation<>("充电宝1", new Point(Convert.toDouble(104.062325), Convert.toDouble(30.56127)));
    RedisGeoCommands.GeoLocation<String> geoLocation2 =
        new RedisGeoCommands.GeoLocation<>("充电宝2", new Point(104.059235, 30.56127));
    RedisGeoCommands.GeoLocation<String> geoLocation3 =
        new RedisGeoCommands.GeoLocation<>("充电宝3", new Point(104.069511, 30.552003));
    RedisGeoCommands.GeoLocation<String> geoLocation4 =
        new RedisGeoCommands.GeoLocation<>("充电宝4", new Point(104.058588, 30.567365));
    RedisGeoCommands.GeoLocation<String> geoLocation5 =
        new RedisGeoCommands.GeoLocation<>("充电宝5", new Point(104.04594, 30.561208));
    RedisGeoCommands.GeoLocation<String> geoLocation6 =
        new RedisGeoCommands.GeoLocation<>("充电宝6", new Point(104.071739, 30.558969));
    Iterable<RedisGeoCommands.GeoLocation<String>> locations = Lists.newArrayList(geoLocation1);
    redisTemplate.opsForGeo().add("testBattery", geoLocation1);
  }

  public void geoGetRadius() {
    RedisGeoCommands.GeoRadiusCommandArgs args =
        RedisGeoCommands.GeoRadiusCommandArgs.newGeoRadiusArgs()
            .includeDistance()
            .includeCoordinates()
            .sortAscending()
            .limit(10);

    GeoResults<RedisGeoCommands.GeoLocation<String>> results =
        redisTemplate
            .opsForGeo()
            .radius("testBattery", new Circle(new Point(104.048599, 30.549639), new Distance(50, Metrics.KILOMETERS)), args);
    System.out.println(results.getContent().toString());
  }
}

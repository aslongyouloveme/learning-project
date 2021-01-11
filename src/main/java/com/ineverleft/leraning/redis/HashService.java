package com.ineverleft.leraning.redis;

import cn.hutool.core.bean.BeanUtil;
import com.alibaba.fastjson.JSON;
import com.ineverleft.leraning.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Description @ClassName HashService @Author ineverleft
 *
 * @date 2021.01.11 17:08
 */
@Service
@Slf4j
public class HashService {
  @Resource RedisTemplate<String, String> redisTemplate;

  public void hashAdd() {
    Book book = new Book();
    book.setId(1);
    book.setName("你好世界");
    redisTemplate.opsForHash().putAll("book", BeanUtil.beanToMap(book));
  }

  public void getHash() {
    Map<Object, Object> map = redisTemplate.opsForHash().entries("book");
    log.info(JSON.toJSONString(map));
  }
}

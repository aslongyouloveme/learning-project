package com.ineverleft.leraning.json;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.google.gson.Gson;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Description @ClassName JsonVS @Author ineverleft
 *
 * @date 2021.02.02 14:30
 */
public class JsonVS {

  public static void main(String[] args) {

    List<Book> books = Lists.newArrayListWithCapacity(1);
    for (int i = 0; i < 1; i++) {
      books.add(new Book("xx", "xx", 1, new BigDecimal("231")));
    }
    gson(books);
    fastJson(books);
  }

  public static void gson(List<Book> books) {
    Stopwatch stopwatch = Stopwatch.createStarted();
    Gson gson = new Gson();
    books.forEach(gson::toJson);
    System.out.println(stopwatch.elapsed(TimeUnit.MILLISECONDS));
  }

  public static void fastJson(List<Book> books) {
    Stopwatch stopwatch = Stopwatch.createStarted();
    Gson gson = new Gson();
    books.forEach(JSON::toJSONString);
    System.out.println(stopwatch.elapsed(TimeUnit.MILLISECONDS));
  }
}

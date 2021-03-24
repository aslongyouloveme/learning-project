package com.ineverleft.leraning.concurrency;

import com.google.common.collect.Maps;
import sun.misc.Unsafe;

import java.util.concurrent.ConcurrentMap;

/**
 * @Description @ClassName ConCurrentHashMaptest @Author ineverleft
 *
 * @date 2021.02.03 16:01
 */
public class ConCurrentHashMaptest {

  private static final sun.misc.Unsafe u = Unsafe.getUnsafe();

  public static void main(String[] args) {


    ConcurrentMap<String, String> map = Maps.newConcurrentMap();
    map.put("x", "x");
    System.out.println(map.get("x"));
  }
}

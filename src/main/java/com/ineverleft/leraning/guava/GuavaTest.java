package com.ineverleft.leraning.guava;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.springframework.util.Assert;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Description @ClassName GuavaTest @Author ineverleft
 *
 * @date 2021.02.01 10:47
 */
public class GuavaTest {

  private static final ImmutableMap<String, String> immutableMap = ImmutableMap.of("name", "尚飞", "age", "25");

  public static void main(String[] args) {


      immutableMap.entrySet().forEach(System.out::println);
  }
}

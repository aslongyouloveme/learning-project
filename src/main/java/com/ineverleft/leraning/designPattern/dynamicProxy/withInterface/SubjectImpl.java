package com.ineverleft.leraning.designPattern.dynamicProxy.withInterface;

/**
 * @Description @ClassName SubjectImpl @Author ineverleft
 *
 * @date 2021.02.03 14:12
 */
public class SubjectImpl implements Subject {
  @Override
  public String sayHello() {
    return "你好啊";
  }
}

package com.ineverleft.leraning.designPattern.dynamicProxy.withInterface;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description @ClassName ProxySubject @Author ineverleft
 *
 * @date 2021.02.03 14:12
 */
@Slf4j
public class ProxySubject implements InvocationHandler {

  private Object object;

  public ProxySubject(Object object) {
    this.object = object;
  }

  public ProxySubject() {}

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    log.info("我是你的代理类");
    return method.invoke(proxy,args);
  }
}

package com.ineverleft.leraning.designPattern.dynamicProxy.withInterface;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Proxy;

/**
 * @Description @ClassName TestMain @Author ineverleft
 *
 * @date 2021.02.03 14:15
 */
@Slf4j
public class TestMain {

  public static void main(String[] args) {
    Subject subject = new SubjectImpl();
    Subject proxy =
        (Subject)
            Proxy.newProxyInstance(
                subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), new ProxySubject(subject));
    log.info(proxy.sayHello());
  }
}

package com.ineverleft.leraning.designPattern.dynamicProxy.withoutInterface;

import com.ineverleft.leraning.designPattern.dynamicProxy.withInterface.ProxySubject;
import com.ineverleft.leraning.designPattern.dynamicProxy.withInterface.Subject;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.mapping.Subclass;

import java.lang.reflect.Proxy;

/**
 * @Description @ClassName TestMain @Author ineverleft
 *
 * @date 2021.02.03 14:17
 */
@Slf4j
public class TestMain {

  public static void main(String[] args) {
    Subject proxySubject =
        (Subject)
            Proxy.newProxyInstance(Subclass.class.getClassLoader(), new Class[] {Subject.class}, new ProxySubject());

    log.info(proxySubject.sayHello());
  }
}

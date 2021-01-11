package com.ineverleft.leraning.concurrency;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.*;
import java.util.function.Supplier;

/**
 * @Description @ClassName Concurrency @Author ineverleft
 *
 * @date 2021.01.11 17:31
 */
@Slf4j
@Service
public class Concurrency<T> {
  public static int clientTotal = 200;

  public static int threadTotal = 200;

  public void test(Supplier<T> function) throws Exception {
    ExecutorService executorService = Executors.newCachedThreadPool();
    final Semaphore semaphore = new Semaphore(threadTotal);
    final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
    for (int i = 0; i < clientTotal; i++) {
      executorService.execute(
          () -> {
            try {
              semaphore.acquire();
              function.get();
              semaphore.release();
            } catch (Exception e) {
              log.error("exception", e);
            }
            countDownLatch.countDown();
          });
    }
    countDownLatch.await();
    executorService.shutdown();
  }
}

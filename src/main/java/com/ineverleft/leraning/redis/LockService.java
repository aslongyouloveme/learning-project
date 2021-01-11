package com.ineverleft.leraning.redis;

import com.ineverleft.leraning.concurrency.Concurrency;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Description @ClassName LockService @Author ineverleft
 *
 * @date 2021.01.11 17:25
 */
@Service
@Slf4j
public class LockService {
  @Resource RedissonClient redissonClient;
  @Resource Concurrency concurrency;

  public void lock() throws Exception {

    concurrency.test(
        () -> {
          RLock lock = null;
          Long time = System.currentTimeMillis();
          try {
            lock = redissonClient.getLock("lock_key");
            if (lock.tryLock(100, TimeUnit.MILLISECONDS)) {
              log.info("成功拿到锁,耗时{}", System.currentTimeMillis() - time);
              Thread.sleep(500);
            }
          } catch (Exception e) {
            log.error("没有拿到锁,{}", e.getMessage());
          } finally {
            if (lock.isLocked()) {
              lock.unlock();
              log.info("成功放掉锁");
            }
          }
          return null;
        });
  }
}

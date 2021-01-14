package com.ineverleft.leraning.async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @Description @ClassName AsyncLearn @Author ineverleft
 *
 * @date 2021.01.13 15:33
 */
public class AsyncLearn {

  public static void main(String[] args) throws ExecutionException, InterruptedException, Exception {

    CompletableFuture completableFuture =
        CompletableFuture.supplyAsync(
            () -> {
              System.out.println();
              try {
                Thread.sleep(2000);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
              return 0;
            });
    System.out.println(completableFuture.join());
  }
}

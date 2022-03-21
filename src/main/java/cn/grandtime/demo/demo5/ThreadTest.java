package cn.grandtime.demo.demo5;

import cn.grandtime.demo.RRException;

import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest {

    public static void main(String[] args) {

        Map<String, Object> map = new ConcurrentHashMap<>();
        List<String> list = new CopyOnWriteArrayList<>();
        Lock lock = new ReentrantLock();

        ExecutorService threadPool = Executors.newFixedThreadPool(1);
        CountDownLatch countDownLatch = new CountDownLatch(1);

        Future<Integer> future1 = threadPool.submit(() -> {
            try {

                countDownLatch.countDown();
                return 200;
            } catch (Exception e) {
                e.printStackTrace();
                return 500;
            } finally {

            }

        });

        try {
            countDownLatch.await(5L, TimeUnit.SECONDS);
            try {
                if (500 == future1.get()
                ) {
                    throw new RRException("失败");
                }
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
}

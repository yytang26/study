package com.tyy.create;

import java.util.concurrent.*;

/**
 * @author : tyy
 * @date : 2025/2/23 17:59
 * @Version: 1.0
 * @Desc : 创建线程的4中方式
 */
public class MyThread {

    public static void main(String[] args) {
        // extendsThread();
        // implementsRunnable();
        // implementsCallable();
        submitThreadPool();
    }

    public static void extendsThread() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }

    public static void implementsRunnable() {
        Runnable runnable = () -> System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }


    public static void implementsCallable() {
        Callable<String> callable = () -> {
            System.out.println(Thread.currentThread().getName());
            return "sub-thread";
        };
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName());
    }

    public static void submitThreadPool() {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,1, TimeUnit.DAYS,new ArrayBlockingQueue<>(10));

        Callable callable = new Callable<Object>() {
            @Override
            public String call() throws Exception {
                return "hello";
            }
        };
        FutureTask<String> futureTask = new FutureTask<>(callable);
        executor.submit(futureTask);

        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        executor.shutdown();


    }
}

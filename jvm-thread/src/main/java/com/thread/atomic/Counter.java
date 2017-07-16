package com.thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子数字计算
 * The type Counter.
 */
public class Counter {

    private static int count = 0;
    private static AtomicInteger count1 = new AtomicInteger(0);
    private static AtomicInteger count2 = new AtomicInteger(0);
    private volatile static int count3 = 0;

    public static void inc() {

        // 这里延迟1毫秒，使得结果明显
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
        count++;
        count3++;
        count1.getAndIncrement();
        count2.addAndGet(1);
    }

    public static void main(String[] args) throws Exception {
        // 同时启动1000个线程，去进行i++计算，看看实际结果
//		test1();
        test2();

        System.out.println("运行结果:Counter.count=" + Counter.count);
        System.out.println("运行结果:Counter.count3=" + Counter.count3);
        System.out.println("运行结果:Counter.count1=" + Counter.count1);
        System.out.println("运行结果:Counter.count2=" + Counter.count2);
    }

    public static void test1() throws Exception {
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Counter.inc();
                }
            }).start();
        }
        Thread.sleep(1000);
        // 这里每次运行的值都有可能不同,可能为1000

    }

    public static void test2() throws Exception {

        Thread threads[] = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread("test") {
                @Override
                public void run() {
                    Counter.inc();
                }
            };
            threads[i].start();
        }

        for (int i = 0; i < 1000; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

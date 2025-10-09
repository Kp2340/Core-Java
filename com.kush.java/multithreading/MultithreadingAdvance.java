package multithreading;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class MultithreadingAdvance {

    //Thread Creation: Extending Thread
    public static class MyThread extends Thread {
        public void run() {
            System.out.println("MyThread running: " + Thread.currentThread().getName());
        }
    }

    //Thread Creation: Implementing Runnable
    public static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("MyRunnable running: " + Thread.currentThread().getName());
        }
    }

    //Thread Creation: Using Callable
    public static class MyCallable implements Callable<String> {
        public String call() {
            return "MyCallable result from " + Thread.currentThread().getName();
        }
    }

    //Synchronization: Shared Counter
    static class Counter {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    //AtomicInteger Example
    static class AtomicCounter {
        AtomicInteger count = new AtomicInteger(0);

        public void increment() {
            count.incrementAndGet();
        }

        public int getCount() {
            return count.get();
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Thread Creation");
        //Thread by extending Thread class
        MyThread t1 = new MyThread();
        t1.start();
        //Thread by implementing Runnable interface
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
        //Executor and Future with Callable
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<String> future = executor.submit(new MyCallable());
        System.out.println(future.get());

        //Synchronization
        System.out.println("\nSynchronization");
        Counter counter = new Counter();
        Runnable syncTask = () -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        };
        Thread t3 = new Thread(syncTask);
        Thread t4 = new Thread(syncTask);
        t3.start();
        t4.start();

        //Join Method
        t3.join();
        t4.join();
        System.out.println("Synchronized Counter: " + counter.getCount());


        System.out.println("\nAtomicInteger");
        AtomicCounter atomicCounter = new AtomicCounter();
        Runnable atomicTask = () -> {
            for (int i = 0; i < 1000; i++) atomicCounter.increment();
        };
        Thread a1 = new Thread(atomicTask);
        Thread a2 = new Thread(atomicTask);
        a1.start(); a2.start();
        a1.join(); a2.join();
        System.out.println("Atomic Counter: " + atomicCounter.getCount());

        System.out.println("\nExecutor Framework");
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.schedule(() -> System.out.println("Scheduled task executed"), 1, TimeUnit.SECONDS);
        scheduler.shutdown();
    }
}
//Output:
//Thread Creation
//MyThread running: Thread-0
//MyRunnable running: Thread-1
//MyCallable result from pool-1-thread-1
//
//Synchronization
//Synchronized Counter: 2000
//
//AtomicInteger
//Atomic Counter: 2000
//
//Executor Framework
//Scheduled task executed
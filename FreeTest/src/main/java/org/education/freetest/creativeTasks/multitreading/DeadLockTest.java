package org.education.freetest.creativeTasks.multitreading;

public class DeadLockTest {
    final String resourceFirst = "resourceFirst";
    final String resourceSecond = "resourceSecond";

    void doFirst() {
        synchronized (resourceFirst) {

            System.out.println("Thread1.Захватил ресурс 1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (resourceSecond) {
                System.out.println("Thread1. Захватил ресурс 2");
            }
        }

    }

    synchronized void doSecond() {
        synchronized (resourceSecond) {

            System.out.println("Thread2.Захватил ресурс 2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (resourceFirst) {
                System.out.println("Thread2. Захватил ресурс 1");
            }
        }

    }

    public static class Test1Class implements Runnable {
        private DeadLockTest deadLockTest;

        public Test1Class(DeadLockTest deadLockTest) {
            this.deadLockTest = deadLockTest;
        }

        @Override
        public void run() {
            deadLockTest.doFirst();
        }
    }

    public static class Test2Class implements  Runnable {
        private DeadLockTest deadLockTest;

        public Test2Class(DeadLockTest deadLockTest) {
            this.deadLockTest = deadLockTest;
        }

        @Override
        public void run() {
            int value;
            deadLockTest.doSecond();
        }
    }

    public static void main(String[] args) {
        DeadLockTest deadLockTest = new DeadLockTest();
        Thread thread1 = new Thread(new Test1Class(deadLockTest));
        Thread thread2 = new Thread(new Test2Class(deadLockTest));
        thread1.start();
        thread2.start();

    }
}

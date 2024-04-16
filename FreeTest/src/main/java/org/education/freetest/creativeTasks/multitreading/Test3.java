package org.education.freetest.creativeTasks.multitreading;

public class Test3 implements Runnable{
    String x, y;

    public void run() {
        for (int i = 0; i < 10; i++)
            synchronized (this) {
                x = "Hello";
                y = "Java";
                System.out.println(x + " " + y + " ");
            }
    }

    public static void main(String[] args) {
        Test3 run = new Test3();
        Thread obj1 = new Thread(run);
        Thread obj2 = new Thread(run);
        obj1.start();
        obj2.start();
    }
}


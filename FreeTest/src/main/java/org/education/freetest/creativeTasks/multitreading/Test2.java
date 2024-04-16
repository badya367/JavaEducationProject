package org.education.freetest.creativeTasks.multitreading;

public class Test2 extends Thread{

    public static void main(String[] args) {
        Test2 t1 = new Test2();
        t1.start();
        System.out.println("one. ");
        t1.start();
        System.out.println("two. ");
    }
    public void run() {
        System.out.println("Thread");
    }

}

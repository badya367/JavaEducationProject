package org.education.freetest.creativeTasks.multitreading;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("1 ");
        synchronized (args) {
            System.out.println("2 ");
            try{
                args.wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("3 ");
    }
}

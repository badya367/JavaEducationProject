package org.education.freetest.creativeTasks.patterns.proxy.testExample;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("large_photo.jpg");
        System.out.println("Первый вызов метода display():");
        image.display();
        System.out.println("Второй вызов метода display():");
        image.display();
    }
}

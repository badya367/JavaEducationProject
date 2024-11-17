package org.education.freetest.creativeTasks.patterns.proxy.testExample;

public class RealImage implements Image{
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Загрузка изображения с диска: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Отображение изображения: " + filename);
    }
}

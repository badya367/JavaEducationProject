package org.education.freetest.creativeTasks.patterns.visitor.zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Elephant(5000));
        animals.add(new Tiger(60));
        animals.add(new Parrot(true));

        Visitor animalDescription = new AnimalDescriptionVisitor();
        Visitor animalHealthChecker = new AnimalHealthCheckerVisitor();

        System.out.println("Информация о животных");
        for(Animal animal: animals){
            animal.accept(animalDescription);
        }

        System.out.println("Проверка состояния животных");
        for(Animal animal: animals){
            animal.accept(animalHealthChecker);
        }
    }
}

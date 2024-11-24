package org.education.freetest.creativeTasks.patterns.visitor.computerComponents;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Component> components = new ArrayList<>();
        components.add(new Cpu(3.5));
        components.add(new Hdd(2));
        components.add(new Ram(16));

        Visitor informationPrinter = new InformationPrinter();
        PerformanceEvaluator performanceEvaluator = new PerformanceEvaluator();

        System.out.println("===Информация о системе===");
        for(Component component: components){
            component.accept(informationPrinter);
        }
        System.out.println("===Производительность системы===");
        for(Component component: components){
            component.accept(performanceEvaluator);
        }
        System.out.println(performanceEvaluator.getValue());
    }
}

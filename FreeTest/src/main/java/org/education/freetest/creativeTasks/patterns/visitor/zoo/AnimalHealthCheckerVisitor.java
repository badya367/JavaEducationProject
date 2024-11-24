package org.education.freetest.creativeTasks.patterns.visitor.zoo;

public class AnimalHealthCheckerVisitor implements Visitor{
    @Override
    public void visitElephant(Elephant elephant) {
        if(elephant.getWeight() < 3000){
            System.out.println("Слон нуждается в питании");
        }
        else {
            System.out.println("Животное в порядке");
        }
    }

    @Override
    public void visitTiger(Tiger tiger) {
        if(tiger.getSpeed() < 50){
            System.out.println("Тигр может быть ранен");
        }
        else {
            System.out.println("Животное в порядке");
        }
    }

    @Override
    public void visitParrot(Parrot parrot) {
        if(!parrot.isSpeak()) {
            System.out.println("Попугай заболел");
        }
        else {
            System.out.println("Животное в порядке");
        }
    }
}

package org.education.freetest.creativeTasks.patterns.visitor.zoo;

public class AnimalDescriptionVisitor implements Visitor{
    @Override
    public void visitElephant(Elephant elephant) {
        System.out.println("Слон весит " + elephant.getWeight());
    }

    @Override
    public void visitTiger(Tiger tiger) {
        System.out.println("Тигр бегает со скоростью " + tiger.getSpeed());
    }

    @Override
    public void visitParrot(Parrot parrot) {
        String answer;
        if(parrot.isSpeak()){
            answer = "Да";
        } else {answer = "Нет";}

        System.out.println("Попугай может говорить: " + answer );
    }
}

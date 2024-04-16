package org.education.freetest.creativeTasks.annotations;

public class Main {
    public static void main(String[] args) {
        Class<SomeClass> example = SomeClass.class;
        if(example.isAnnotationPresent(CreateObjChecker.class)){
            SomeClass someClass = new SomeClass();
            System.out.println(someClass);
        }
        else{
            System.out.println("annotation not found");

        }
    }
}

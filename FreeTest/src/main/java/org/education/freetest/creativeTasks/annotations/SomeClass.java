package org.education.freetest.creativeTasks.annotations;
@CreateObjChecker(value = "someName")
public class SomeClass {
    String name;
    public SomeClass(){}
    public SomeClass(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "SomeClass{" +
                "name='" + name + '\'' +
                '}';
    }
}

package org.education.freetest.creativeTasks.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class SomeClass<T extends Number> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    public T createValue(Class<T> tClass) throws InstantiationException, IllegalAccessException {
        return tClass.newInstance();
    }

}
public class TestGenerics {

    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Hello", "World");
//        List<Integer> data = new ArrayList(list);
//        Integer intNumber = data.get(0);
//        System.out.println(data);

        

    }


}

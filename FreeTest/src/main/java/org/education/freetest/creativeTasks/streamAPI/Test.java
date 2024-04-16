package org.education.freetest.creativeTasks.streamAPI;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        //simpleFilter();
        //convertingStringToUpperCase();
        //groupByLength();
        //maxElement();
        joinList();
        //Arrays.stream(generatorInt(10)).forEach(System.out::println);
        //generatorNumb(10).forEach(System.out::println);
    }

    public static void simpleFilter(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(array)
                .filter(e -> e%2 != 0)
                .forEach(System.out::println);
    }

    public static void convertingStringToUpperCase(){
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"apple", "banana", "cherry", "date");
        list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void groupByLength() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"java", "python", "kotlin", "scala", "ruby");
        Map<Integer, List<String>> group = list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(group);

        List<String> words = Arrays.asList("java", "python", "kotlin", "scala", "ruby");

        words.stream()
                .collect(Collectors.groupingBy(String::length))
                .forEach((length, wordList) -> System.out.println(length + ": " + wordList));
    }

    public static void maxElement() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,17, 42, 8, 56, 23, 91);
        int max = list.stream().max(Integer::compareTo).get();
        System.out.println(max);
    }

    public static void joinList() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list1, "red", "blue", "green");
        Collections.addAll(list2, "yellow", "orange", "purple");
        List<String> newList = Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
        System.out.println(newList.stream().collect(Collectors.joining(",")));
        System.out.println(newList);
    }

    public static int[] generatorInt(int maxSize) {
        return new Random()
                .ints()
                .limit(maxSize)
                .toArray();

    }

    public static List<MyNumbers> generatorNumb(int maxSize){
        IntStream stream = Arrays.stream(generatorInt(maxSize));
        Stream<Integer> boxed = stream.boxed();
        List<MyNumbers> collect = boxed.map(e -> new MyNumbers(e, UUID.randomUUID().toString())).collect(Collectors.toList());
        List<MyNumbers> collect2 = Arrays.stream(generatorInt(maxSize)).boxed().map(e -> new MyNumbers(e, UUID.randomUUID().toString())).collect(Collectors.toList());
        List<List<MyNumbers>> myNum = new ArrayList<>();
        myNum.add(collect);
        myNum.add(collect2);
        List<MyNumbers> collect3 = myNum.stream().flatMap(v -> v.stream()).collect(Collectors.toList());
        return collect3;
    }
    static class MyNumbers{
        private int value;
        private final String UID;

        public MyNumbers(int value, String UID) {
            this.value = value;
            this.UID = UID;
        }

        public String getUID() {
            return UID;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "MyNumbers{" +
                    "value=" + value +
                    ", UID='" + UID + '\'' +
                    '}';
        }
    }
}

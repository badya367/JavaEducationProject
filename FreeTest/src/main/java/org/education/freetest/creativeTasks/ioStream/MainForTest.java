package org.education.freetest.creativeTasks.ioStream;


import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainForTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args)  {
        Person person1 = new Person(true,
                "Alex",
                "Pervov",
                30);
        Person person2 = new Person(true,
                "Bob",
                "Vtorov",
                27);
        Person person3 = new Person(true,
                "Steve",
                "Tretev",
                44);
        ArrayList<Person> personsArrayList = new ArrayList<>();
        Collections.addAll(personsArrayList,
                person1,
                person2,
                person3);
        try(FileOutputStream file = new FileOutputStream("persons.txt");
            ObjectOutputStream out = new ObjectOutputStream(file)) {
            out.writeObject(personsArrayList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileInputStream file = new FileInputStream("persons.txt");
        ObjectInputStream out = new ObjectInputStream(file)){
            ArrayList<Person> readedPersonListObj = (ArrayList<Person>) out.readObject();
            System.out.println(readedPersonListObj);


        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-------------------");
        try (FileWriter file = new FileWriter("personsForView.txt")){
            file.write(person1 + "\n");
            file.write(person2 + "\n");
            file.write(person3 + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            List<String> allPersons = Files.readAllLines(Paths.get("personsForView.txt"));
            allPersons.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}

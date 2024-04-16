package org.education.freetest.creativeTasks.ioStream;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;
@Getter
@Setter
@ToString
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int id = 1;
    private int personId = id;
    private boolean isMale;
    private String firstName;
    private String lastName;
    private int age;

    private int numberPhone;
    private transient int numberCard;

    public Person(boolean isMale, String firstName, String lastName, int age, int numberPhone, int numberCard) {
        this.personId = Person.id++;
        this.isMale = isMale;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.numberPhone = numberPhone;
        this.numberCard = numberCard;
    }

    public Person(boolean isMale, String firstName, String lastName, int age) {
        this.personId = Person.id++;
        this.isMale = isMale;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(personId, person.personId) && Objects.equals(isMale, person.isMale) &&
                Objects.equals(age, person.age) && Objects.equals(numberPhone,person.numberPhone) &&
                Objects.equals(numberCard,person.numberCard) && Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, isMale, firstName, lastName, age, numberPhone, numberCard);
    }
}

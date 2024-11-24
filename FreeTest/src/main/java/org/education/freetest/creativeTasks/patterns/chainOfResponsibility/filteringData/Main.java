package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.filteringData;

public class Main {
    public static void main(String[] args) {
        Filter lengthFilter = new LengthFilter();
        Filter alphabetFilter = new AlphabetFilter();
        Filter capitalLetterFilter = new CapitalLetterFilter();

        lengthFilter.setFilter(alphabetFilter);
        alphabetFilter.setFilter(capitalLetterFilter);

        lengthFilter.process("Hello");
        try {
            lengthFilter.process("hello");
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        try {
            lengthFilter.process("12345");
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        try {
            lengthFilter.process("Hi");
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }

    }
}

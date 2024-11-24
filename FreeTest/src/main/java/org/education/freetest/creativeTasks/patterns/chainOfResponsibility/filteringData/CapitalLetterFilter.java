package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.filteringData;

public class CapitalLetterFilter extends Filter{
    @Override
    public void process(String input) {
        if(!Character.isUpperCase(input.charAt(0))) {
            throw new IllegalArgumentException("Cлово: " + input +
                    " не прошёл фильтр CapitalLetterFilter. Строка не начинается с заглавной буквы");
        } else if (filter != null) {
            filter.process(input);
        } else {
            System.out.println(input + " проходит фильтры");
        }
    }
}

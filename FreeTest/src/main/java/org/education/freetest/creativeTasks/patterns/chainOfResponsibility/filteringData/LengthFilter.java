package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.filteringData;

public class LengthFilter extends Filter{
    @Override
    public void process(String input) {
        if(input.length() < 5) {
            throw new IllegalArgumentException("Cлово: " + input +
                    " не прошёл фильтр LengthFilter. Строка меньше 5 символов");
        } else if (filter != null) {
            filter.process(input);
        } else {
            throw new RuntimeException("Неизвестная ошибка при фильтрации");
        }
    }
}

package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.filteringData;


public class AlphabetFilter extends Filter{
    @Override
    public void process(String input) {

        if(hasDigits(input)) {
            throw new IllegalArgumentException("Cлово: " + input +
                    " не прошёл фильтр AlphabetFilter. В слове есть цифры");
        } else if (filter != null) {
            filter.process(input);
        } else {
            throw new RuntimeException("Неизвестная ошибка при фильтрации");
        }
    }

    private boolean hasDigits(String word){
        boolean hasDigits = false;
        for(int i = 0; i < word.length() && !hasDigits; i++) {
            if(Character.isDigit(word.charAt(i))) {
                hasDigits = true;
            }
        }
        return hasDigits;
    }
}

package org.education.freetest.creativeTasks.wordCompositionAlgrtm;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class algorithmForCompositionWord {
    public static void startAlgrtm(String userString, ArrayList<String> slovar) {

        List<Character> listOfStringCharacters = createCharacterListFromSting(userString);

        for (String slovarString : slovar) { //Берём каждое слово из словаря
              checkSlovar(userString,slovarString);
        }
    }


    private static List<Character> createCharacterListFromSting(String string){
        List<Character> listOfStringCharacters = new ArrayList<>(); //Создаю список для хранения символов строки
        for(char c: string.toCharArray()){
            listOfStringCharacters.add(c); //Добавляю каждый символ в список
        }

        return listOfStringCharacters;
    }
    private static Map<Character, Integer> calculateCharacterCount(List<Character> listOfStringCharacters){
        Map<Character,Integer> resultMap = new HashMap<>();
        while (!listOfStringCharacters.isEmpty()) {
            int countChar = 0;
            Iterator<Character> iter = listOfStringCharacters.iterator();
            char current_ch = listOfStringCharacters.get(0);
            countChar++;

            if(iter.hasNext()){
                iter.next();
                iter.remove();
                while (iter.hasNext()){
                    if(iter.next() == current_ch){
                        countChar++;
                        iter.remove();
                    }
                }
            }
            resultMap.put(current_ch, countChar);
            //System.out.println("Символ '" + current_ch + "' встретился " + countChar + " раз!");
        }
        return resultMap;
    }

    private static void checkSlovar(String userString,String slovarString){
        Map<Character, Integer> userStringMap = calculateCharacterCount(createCharacterListFromSting(userString)); //Считаем количество символов в юзер стринг
        Map<Character, Integer> slovarStringMap = calculateCharacterCount(createCharacterListFromSting(slovarString)); //Считаем количество символов в стринге из словаря

        int sizeSlovarString = slovarString.length();
        int sizeCheck = 0;

        for (Character chSlovarString : slovarStringMap.keySet()){
            Integer counterChSlovarString = slovarStringMap.get(chSlovarString);

            for (Character chUserString: userStringMap.keySet()){
                Integer counterChUserString = userStringMap.get(chUserString);

                if (chSlovarString.equals(chUserString)) {

                    if (counterChUserString >= counterChSlovarString) {
                        sizeCheck+=counterChSlovarString;
                    }
                }
            }
        }

        if(sizeCheck == sizeSlovarString) {
            System.out.println("Слово " + slovarString + " можно составить");
        }
        else {
            //System.out.println("Слово " + slovarString + " нельзя составить");
        }
    }
}

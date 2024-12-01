package org.education.freetest.creativeTasks.patterns.decorator.chatFilter;

import java.util.ArrayList;
import java.util.List;

public class CensorshipDecorator extends ChatMessageDecorator{
    private List<String> stopWords = new ArrayList<>();
    public CensorshipDecorator(ChatMessage chatMessage) {
        super(chatMessage);
        addStopWord("блять");
        addStopWord("сука");
    }

    @Override
    public String sendMessage(String message) {
        return replaceBadWord(super.sendMessage(message));
    }

    private void addStopWord(String word) {
        if(!stopWords.contains(word)){
            stopWords.add(word);
        }
    }

    private String replaceBadWord(String message){
        for(String badWord: stopWords){
            if(message.contains(badWord)){
                System.out.println("Есть плохое слово");
                message = message.replace(badWord, "***");
            }
        }
        return message;
    }
}

package org.education.freetest.creativeTasks.patterns.decorator.chatFilter;

public class Chat implements ChatMessage{
    @Override
    public String sendMessage(String message) {
        return message;
    }

}

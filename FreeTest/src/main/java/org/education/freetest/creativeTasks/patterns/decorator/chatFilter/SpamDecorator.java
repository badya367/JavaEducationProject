package org.education.freetest.creativeTasks.patterns.decorator.chatFilter;

import java.util.EmptyStackException;
import java.util.Stack;

public class SpamDecorator extends ChatMessageDecorator{
    private Stack<String> historyMessage = new Stack<>();
    public SpamDecorator(ChatMessage chatMessage) {
        super(chatMessage);
    }

    @Override
    public String sendMessage(String message) {
        return applySpamFilter(super.sendMessage(message));
    }

    private void addMessageInHistory(String message){
        historyMessage.push(message);
    }
    private String applySpamFilter(String message){

        if(!historyMessage.isEmpty() && message.equals(historyMessage.peek())){
            return "Spam filter activated";
        }
        addMessageInHistory(super.sendMessage(message));
        return message;
    }
}

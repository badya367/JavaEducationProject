package org.education.freetest.creativeTasks.patterns.decorator.chatFilter;

public abstract class ChatMessageDecorator implements ChatMessage {
    protected ChatMessage chatMessage;

    public ChatMessageDecorator(ChatMessage chatMessage) {
        this.chatMessage = chatMessage;
    }

    @Override
    public String sendMessage(String message) {
        return chatMessage.sendMessage(message);
    }
}

package org.education.freetest.creativeTasks.patterns.decorator.chatFilter;

public class FontDecorator extends ChatMessageDecorator{
    public FontDecorator(ChatMessage chatMessage) {
        super(chatMessage);
    }

    @Override
    public String sendMessage(String message) {
        return "[BIG] " + super.sendMessage(message) + " [END]";
    }
}

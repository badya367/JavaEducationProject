package org.education.freetest.creativeTasks.patterns.decorator.chatFilter;

public class Main {
    public static void main(String[] args) {
        ChatMessage chat = new CensorshipDecorator(new FontDecorator(new Chat()));
        System.out.println(chat.sendMessage("Привет блять"));

        ChatMessage chat2 = new SpamDecorator(new CensorshipDecorator(new FontDecorator(new Chat())));
        System.out.println(chat2.sendMessage("Hello"));
        System.out.println(chat2.sendMessage("Hello"));


    }
}

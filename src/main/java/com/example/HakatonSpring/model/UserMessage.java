package com.example.HakatonSpring.model;

/**
 * @author Jack on 25.10.2020
 * @project HackatonSpring
 */
public class UserMessage {
    private MessageType type;
    private String content;
    private String sender;

    public enum MessageType {
        PLAY,
        JOIN,
        LEAVE,
        WAIT,
        ONLINE,
        NOTICE,
        BEGIN,
        END,
        GESTURE,
        CONTINUE
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
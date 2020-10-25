package com.example.HakatonSpring.model;

/**
 * @author Jack on 25.10.2020
 * @project HackatonSpring
 */
public class UserStatus {
    private String sessionId;
    private String name;
    private String status;

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

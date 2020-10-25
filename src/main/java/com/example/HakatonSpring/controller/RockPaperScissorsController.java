package com.example.HakatonSpring.controller;

import com.example.HakatonSpring.model.*;
import com.example.HakatonSpring.games.RockPaperScissorsService;
import com.example.HakatonSpring.model.User2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Jack on 25.10.2020
 * @project HackatonSpring
 */

@Slf4j
@Controller
public class RockPaperScissorsController {

    @Autowired
    RockPaperScissorsService webSocketService;

    public static boolean refereeFlag = false;

    public final static Queue<User2> userQueue = new LinkedBlockingQueue<>();
    public final static List<User2> nowUser = new ArrayList<>();
    public final static List<String> onlineUserList = new ArrayList<>();

    @MessageMapping("/play.sendGesture")
//    @SendTo("/topic/public")
    public UserMessage sendMessage(@Payload UserMessage userMessage,
                                   SimpMessageHeaderAccessor headerAccessor) {
        for (int i = 0; i < nowUser.size(); i++) {
            User2 user = nowUser.get(i);
            String sessionId = nowUser.get(i)
                                      .getSessionId();
            if (headerAccessor.getSessionId() == sessionId) {
                user.setGesture(userMessage.getContent());
            }
        }
        return userMessage;
    }

    @MessageMapping("/play.addUser")
    @SendTo("/topic/public")
//    @SendToUser("/queue/msg")
    public UserMessage addUser(@Payload UserMessage userMessage,
                               SimpMessageHeaderAccessor headerAccessor) {
        String name = userMessage.getSender();
        // Add name in web socket session
        headerAccessor.getSessionAttributes()
                      .put("name", userMessage.getSender());
        String sessionId = headerAccessor.getSessionId();
        User2 user = new User2();
        user.setSessionId(sessionId);
        user.setName(name);
        user.setStatus("first");
        userQueue.add(user);
        onlineUserList.add(sessionId);
        return userMessage;
    }
}

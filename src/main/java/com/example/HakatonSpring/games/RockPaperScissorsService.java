package com.example.HakatonSpring.games;

import com.example.HakatonSpring.model.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageType;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Jack on 25.10.2020
 * @project HackatonSpring
 */

    @Service
    public class RockPaperScissorsService {

        @Autowired
        private SimpMessagingTemplate simpMessagingTemplate;

        public void sendMsg(UserMessage msg) {
            simpMessagingTemplate.convertAndSend("/topic/public", msg);
        }

        public void sendToClient(String sessionId, UserMessage msg) {
            simpMessagingTemplate.convertAndSendToUser(sessionId,"/queue/msg", msg,
                    createHeaders(sessionId));
        }

        private MessageHeaders createHeaders(String sessionId) {
            SimpMessageHeaderAccessor headerAccessor = SimpMessageHeaderAccessor.create(SimpMessageType.MESSAGE);
            headerAccessor.setSessionId(sessionId);
            headerAccessor.setLeaveMutable(true);
            return headerAccessor.getMessageHeaders();
        }
    }

package com.example.HakatonSpring.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @author Jack on 25.10.2020
 * @project HackatonSpring
 */

@Configuration
@EnableWebSocketMessageBroker
public class RockPaperScissorsWebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws").
//                setHandshakeHandler(new DefaultHandshakeHandler() {
//
//            public boolean beforeHandshake(
//                    ServerHttpRequest request,
//                    ServerHttpResponse response,
//                    WebSocketHandler wsHandler,
//                    Map attributes) throws Exception {
//
//                if (request instanceof ServletServerHttpRequest) {
//                    ServletServerHttpRequest servletRequest
//                            = (ServletServerHttpRequest) request;
//                    HttpSession session = servletRequest
//                            .getServletRequest().getSession();
//                    attributes.put("sessionId", session.getId());
//                }
//                return true;
//            }}).
        withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic", "/queue/");
        registry.setApplicationDestinationPrefixes("/app");
        registry.setUserDestinationPrefix("/user");
    }

}
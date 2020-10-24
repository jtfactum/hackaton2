package com.example.HakatonSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@RestController
public class HakatonSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HakatonSpringApplication.class, args);
	}
//	@RequestMapping("/resource")
//	public Map<String,Object> home() {
//		Map<String,Object> com.example.HakatonSpring.model = new HashMap<String,Object>();
//		com.example.HakatonSpring.model.put("id", UUID.randomUUID().toString());
//		com.example.HakatonSpring.model.put("content", "Hello World");
//		return com.example.HakatonSpring.model;
//	}
}

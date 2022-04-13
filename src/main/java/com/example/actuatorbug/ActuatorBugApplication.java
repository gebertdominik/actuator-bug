package com.example.actuatorbug;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ActuatorBugApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorBugApplication.class, args);
	}

	@Bean
	public CommandLineRunner start(EventConsumer eventConsumer) {
		return (args) -> eventConsumer.consume();
	}

}

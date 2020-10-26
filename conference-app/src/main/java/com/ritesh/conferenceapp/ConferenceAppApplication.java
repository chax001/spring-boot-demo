package com.ritesh.conferenceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConferenceAppApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/conferenceapp");
		SpringApplication.run(ConferenceAppApplication.class, args);
	}

}

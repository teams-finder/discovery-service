package com.teamsfinder.discovery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.event.EventListener;

import java.time.ZonedDateTime;

@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void logStartTime() {
		log.info("Eureka discovery service started at: {}", ZonedDateTime.now());
	}

}

package com.example.firstservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author : 최종철
 */
//first-service FirstServiceController
@RestController
@RequestMapping("/first-service")
@Slf4j
public class FirstServiceController {

	@Value("${server.port}")
	private String port;

	@GetMapping("/check")
	public String check() {
		log.info("[MEMBER] ASSU name/{nick} logging...nick is {}.");
		return String.format("First Service on PORT %s", port);
	}
}

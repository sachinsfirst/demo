package io.quickstarter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	Logger logger = LoggerFactory.getLogger(TestController.class);

	@RequestMapping("/test")
	public String test() {
		String msg = "Application is Up!";
		logger.info("Inside TestController.test() :: {}", msg);
		return msg;
	}

}

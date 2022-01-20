package com.tistory.ospace.test.controller;

//import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tistory.ospace.test.annotation.TimeLog;

@Controller
@RequestMapping("/")
public class TestController {
	private static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	
	@ExceptionHandler({Exception.class})
	public void handleException(HttpServletRequest request, Exception ex) {
		logger.error("{}[{}]", ex.getClass().getName(), ex.getMessage(), ex);
	}
	
	@TimeLog
	@PostMapping("/hello")
	public String foo() {
		logger.info("foo");
		return "redirect:/";
	}
}	

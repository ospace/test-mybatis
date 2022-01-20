package com.tistory.ospace.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.tistory.ospace.test.annotation.EnableTimeLog;

@EnableTimeLog
@SpringBootApplication
@EnableAutoConfiguration
@EnableTransactionManagement
public class TestApplication {
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(TestApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter("app.pid"));
		springApplication.run(args);
	}
}

package com.tistory.ospace.test.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {
	
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/static/**")
//			.addResourceLocations("classpath:/static/").setCachePeriod(31536000);
//		registry.addResourceHandler("/favicon.ico")
//			.addResourceLocations("classpath:/static/favicon.ico").setCachePeriod(31536000);
//	}

}

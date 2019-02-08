package org.formation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaClient
public class Application  {

	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
//		FilterChainProxy filterChain = (FilterChainProxy) ctx.getBean("springSecurityFilterChain");
//		for (SecurityFilterChain chain : filterChain.getFilterChains()) {
//			System.out.println(chain);
//		}
	}
	


}

package com.pocs.ananta.spring.cloud.springcloudzuulgatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@Configuration
public class SpringCloudZuulGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulGatewayServiceApplication.class, args);
	}
	
	@Bean
	public AddRequestHeaderFilter addRequestHeaderFilter(){
		
		return new AddRequestHeaderFilter();
	}
}

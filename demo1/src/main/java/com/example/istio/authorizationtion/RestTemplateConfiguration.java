package com.example.istio.authorizationtion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

	@Lazy
	@Bean(name = "JAEGER")
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.additionalInterceptors(JaegerInterceptor.propagate()).build();
	}

	@Lazy
	@Primary
	public RestTemplateBuilder defaultRestTemplateBuilder (RestTemplateCustomizer... restTemplateCustomizers) {
		return new RestTemplateBuilder(restTemplateCustomizers);
	}

}

package com.rule14.courtq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan(basePackages= {"com.rule14.courtq"})
@EnableMongoAuditing
@EnableReactiveMongoRepositories
@SpringBootApplication
@EnableSwagger2
public class DemoApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

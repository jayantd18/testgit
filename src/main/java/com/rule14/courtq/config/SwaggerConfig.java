package com.rule14.courtq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
	return new Docket(DocumentationType.SWAGGER_2).select()
		.apis(RequestHandlerSelectors.basePackage("com.rule14.courtq.controller")).build()
		//.apis(RequestHandlerSelectors.any())
		//.paths(PathSelectors.any()).build()
		.apiInfo(apiInfo());
    }
    
    private ApiInfo apiInfo() {
    	
    	return new ApiInfoBuilder()
    			.title("CourtQ API")
    			.version("2.0.0")
    			.contact(new Contact("Jayant Dhargawe", "/", "jayant.dhargawe@rule14.com"))
    			.build();
    	
    }
    
   
    
}

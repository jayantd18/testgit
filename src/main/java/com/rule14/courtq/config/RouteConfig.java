package com.rule14.courtq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;


@Configuration
public class RouteConfig {
	
	@Bean
	RouterFunction<?> handleRoutes(RouterHanlder routerHanlder ){
		return RouterFunctions.route(RequestPredicates.GET("/rest/all/cases"), routerHanlder::getAll);
		
	}
	

}

package com.rule14.courtq.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.rule14.courtq.domain.CourtCase;
import com.rule14.courtq.service.CourtCaseService;

import reactor.core.publisher.Mono;

@Component
public class RouterHanlder {
	@Autowired
	private CourtCaseService caseService;
	
	
	public Mono<ServerResponse> getAll(ServerRequest request) {
		
		return ServerResponse.ok().body(caseService.findAll(), CourtCase.class);
	}

}

package com.rule14.courtq.service;

import com.rule14.courtq.domain.CustomSequence;

import reactor.core.publisher.Mono;

public interface CustomSequenceService {
	
	public Mono<CustomSequence> generateSeq(String id);

}

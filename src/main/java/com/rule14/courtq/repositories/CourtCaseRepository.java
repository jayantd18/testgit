package com.rule14.courtq.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.rule14.courtq.domain.CourtCase;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface CourtCaseRepository extends ReactiveMongoRepository<CourtCase, String> {

	Mono<CourtCase> findByTitle(String title);
	
	Mono<CourtCase> findByIdAndDeleteIsFalse(String id);
	
	Flux<CourtCase> findByTitleAndDeleteIsFalse(String title);
}

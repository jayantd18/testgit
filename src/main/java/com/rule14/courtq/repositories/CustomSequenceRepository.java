package com.rule14.courtq.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.rule14.courtq.domain.CustomSequence;

@Repository
public interface CustomSequenceRepository extends ReactiveMongoRepository<CustomSequence, String> {
	

}

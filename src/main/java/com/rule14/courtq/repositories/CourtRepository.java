package com.rule14.courtq.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.rule14.courtq.domain.Court;

@Repository
public interface CourtRepository extends ReactiveMongoRepository<Court, String>{

}

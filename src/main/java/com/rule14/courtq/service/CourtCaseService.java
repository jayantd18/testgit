package com.rule14.courtq.service;

import java.util.Set;

import com.rule14.courtq.domain.CourtCase;
import com.rule14.courtq.domain.DocketReport;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface  CourtCaseService {
	 	
		public Mono<CourtCase> createCase(CourtCase courtCase);

		public Mono<CourtCase> updateCase(CourtCase courtCase, String id);

		public Flux<CourtCase> findAll();

		public Mono<CourtCase> findOne(String id);

		public Flux<CourtCase> findByTitle(String title);
	    
	    public Mono<Boolean> delete(String id);
	    
	    public Mono<DocketReport> saveReport(DocketReport report);
	    
	    public Flux<DocketReport> saveReports(Set<DocketReport> report);
	    
	    
}

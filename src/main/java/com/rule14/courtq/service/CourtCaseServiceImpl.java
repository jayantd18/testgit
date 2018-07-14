package com.rule14.courtq.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rule14.courtq.domain.Court;
import com.rule14.courtq.domain.CourtCase;
import com.rule14.courtq.domain.DocketReport;
import com.rule14.courtq.repositories.CourtCaseRepository;
import com.rule14.courtq.repositories.CourtRepository;
import com.rule14.courtq.repositories.DocketReportRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CourtCaseServiceImpl implements CourtCaseService {
	
	@Autowired
	private CourtCaseRepository  courtCaseRepository;
	
	@Autowired
	private CourtRepository courtRepository;
	
	@Autowired
	private DocketReportRepository docketReportRepository;
	
	@Override
	public Mono<DocketReport> saveReport(DocketReport report) {
		return docketReportRepository.insert(report);
	}
	
	@Override
	public Flux<DocketReport> saveReports(Set<DocketReport> reports) {
		return docketReportRepository.insert(reports);
	}

	@Override
	public Mono<CourtCase> createCase(CourtCase courtCase) {
		
		Mono<Court> court =	courtRepository.insert(courtCase.getCourt());
		courtCase.setCourt(court.block());
		return courtCaseRepository.insert(courtCase);
		
	}

	@Override
	public Mono<CourtCase> updateCase(CourtCase courtCase, String id) {
		return findOne(id).doOnSuccess(findCase ->{
			
			courtCaseRepository.save(findCase).subscribe();
		});
	
	}
	 @Override
	 public Mono<Boolean> delete(String id){
		 return findOne(id).doOnSuccess(blog -> {
	            blog.setDelete(Boolean.TRUE);
			 courtCaseRepository.save(blog).subscribe();
		 }).flatMap(blog -> Mono.just(Boolean.TRUE));
	 }

	@Override
	public Flux<CourtCase> findAll() {
		return courtCaseRepository.findAll();
	}

	@Override
	public Mono<CourtCase> findOne(String id) {
		
		List<DocketReport> reports = docketReportRepository.findByCaseIdOrderByCreatedDateDesc(id).collectList().block();
		return courtCaseRepository.findByIdAndDeleteIsFalse(id).doOnSuccess(obj->{
			obj.setReports(reports);
			System.out.println("Test...............");
			 
		}).switchIfEmpty(Mono.error(new Exception("No CourtCase found with Id: " + id)));
	}

	@Override
	public Flux<CourtCase> findByTitle(String title) {
		 return courtCaseRepository.findByTitleAndDeleteIsFalse(title).
				 switchIfEmpty(Mono.error(new Exception("No CourtCase found with title Containing : " + title)));
	}

}

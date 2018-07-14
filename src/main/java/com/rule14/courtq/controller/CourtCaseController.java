package com.rule14.courtq.controller;

import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rule14.courtq.domain.CourtCase;
import com.rule14.courtq.domain.CourtCaseEvent;
import com.rule14.courtq.domain.CustomSequence;
import com.rule14.courtq.domain.DocketReport;
import com.rule14.courtq.service.CourtCaseService;
import com.rule14.courtq.service.CustomSequenceService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;


@RestController
@RequestMapping("/case")
@Api(value = "case")
public class CourtCaseController {
	@Autowired
    private CourtCaseService caseService;
	
	@Autowired
	private CustomSequenceService customSequenceService;

	@GetMapping("/sequencefor/{id}")
    @ApiOperation(value = "Get  Case By ID", notes = "Get  Case By ID", response = CustomSequence.class)
    public Mono<CustomSequence> generate(@PathVariable("id") String id) {
		Mono<CustomSequence> seq = customSequenceService.generateSeq(id);
		if(seq.block() == null) {
			System.out.println("Object Null");
		}
		return seq;
    }
	
    @GetMapping
    @ApiOperation(value = "Get  Cases", notes = "Get  Cases", response = Flux.class)
    public Flux<CourtCase> findAll() {
        //log.debug("findAll Blog");
        return caseService.findAll();
    }

    @GetMapping("/find")
    @ApiOperation(value = "Get  Case By Title", notes = "Get  Case By Title", response = CourtCase.class)
    
    public Flux<CourtCase> findByTitle(@ApiParam(name = "title",  value = "title", required = true) @RequestParam String title) {
       // log.debug("findByTitle Blog with title : {}", title);
        return caseService.findByTitle(title);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get  Case By ID", notes = "Get  Case By ID", response = CourtCase.class)
    public Mono<CourtCase> findOne(@PathVariable String id) {
        //log.debug("findOne Blog with id : {}", id);
        return caseService.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create  Case ", notes = "Create  Case ", response = Mono.class)
    public Mono<CourtCase> create(@ApiParam(name = "courtCase",  value = "courtCase", required = true) @RequestBody CourtCase courtCase) {
        //log.debug("create Blog with blog : {}", blog);
        return caseService.createCase(courtCase);
    }
    
    @PostMapping(value="/report")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create  Case Report ", notes = "Create  Case Report", response = Mono.class)
    public Mono<DocketReport> createReport(@ApiParam(name = "docketReport",  value = "docketReport", required = true) @RequestBody DocketReport docketReport) {
       
        return caseService.saveReport(docketReport);
    }

    @DeleteMapping("/{id}")
    public Mono<Boolean> delete(@PathVariable String id) {
        //log.debug("delete Blog with id : {}", id);
        return caseService.delete(id);
    }

    @PutMapping("/{id}")
    public Mono<CourtCase> updateCase(@RequestBody CourtCase blog, @PathVariable String id) {
        //log.debug("update Case with id : {} and case : {}", id, blog);
        return caseService.updateCase(blog, id);
    }
    
    @GetMapping(value ="/{id}/events", produces= MediaType.TEXT_EVENT_STREAM_VALUE)
    @ApiOperation(value = "Get  Case By ID", notes = "Get  Case By ID", response = CourtCaseEvent.class)
    public Flux<CourtCaseEvent> findEvents(@PathVariable("id") String id) {
        //log.debug("findOne Blog with id : {}", id);
        return caseService.findOne(id)
        		.flatMapMany(courtCase -> {
        			
        			Flux<Long> interval = Flux.interval(Duration.ofSeconds(2));
        			
        			Flux<CourtCaseEvent>   courtCaseEventFlux = Flux.fromStream(
        						Stream.generate(()-> new CourtCaseEvent(courtCase, new Date()))
        					);
        			
        			 /*Flux.zip(interval, courtCaseEventFlux)
        					.map(objs -> { 
        						return objs.getT2();
        					});*/
        			return Flux.zip(interval, courtCaseEventFlux)
					.map(Tuple2::getT2);
        					
        	});
        		
        		
    }

}

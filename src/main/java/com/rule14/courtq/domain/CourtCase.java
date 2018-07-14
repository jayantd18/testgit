package com.rule14.courtq.domain;

import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.EqualsAndHashCode;
import reactor.core.publisher.Flux;

@Data
@EqualsAndHashCode(callSuper=false)
@Document(collection="docket")
public class CourtCase extends BaseEntity{
	
	@Field
	private String title;
	
	@Field
	private String docketNum;
	
	@DBRef
	private Court court;
	
	@Transient
	private List<DocketReport> reports;
	
	@Field
	Integer reportCounts =0;
	
}

package com.rule14.courtq.domain;

import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection="docketreport")
public class DocketReport extends BaseEntity{

	@TextIndexed
	private String contents;
	
	@Field
	private String link;
	
	@Field
	private String caseId;
	
}

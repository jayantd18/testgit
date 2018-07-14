package com.rule14.courtq.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
@Document(collection="court")
public class Court extends BaseEntity{
	
	@Field
	private String code;
	@Field
	private String name;

}

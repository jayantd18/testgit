package com.rule14.courtq.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.rule14.courtq.config.GlobalConstant;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Document(collection=GlobalConstant.CUSTOM_SEQUENCE)
public class CustomSequence {
	
	@Id
	private String id;
	
	@Field
	private Long seq;
	
	
}

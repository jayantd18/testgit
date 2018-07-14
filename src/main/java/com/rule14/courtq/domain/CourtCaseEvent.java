package com.rule14.courtq.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourtCaseEvent {
	
	private CourtCase courtCase;
	private Date createdOn;
	

}

package com.rule14.courtq.domain.schema;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data

@EqualsAndHashCode(callSuper=false)

public class DocketParties {
	
	private String type;
	
	private String name;
	
	private List<DocketCounsel> counsel;
	

}

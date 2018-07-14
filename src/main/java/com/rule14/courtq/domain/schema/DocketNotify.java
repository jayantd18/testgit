package com.rule14.courtq.domain.schema;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class DocketNotify {
	
	private String docket;
	private String court;
	private String link;
	private DocketInfo info;
	private List<DocketParties> parties;
	private List<DocketReport> docket_report;

	

}

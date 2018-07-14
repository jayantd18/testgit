package com.rule14.courtq.domain.schema;

import java.util.List;

import lombok.Data;

@Data
public class DocketReport {

	private String contents;
	private String date;
	private String entry_date;
	private String number;
	private String link;
	private byte[] document;
	private Integer docketReportId;
	private List<Exhibits> exhibits;
	private Integer exhibitCounts;

	
}

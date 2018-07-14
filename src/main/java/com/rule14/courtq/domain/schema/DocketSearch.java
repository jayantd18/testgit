package com.rule14.courtq.domain.schema;

import java.util.List;

public class DocketSearch {

	private DocketInfo info;

	private List<DocketParties> parties;

	private List<DocketReport> docket_report;

	private boolean success;

	private String error;

	public DocketInfo getInfo() {
		return info;
	}

	public void setInfo(DocketInfo info) {
		this.info = info;
	}

	public List<DocketParties> getParties() {
		return parties;
	}

	public void setParties(List<DocketParties> parties) {
		this.parties = parties;
	}

	public List<DocketReport> getDocket_report() {
		return docket_report;
	}

	public void setDocket_report(List<DocketReport> docket_report) {
		this.docket_report = docket_report;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}

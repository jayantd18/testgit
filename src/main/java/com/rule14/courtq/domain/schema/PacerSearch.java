package com.rule14.courtq.domain.schema;

import java.util.List;

public class PacerSearch {

	private int page_max;

	private List<PacerSearchResult> search_results;

	private boolean success;

	private String error;

	public int getPage_max() {
		return page_max;
	}

	public void setPage_max(int page_max) {
		this.page_max = page_max;
	}

	public List<PacerSearchResult> getSearch_results() {
		return search_results;
	}

	public void setSearch_results(List<PacerSearchResult> search_results) {
		this.search_results = search_results;
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

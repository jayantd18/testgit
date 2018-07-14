package com.rule14.courtq.domain.schema;

public class PacerSearchResult {

	private String date_terminated;
	private String court;
	private String party_role;
	private String title;
	private String date_filed;
	private String link;
	private String nature_of_suit;
	private String party_name;
	private String docket;

	public String getDate_terminated() {
		return date_terminated;
	}

	public void setDate_terminated(String date_terminated) {
		this.date_terminated = date_terminated;
	}

	public String getCourt() {
		return court;
	}

	public void setCourt(String court) {
		this.court = court;
	}

	public String getParty_role() {
		return party_role;
	}

	public void setParty_role(String party_role) {
		this.party_role = party_role;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate_filed() {
		return date_filed;
	}

	public void setDate_filed(String date_filed) {
		this.date_filed = date_filed;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getNature_of_suit() {
		return nature_of_suit;
	}

	public void setNature_of_suit(String nature_of_suit) {
		this.nature_of_suit = nature_of_suit;
	}

	public String getParty_name() {
		return party_name;
	}

	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}

	public String getDocket() {
		return docket;
	}

	public void setDocket(String docket) {
		this.docket = docket;
	}

}

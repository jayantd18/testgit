package com.rule14.courtq.domain.schema;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class DocketCounsel {
	@JsonProperty("firm") private String firm;
	@JsonProperty("name") private String name;
	@JsonProperty("phone")  private String phone;
	@JsonProperty("email") private String email;
	@JsonProperty("email2") private String email2;
	@JsonProperty("address") private List<String> address;

	
}

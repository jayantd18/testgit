package com.rule14.courtq.domain.schema;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class DocketInfo {

	private String title;
	private String date_filed;
	private String link;
	private String judge;
	private String magistrate;
	private String nature_of_suit;
	private String date_terminated;
	private String demand;

	// newly added
	private String type;
	private String status;
	private String division;
	private String cause;
	private String date_debtor_discharged;
	private String date_joint_debtor_discharged;
	private String date_341_meeting;
	private String date_plan_confirmed;
	private String date_deadline_object_discharge;
	private String date_deadline_financial_mgmt_course;
	private String disposition_debtor;
	private String disposition_joint_debtor;
	private boolean is_asset;
	private boolean is_voluntary;

	
}

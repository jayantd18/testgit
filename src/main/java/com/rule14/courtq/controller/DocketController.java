package com.rule14.courtq.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/docket")
@Api(value = "docket")
public class DocketController {
	
	@RequestMapping (value="/case/{docketId}", method = RequestMethod.GET)
	@ApiOperation(value = "Get  Case Detail By Docket ID", notes = "Get  Case Detail By Docket ID", response = ResponseEntity.class)
	public ResponseEntity<String> getCase( @ApiParam(name = "docketId",  value = "DocketId", required = true)
	@PathVariable("docketId") long docketId)  {
		
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	@RequestMapping (value="/cases", method = RequestMethod.POST)
	@ApiOperation(value = "Get  Cases Details", notes = "Get  Cases Details", response = ResponseEntity.class)
	public ResponseEntity<String> getCases( @ApiParam(name = "feedDetail",  value = "feedDetail", required = true)
	@RequestBody Object feedDetail)  {
		
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	@RequestMapping (value="/case/document/{dockeReportId}", method = RequestMethod.GET)
	@ApiOperation(value = "Download  Case Report Document By Docket ReportID", notes = "Download  Case Report Document By Docket ReportID", response = ResponseEntity.class)
	public ResponseEntity<String> downloadCaseDocument( @ApiParam(name = "dockeReportId",  value = "dockeReportId", required = true)
	@PathVariable("dockeReportId") long docketId)  {
		
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	@RequestMapping (value="/user/cases", method = RequestMethod.POST)
	@ApiOperation(value = "Get Assigned  Cases Details", notes = "Get Assigned  Cases Details", response = ResponseEntity.class)
	public ResponseEntity<String> getUserCases( @ApiParam(name = "feedDetail",  value = "feedDetail", required = true)
	@RequestBody Object feedDetail)  {
		
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}

}

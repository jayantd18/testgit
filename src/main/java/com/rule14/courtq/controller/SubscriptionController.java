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
@RequestMapping("/subscription")
@Api(value = "subscription")
public class SubscriptionController {
	
	
	@RequestMapping (value="/cases", method = RequestMethod.POST)
	@ApiOperation(value = "Get subscriber cases", notes = "Get subscriber cases", response = ResponseEntity.class)
	public ResponseEntity<String> getCases( @ApiParam(name = "feedDetail",  value = "feedDetail", required = true)
	@RequestBody Object feedDetail)  {
		
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	@RequestMapping (value="/subscribe", method = RequestMethod.POST)
	@ApiOperation(value = "Add New and Update subscription", notes = "Save Or Update Sbuscription", response = ResponseEntity.class)
	public ResponseEntity<String> saveOrUpdate(@ApiParam(name = "feedDetail",  value = "feedDetail", required = true)
	@RequestBody Object feedDetail)  {
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	@RequestMapping (value="/all", method = RequestMethod.POST)
	@ApiOperation(value = "Get all Subscription ", notes = "Get all Sbuscription ", response = ResponseEntity.class)
	public ResponseEntity<String> getSubscriptions( @ApiParam(name = "feedDetail",  value = "feedDetail", required = true)
	@RequestBody Object feedDetail)  {
		
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	@RequestMapping (value="/trackStatus", method = RequestMethod.POST)
	@ApiOperation(value = "Enable/Disable Subscripton ", notes = "Enable/Disable Subscripton", response = ResponseEntity.class)
	public ResponseEntity<String> updateTrackStatus( @ApiParam(name = "feedDetail",  value = "feedDetail", required = true)
	@RequestBody Object feedDetail)  {
		
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	@RequestMapping (value="/export", method = RequestMethod.POST)
	@ApiOperation(value = "Export All Subscripton in CSV File", notes = "Export All Subscripton in CSV File", response = ResponseEntity.class)
	public ResponseEntity<String> export( @ApiParam(name = "feedDetail",  value = "feedDetail", required = true)
	@RequestBody Object feedDetail)  {
		
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	@RequestMapping (value="/unsubscribe", method = RequestMethod.POST)
	@ApiOperation(value = "Unsubscribe case subscription", notes = "Save Or Update Sbuscription", response = ResponseEntity.class)
	public ResponseEntity<String> unsubscribe(@ApiParam(name = "feedDetail",  value = "feedDetail", required = true)
	@RequestBody Object feedDetail)  {
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	

}

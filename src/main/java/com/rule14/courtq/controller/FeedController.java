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
@RequestMapping("/feed")
@Api(value = "feedController")
public class FeedController {
	
	@RequestMapping (value="/{feedId}", method = RequestMethod.GET)
	@ApiOperation(value = "Get Feed Details By FeedId", notes = "Get Feed Details By FeedId", response = ResponseEntity.class)
	public ResponseEntity<String> get( @ApiParam(name = "feedId",  value = "feedId", required = true)
	@PathVariable("feedId") long docketId)  {
		
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	@RequestMapping (value="/posts/{feedId}", method = RequestMethod.GET)
	@ApiOperation(value = "Get Feed Posts list By FeedId", notes = "Get Feed Posts list By FeedId", response = ResponseEntity.class)
	public ResponseEntity<String> getPosts( @ApiParam(name = "feedId",  value = "feedId", required = true)
	@PathVariable("feedId") long docketId)  {
		
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	@RequestMapping (value="/post/share", method = RequestMethod.POST)
	@ApiOperation(value = "Shared Feed Post Contains by email", notes = "Shared Feed Post Contains by email", response = ResponseEntity.class)
	public ResponseEntity<String> sharePost(@ApiParam(name = "shareDetail",  value = "shareDetail", required = true)
	@RequestBody Object shareDetail)  {
		
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	@RequestMapping (value="/posts/alerts", method = RequestMethod.POST)
	@ApiOperation(value = "Get All Alert Feed Posts Contains with Sentiment tags", notes = "Get All Alert Feed Posts Contains with Sentiment tags", response = ResponseEntity.class)
	public ResponseEntity<String> postAlerts(@ApiParam(name = "shareDetail",  value = "shareDetail", required = true)
	@RequestBody Object shareDetail)  {
		
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	@RequestMapping (value="/", method = RequestMethod.POST)
	@ApiOperation(value = "Save Or Update Feed Detail", notes = "Save Or Update Feed Detail", response = ResponseEntity.class)
	public ResponseEntity<String> saveOrUpdate(@ApiParam(name = "feedDetail",  value = "feedDetail", required = true)
	@RequestBody Object feedDetail)  {
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	//for Enable/Disabled
	@RequestMapping (value="/trackStatus/{feedId}", method = RequestMethod.POST)
	@ApiOperation(value = "Update Feed Track Status", notes = "Update Feed Track Status", response = ResponseEntity.class)
	public ResponseEntity<String> updateTrackStatus( @ApiParam(name = "feedId",  value = "feedId", required = true)
	@PathVariable("feedId") long docketId)  {
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	//for Email Notification Enable/Disabled 
	@RequestMapping (value="/notificationStatus/{feedId}", method = RequestMethod.POST)
	@ApiOperation(value = "Update Feed Email Notification Status", notes = "Update Feed Email Notification Status", response = ResponseEntity.class)
	public ResponseEntity<String> notificationStatus( @ApiParam(name = "feedId",  value = "feedId", required = true)
	@PathVariable("feedId") long docketId)  {
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	//for View Enable/Disabled 
	@RequestMapping (value="/viewStatus/{feedId}", method = RequestMethod.POST)
	@ApiOperation(value = "Update Feed View Status", notes = "Update Feed Email Notification Status", response = ResponseEntity.class)
	public ResponseEntity<String> viewStatus( @ApiParam(name = "feedId",  value = "feedId", required = true)
		@PathVariable("feedId") long docketId)  {
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}

		//for All Status Email, View and  Enable/Disabled 
		@RequestMapping (value="/status/{feedId}", method = RequestMethod.POST)
		@ApiOperation(value = "Update Feed Statuses", notes = "Update Feed Statuses", response = ResponseEntity.class)
		public ResponseEntity<String> updateStatus( @ApiParam(name = "feedId",  value = "feedId", required = true)
		@PathVariable("feedId") long docketId)  {
			return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	@RequestMapping (value="/posts", method = RequestMethod.POST)
	@ApiOperation(value = "Save Or Update Feed Post Detail", notes = "Save Or Update Feed Post Detail", response = ResponseEntity.class)
	public ResponseEntity<String> savePosts(@ApiParam(name = "feedDetail",  value = "feedDetail", required = true)
	@RequestBody Object feedDetail)  {
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	

}

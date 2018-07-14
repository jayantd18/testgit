package com.rule14.courtq.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
public class ImportExportController {
	
	@RequestMapping (value="/import", method = RequestMethod.POST)
	@ApiOperation(value = "Import New Cases", notes = "Import New Cases", response = ResponseEntity.class)
	public ResponseEntity<String> importCases( @ApiParam(name = "feedDetail",  value = "feedDetail", required = true)
	@RequestBody Object feedDetail)  {
		
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	@RequestMapping (value="/import/list", method = RequestMethod.POST)
	@ApiOperation(value = "Get Import Files List", notes = "Get Import Files List", response = ResponseEntity.class)
	public ResponseEntity<String> getImportFiles( @ApiParam(name = "feedDetail",  value = "feedDetail", required = true)
	@RequestBody Object feedDetail)  {
		
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}
	
	@RequestMapping (value="/export", method = RequestMethod.POST)
	@ApiOperation(value = "Export Import log By Import File Name ", notes = "Export Import log By Import File Name ", response = ResponseEntity.class)
	public ResponseEntity<String> exportLog( @ApiParam(name = "feedDetail",  value = "feedDetail", required = true)
	@RequestBody Object feedDetail)  {
				
		return new ResponseEntity<String>(new String("Success"), HttpStatus.OK);
	}

}

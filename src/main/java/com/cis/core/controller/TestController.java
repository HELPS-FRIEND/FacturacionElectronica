package com.cis.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cis.core.entity.Test;
import com.cis.core.model.TestModel;
import com.cis.core.service.TestService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/test")
@Api(value = "Test", description = "Rest API for Test operations", tags = "Test API")
@ApiResponses(value = { @ApiResponse(code = 200, message = "true"),
		@ApiResponse(code = 404, message = "The resource not found") })
public class TestController {

	@Autowired
	@Qualifier("testService")
	private TestService testService;

	@PutMapping("/new")
	@ApiOperation(value = "Create a new test", response = TestModel.class)
	public boolean agregarRestaurante(@RequestBody @Validated Test test) {
		return testService.crear(test);
	}

	@GetMapping("/")
	@ApiOperation(value = "Test Hellow world", response = TestModel.class)
	public String hellow() {
		return "Hello World!";
	}
	
	@GetMapping("/list")
	@ApiOperation(value = "Test List", response = TestModel.class)
	public List<TestModel> getTes() { 
		return testService.obtener();
	}
}

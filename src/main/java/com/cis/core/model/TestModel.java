package com.cis.core.model;

import com.cis.core.entity.Test;

import io.swagger.annotations.ApiModelProperty;

public class TestModel {
	@ApiModelProperty(notes = "Provided the ID of test", required =true)
	private long id;
	@ApiModelProperty(notes = "Provided the name of test", required =true)
	private String test;
	
	public TestModel(Test test) {
		this.id = test.getId();
		this.test = test.getTest();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
}

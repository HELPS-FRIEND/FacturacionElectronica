package com.cis.core.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cis.core.entity.Test;
import com.cis.core.model.TestModel;

@Component("testConverter")
public class TestConverter {
	public List<TestModel> convertirLista(List<Test> tests){
		List<TestModel> testsModels = new ArrayList<>();
		for(Test test : tests) {
			testsModels.add(new TestModel(test));
		}
		return testsModels;
	}

}


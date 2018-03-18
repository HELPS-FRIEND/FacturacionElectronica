package com.cis.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cis.core.converter.TestConverter;
import com.cis.core.entity.Test;
import com.cis.core.model.TestModel;
import com.cis.core.repository.TestRepository;


@Repository("testService")
public class TestService {
	@Autowired
	@Qualifier("testRepository")
	private TestRepository repositorio;
	@Autowired
	@Qualifier("testConverter")
	private TestConverter testConverter;
	
	public boolean crear(Test test) {
		try {
			repositorio.save(test);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean actualizar(Test test) {
		try {
			repositorio.save(test);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean borrar(long id) {
		try {
			Test test= repositorio.findById(id);
			repositorio.delete(test);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public List<TestModel> obtener() {
		List<Test> test = repositorio.findAll();
		List<TestModel> testModel= testConverter.convertirLista(test);
		return testModel;
	}
	public TestModel obtenerTest(String stest) {
		Test test = repositorio.findByTest(stest);	
		return new TestModel(test);
	}
}

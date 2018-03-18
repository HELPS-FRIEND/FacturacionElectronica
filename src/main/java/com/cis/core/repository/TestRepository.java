package com.cis.core.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cis.core.entity.Test;
@Repository("testRepository")
public interface TestRepository   extends JpaRepository<Test, Serializable>{
	public abstract Test findByTest(String test);
	public abstract Test findById(long id);
}





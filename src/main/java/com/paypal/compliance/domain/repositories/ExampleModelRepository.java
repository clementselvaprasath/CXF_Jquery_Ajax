package com.paypal.compliance.domain.repositories;

import java.util.List;

import com.paypal.compliance.domain.ExampleModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleModelRepository extends CrudRepository<ExampleModel, String> {
	
	ExampleModel findByString(String String);
	List<ExampleModel> findByAnInt(int anInt);
    
}

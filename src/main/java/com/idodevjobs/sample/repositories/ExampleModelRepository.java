package com.idodevjobs.sample.repositories;

import java.util.List;
import com.idodevjobs.sample.model.ExampleModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleModelRepository extends CrudRepository<ExampleModel, String> {
	
	ExampleModel findByString(String String);
	List<ExampleModel> findByAnInt(int anInt);
    
}

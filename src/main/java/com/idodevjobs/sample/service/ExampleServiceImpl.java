package com.idodevjobs.sample.service;
 
import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.mongodb.AggregationOutput;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import com.idodevjobs.sample.repositories.ExampleModelRepository; 
import com.idodevjobs.sample.model.ExampleModel;
import org.springframework.stereotype.Service;
 
@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {
 
	@Autowired
	ExampleModelRepository exampleModelRepository;
	
    //@Override
    //public ExampleModel get(String modelId) {
	//	System.out.println("Entering...."+modelId);
    //    return new ExampleModel("example", 1001);
		//System.out.println("Exiting....");
   // }
	public ExampleModel putModel(ExampleModel exampleModel){
		System.out.println("Entering...."+exampleModel.toString());
		//return "Returing string of putModel...";
		
		/*try{
			DBCollection dbCollection = mongoTemplate.getDb().getCollection("model");
			dbCollection.insert(exampleModel);
		}catch(UnknownHostException e){
			System.out.println("Unable to connect to MongoDB "+e);
		}*/
		exampleModelRepository.save(exampleModel);
		return new ExampleModel(exampleModel.getString() + "Returning Back with addition 10", exampleModel.getAnInt()+10);
	}
}
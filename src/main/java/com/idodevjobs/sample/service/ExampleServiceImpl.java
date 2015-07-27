package com.idodevjobs.sample.service;
 
import com.idodevjobs.sample.model.ExampleModel;
import org.springframework.stereotype.Service;
 
@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {
 
    //@Override
    //public ExampleModel get(String modelId) {
	//	System.out.println("Entering...."+modelId);
    //    return new ExampleModel("example", 1001);
		//System.out.println("Exiting....");
   // }
	public ExampleModel putModel(ExampleModel exampleModel){
		System.out.println("Entering...."+exampleModel.toString());
		//return "Returing string of putModel...";
		return new ExampleModel("exampleRETURNING", 999);
	}
}
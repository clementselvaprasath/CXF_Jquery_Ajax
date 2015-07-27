package com.idodevjobs.sample.service;
 
import com.idodevjobs.sample.model.ExampleModel;
 
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
 
@Path("/example")
@Consumes("application/json")
@Produces("application/json")
public interface ExampleService {
 
    //@GET
    //@Path("/{id}")
    //public ExampleModel get(@PathParam("id") String id);
 
    @POST
    @Path("/putModel")
    public ExampleModel putModel(ExampleModel exampleModel);
}
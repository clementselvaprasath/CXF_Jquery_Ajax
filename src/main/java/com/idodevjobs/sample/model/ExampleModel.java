package com.idodevjobs.sample.model;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="model") 
public class ExampleModel implements Serializable  {

	
	@Id
    private String string;
	@Field
    private int anInt;
 
    public ExampleModel() {}
 
    public ExampleModel(String string, int anInt) {
        this.string = string;
        this.anInt = anInt;
    }

    public String getString() {
        return string;
    }
 
    public void setString(String string) {
        this.string = string;
    }
 
    public int getAnInt() {
        return anInt;
    }
 
    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }
 
    @Override
    public String toString() {
        return "ExampleModel{" +
                "string='" + string + '\'' +
                ", anInt=" + anInt +
                '}';
    }
}
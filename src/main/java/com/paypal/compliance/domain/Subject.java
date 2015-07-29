package com.paypal.compliance.domain;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Subject implements Serializable  {

	private Long entityKey;
	private Long discVersionKey;
	private String entityMark;
	private String firstName;
	private String lastName;
	
	public Long getEntityKey() {
		return entityKey;
	}
	public void setEntityKey(Long entityKey) {
		this.entityKey = entityKey;
	}
	public Long getDiscVersionKey() {
		return discVersionKey;
	}
	public void setDiscVersionKey(Long discVersionKey) {
		this.discVersionKey = discVersionKey;
	}
	public String getEntityMark() {
		return entityMark;
	}
	public void setEntityMark(String entityMark) {
		this.entityMark = entityMark;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}

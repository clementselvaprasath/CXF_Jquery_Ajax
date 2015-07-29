package com.paypal.compliance.domain;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.DBRef;
import com.paypal.compliance.domain.Transaction;
import com.paypal.compliance.domain.Subject;
import java.util.*;

@Document(collection="disclosure") 
public class Disclosure implements Serializable  {
	
	private Long key;
	private String caseIdentifier;
	private Long caseKey;
	private String caseName;
	private Long orgunitCode;
	private Long domainCode;

    @Field
    List<Transaction> transactions;

    @Field
    List<Subject> subjects;
    
	public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }
	
	public String getCaseIdentifier() {
		return caseIdentifier;
	}

	public void setCaseIdentifier(String caseIdentifier) {
		this.caseIdentifier = caseIdentifier;
	}

	public Long getCaseKey() {
		return caseKey;
	}

	public void setCaseKey(Long caseKey) {
		this.caseKey = caseKey;
	}

	public String getCaseName() {
		return caseName;
	}

	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

	public Long getOrgunitCode() {
		return orgunitCode;
	}

	public void setOrgunitCode(Long orgunitCode) {
		this.orgunitCode = orgunitCode;
	}

	public Long getDomainCode() {
		return domainCode;
	}

	public void setDomainCode(Long domainCode) {
		this.domainCode = domainCode;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
    public String toString() {
        return "Disclosure{" +
                "key='" + key + '\'' +
                ", caseIdentifier=" + caseIdentifier +
                 ", caseKey=" + caseKey +
                  ", caseName=" + caseName +
                  ", orgunitCode=" + orgunitCode +
                  ", domainCode=" + domainCode +                  
                '}';
    }

}
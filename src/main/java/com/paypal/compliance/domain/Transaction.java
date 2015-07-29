package com.paypal.compliance.domain;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Transaction implements Serializable  {

	private String amountBase;
	private Long accountSourceRefId;
	private String currencyCodeBase;
	private String transRefDesc;
	private String txnTypeDesc;
    
	public String getAmountBase() {
		return amountBase;
	}
	public void setAmountBase(String amountBase) {
		this.amountBase = amountBase;
	}
	public Long getAccountSourceRefId() {
		return accountSourceRefId;
	}
	public void setAccountSourceRefId(Long accountSourceRefId) {
		this.accountSourceRefId = accountSourceRefId;
	}
	public String getCurrencyCodeBase() {
		return currencyCodeBase;
	}
	public void setCurrencyCodeBase(String currencyCodeBase) {
		this.currencyCodeBase = currencyCodeBase;
	}
	public String getTransRefDesc() {
		return transRefDesc;
	}
	public void setTransRefDesc(String transRefDesc) {
		this.transRefDesc = transRefDesc;
	}
	public String getTxnTypeDesc() {
		return txnTypeDesc;
	}
	public void setTxnTypeDesc(String txnTypeDesc) {
		this.txnTypeDesc = txnTypeDesc;
	}

}

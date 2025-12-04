package com.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CC")
public class CreditCard extends Payment {
	
	private Integer cardNum;
	private String cardType;

	
	public  CreditCard() {
		
	}


	public Integer getCardNum() {
		return cardNum;
	}


	public void setCardNum(Integer cardNum) {
		this.cardNum = cardNum;
	}


	public String getCardType() {
		return cardType;
	}


	public void setCardType(String cardType) {
		this.cardType = cardType;
	}


	@Override
	public String toString() {
		return "CreditCard [cardNum=" + cardNum + ", cardType=" + cardType + "]";
	}
	
	
}

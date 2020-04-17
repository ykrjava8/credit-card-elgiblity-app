package com.banking.wipro.creditcardelgiblity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name = "PAN_DETAILS")

public class PanDetails {
	@Id
	@Column(name = "PAN_NUMBER")
	private String panNumber;
	@Column(name = "CREDIT_SCORE")

	private double creditScore;
	/**
	 * @return the panNumber
	 */
	public String getPanNumber() {
		return panNumber;
	}
	/**
	 * @param panNumber the panNumber to set
	 */
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	/**
	 * @return the creditScore
	 */
	public double getCreditScore() {
		return creditScore;
	}
	/**
	 * @param creditScore the creditScore to set
	 */
	public void setCreditScore(double creditScore) {
		this.creditScore = creditScore;
	}
	
	
	

}

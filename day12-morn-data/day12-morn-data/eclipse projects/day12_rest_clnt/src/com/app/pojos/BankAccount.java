package com.app.pojos;



public class BankAccount {
	private Integer acctId;
	private String pin,acType;
	private double balance;
	public BankAccount() {
		System.out.println("in acct constr");
	}
	public BankAccount(Integer acctId, String pin, String acType, double balance) {
		super();
		this.acctId = acctId;
		this.pin = pin;
		this.acType = acType;
		this.balance = balance;
	}
		public Integer getAcctId() {
		return acctId;
	}
	public void setAcctId(Integer acctId) {
		this.acctId = acctId;
	}
	
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	public String getAcType() {
		return acType;
	}
	public void setAcType(String acType) {
		this.acType = acType;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [acctId=" + acctId + ", pin=" + pin + ", acType=" + acType + ", balance=" + balance + "]";
	}
	

}

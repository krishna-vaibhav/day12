package com.app.pojos;
import javax.persistence.*;

@Entity
@Table(name="mybank")
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
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ac_id")
	public Integer getAcctId() {
		return acctId;
	}
	public void setAcctId(Integer acctId) {
		this.acctId = acctId;
	}
	@Column(length=4)
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Column(length=10)
	public String getAcType() {
		return acType;
	}
	public void setAcType(String acType) {
		this.acType = acType;
	}
	@Column(columnDefinition="double(8,1)")
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

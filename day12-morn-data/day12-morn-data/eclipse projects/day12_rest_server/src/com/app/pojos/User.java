package com.app.pojos;

public class User {
	private int id;
	private String name;
	private double regAmount;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, double regAmount) {
		super();
		this.id = id;
		this.name = name;
		this.regAmount = regAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRegAmount() {
		return regAmount;
	}
	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", regAmount=" + regAmount + "]";
	}
	

}

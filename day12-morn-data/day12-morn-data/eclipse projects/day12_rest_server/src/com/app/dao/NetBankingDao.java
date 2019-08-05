package com.app.dao;

import com.app.pojos.BankAccount;

public interface NetBankingDao {
	BankAccount fetchAccountSummary(int id,String pin);
	String createAccount(BankAccount a);
	String updateAccount(BankAccount a,double updateAmount);
	String closeAccount(BankAccount a);
}

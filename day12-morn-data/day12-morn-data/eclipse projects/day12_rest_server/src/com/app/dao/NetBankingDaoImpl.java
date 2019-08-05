package com.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.BankAccount;

@Repository
@Transactional
public class NetBankingDaoImpl implements NetBankingDao {
	@Autowired
	private SessionFactory sf;

	@Override
	public BankAccount fetchAccountSummary(int id1, String pin1) {
		String jpql = "select b from BankAccount b where b.acctId = :id and b.pin=:pin";
		return sf.getCurrentSession().createQuery(jpql, BankAccount.class).setParameter("id", id1)
				.setParameter("pin", pin1).getSingleResult();
	}

	@Override
	public String createAccount(BankAccount a) {
		sf.getCurrentSession().persist(a);
		return "A/C created successfully with ID "+a.getAcctId();
	}

	@Override
	public String updateAccount(BankAccount a, double updateAmount) {
		a.setBalance(a.getBalance()+updateAmount);
		sf.getCurrentSession().update(a);
		return "A/C updated successfully with ID "+a.getAcctId() +" Bal "+a.getBalance();
	}

	@Override
	public String closeAccount(BankAccount a) {
		sf.getCurrentSession().delete(a);
		return "A/C closed successfully with ID "+a.getAcctId();
	}

}

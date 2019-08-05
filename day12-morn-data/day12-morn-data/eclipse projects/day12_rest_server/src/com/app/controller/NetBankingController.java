package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.NetBankingDao;
import com.app.pojos.BankAccount;

@RestController
@RequestMapping("/bank_accts")
public class NetBankingController {
	@Autowired
	private NetBankingDao dao;

	// fetch a/c summary
	@GetMapping("/{ac_id}/{pin}")
	public BankAccount fetchSummary(@PathVariable int ac_id, @PathVariable String pin) {
		System.out.println("rest srvr : fetch summary " + ac_id + " " + pin);
		return dao.fetchAccountSummary(ac_id, pin);
	}

}

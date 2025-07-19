package com.cognizant.account.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.model.Account;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@GetMapping("/{number}")
	public ResponseEntity<Account> getAccount(@PathVariable String number){
		Account ac = new Account();
		ac.setNumber(number);
		ac.setType("savings");
		ac.setBalance(234343);
		return ResponseEntity.ok(ac);
	}
}

package com.cognizant.loan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.model.Loan;

@RestController
@RequestMapping("/loans")
public class LoanController {
	
	@GetMapping("/{number}")
	public ResponseEntity<Loan> getLoanDetails(@PathVariable String number){
		Loan ln = new Loan();
		ln.setNumber(number);
		ln.setType("car");
		ln.setLoan(400000);
		ln.setEmi(3258);
		ln.setTenure(18);
		return ResponseEntity.ok(ln);
	}
}

package com.pro.accounts;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Accounts;
import com.pro.utilities.EntityServiceInterface;


@RestController /* ("/accounts") */
public class FindUserAccount {

	@Autowired
	EntityServiceInterface repository;
	
	//@SuppressWarnings("rawtypes")
	@GetMapping("/getAccount")
	public Optional<Accounts> fetchAccountDetails(/* @RequestParam("accNo") String accNo */) {
		System.out.println("Hi*******************************************");
		Criteria c = new Criteria();
		
		Optional<Accounts> a = repository.findById("acc1234");
		List<Accounts> li = repository.findAll();
		
		return a;
	}
}

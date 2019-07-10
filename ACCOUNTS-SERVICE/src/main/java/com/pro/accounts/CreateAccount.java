package com.pro.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.utilities.EntityServiceInterface;


@RestController /* ("/qqq") */
public class CreateAccount {

	@Autowired
	EntityServiceInterface repository;
	
	@RequestMapping("/abc")
	public void createUserAccount() {
		System.out.println("********************************");
	}
}

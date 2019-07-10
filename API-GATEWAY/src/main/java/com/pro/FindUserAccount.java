package com.pro;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController /* ("/accounts") */
public class FindUserAccount {

	/*
	 * @Autowired EntityServiceInterface repository;
	 */
	
	//@SuppressWarnings("rawtypes")
	@GetMapping("/getAccount")
	public String fetchAccountDetails(/* @PathVariable("accNo") String accNo */) {
		System.out.println("Hi8********************************************");
		Criteria c = new Criteria();
		
		/*
		 * Optional<Accounts> a = repository.findById("acc1234"); List<Accounts> li =
		 * repository.findAll();
		 */
		
		return "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
	}
}

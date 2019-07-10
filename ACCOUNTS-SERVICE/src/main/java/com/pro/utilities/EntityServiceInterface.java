package com.pro.utilities;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.model.Accounts;

public interface EntityServiceInterface extends MongoRepository<Accounts, String>{

	//Accounts findccounts(String accNo);
	

}

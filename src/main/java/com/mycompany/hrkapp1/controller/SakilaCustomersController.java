package com.mycompany.hrkapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.hrkapp1.entity.SakilaCustomers;
import com.mycompany.hrkapp1.repository.SakilaCustomersRepository;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class SakilaCustomersController {
	
	@Autowired
	private SakilaCustomersRepository repository;
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public Flux<SakilaCustomers> findAll() {
	  return repository.findAll();
	}

}

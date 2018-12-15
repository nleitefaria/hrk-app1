package com.mycompany.hrkapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.hrkapp1.entity.Pets;
import com.mycompany.hrkapp1.repository.PetsRepository;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class PetsController {
	
	@Autowired
	private PetsRepository repository;
	
	@RequestMapping(value = "/pets", method = RequestMethod.GET)
	public Flux<Pets> getAllPets() {
	  return repository.findAll();
	}

}

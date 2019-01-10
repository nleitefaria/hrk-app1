package com.mycompany.hrkapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.hrkapp1.entity.VideoMovies;
import com.mycompany.hrkapp1.repository.VideoMoviesRepository;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class VideoMoviesController 
{
	@Autowired
	private VideoMoviesRepository repository;
	
	@RequestMapping(value = "/video/movies", method = RequestMethod.GET)
	public Flux<VideoMovies> findAll() 
	{
	  return repository.findAll();
	}
}

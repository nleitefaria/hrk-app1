package com.mycompany.hrkapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mycompany.hrkapp1.entity.VideoMovieDetails;
import com.mycompany.hrkapp1.repository.VideoMovieDetailsRepository;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class VideoMovieDetailsController 
{
	@Autowired
	private VideoMovieDetailsRepository repository;
	
	@RequestMapping(value = "/video/movies-details", method = RequestMethod.GET)
	public Flux<VideoMovieDetails> findAll() 
	{
	  return repository.findAll();
	}
}

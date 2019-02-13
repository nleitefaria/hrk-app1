package com.mycompany.hrkapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mycompany.hrkapp1.entity.VideoMovieDetails;
import com.mycompany.hrkapp1.service.VideoMovieDetailsService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class VideoMovieDetailsController 
{
	@Autowired
	private VideoMovieDetailsService service;
	
	@GetMapping(value = "/video/movie-details")
	public ResponseEntity<Flux<VideoMovieDetails>> findAll() 
	{  
	  return new ResponseEntity<Flux<VideoMovieDetails>>(service.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/video/movie-details/{id}")
    public ResponseEntity<Mono<VideoMovieDetails>> findOne(@PathVariable(value = "id") String id) 
	{
		return new ResponseEntity<Mono<VideoMovieDetails>>(service.findById(id), HttpStatus.OK);
    }
}

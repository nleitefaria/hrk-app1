package com.mycompany.hrkapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.hrkapp1.entity.VideoReviews;
import com.mycompany.hrkapp1.service.VideoReviewsService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class VideoReviewsController 
{
	@Autowired
	private VideoReviewsService service;
	
	@GetMapping(value = "/video/reviews")
	public ResponseEntity<Flux<VideoReviews>> findAll() 
	{
		return new ResponseEntity<Flux<VideoReviews>>(service.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/video/reviews/{id}")
    public ResponseEntity<Mono<VideoReviews>> findOne(@PathVariable(value = "id") String id) 
	{
		return new ResponseEntity<Mono<VideoReviews>>(service.findById(id), HttpStatus.OK);
    }
}

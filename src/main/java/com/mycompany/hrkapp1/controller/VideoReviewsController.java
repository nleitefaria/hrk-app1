package com.mycompany.hrkapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.hrkapp1.entity.VideoReviews;
import com.mycompany.hrkapp1.repository.VideoReviewsRepository;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class VideoReviewsController {
	
	@Autowired
	private VideoReviewsRepository repository;
	
	@RequestMapping(value = "/video/reviews", method = RequestMethod.GET)
	public Flux<VideoReviews> findAll() {
	  return repository.findAll();
	}

}

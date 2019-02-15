package com.mycompany.hrkapp1.service.impl;

import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.hrkapp1.entity.VideoReviews;
import com.mycompany.hrkapp1.repository.VideoReviewsRepository;
import com.mycompany.hrkapp1.service.VideoReviewsService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VideoReviewsServiceImpl implements VideoReviewsService 
{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private VideoReviewsRepository repository;
	
	public Flux<VideoReviews> findAll() 
    {
		logger.info("@findAll");
        return repository.findAll();
    }
	
	public Mono<VideoReviews> findById(String id)
    {
		logger.info("@findById");
        return repository.findById(new ObjectId(id));
    }

}

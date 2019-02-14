package com.mycompany.hrkapp1.service.impl;

import org.bson.types.ObjectId;
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
	@Autowired
    private VideoReviewsRepository repository;
	
	public Flux<VideoReviews> findAll() 
    {
        return repository.findAll();
    }
	
	public Mono<VideoReviews> findById(String id)
    {
        return repository.findById(new ObjectId(id));
    }

}

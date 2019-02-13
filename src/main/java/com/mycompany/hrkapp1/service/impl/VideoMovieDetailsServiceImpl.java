package com.mycompany.hrkapp1.service.impl;

import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.hrkapp1.entity.VideoMovieDetails;
import com.mycompany.hrkapp1.repository.VideoMovieDetailsRepository;
import com.mycompany.hrkapp1.service.VideoMovieDetailsService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VideoMovieDetailsServiceImpl implements VideoMovieDetailsService
{	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    VideoMovieDetailsRepository repository;
	
	public Flux<VideoMovieDetails> findAll() 
    {
        return repository.findAll();
    }
	
	public Mono<VideoMovieDetails> findById(String id)
    {
        return repository.findById(new ObjectId(id));
    }

}

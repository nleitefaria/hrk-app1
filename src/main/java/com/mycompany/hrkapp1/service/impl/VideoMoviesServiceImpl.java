package com.mycompany.hrkapp1.service.impl;

import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.hrkapp1.entity.VideoMovies;
import com.mycompany.hrkapp1.repository.VideoMoviesRepository;
import com.mycompany.hrkapp1.service.VideoMoviesService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VideoMoviesServiceImpl implements VideoMoviesService
{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private VideoMoviesRepository repository;
	
	public Flux<VideoMovies> listAll() 
    {
        return repository.findAll();
    }
	
	public Mono<VideoMovies> findById(String id)
    {
        return repository.findById(new ObjectId(id));
    }
}

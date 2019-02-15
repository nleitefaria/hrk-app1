package com.mycompany.hrkapp1.service.impl;

import java.util.List;

import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.repository.support.PageableExecutionUtils;
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
	MongoTemplate mongoTemplate;
	
	@Autowired
    private VideoMoviesRepository repository;
	
	public Flux<VideoMovies> findAll() 
    {
		logger.info("@findAll");
        return repository.findAll();
    }
	
	public Mono<VideoMovies> findById(String id)
    {
		logger.info("@findById");
        return repository.findById(new ObjectId(id));
    }
	
	public Mono<Page<VideoMovies>> listAllPaged(int pageNum)
	{
		return Mono.create(callback -> {
		    try { callback.success(this.getAllPaged(pageNum)); }
		    catch (Exception e) { callback.error(e); }
		});	
	}
	
	private Page<VideoMovies> getAllPaged(int pageNum)
	{
		Pageable pageable = new PageRequest(pageNum, 10);
		Query videoMoviesDynamicQuery = new Query().with(pageable);		
		List<VideoMovies> filteredVideoMovies = mongoTemplate.find(videoMoviesDynamicQuery, VideoMovies.class, "video_movies");
		Page<VideoMovies> videoMoviesPage = PageableExecutionUtils.getPage(filteredVideoMovies, pageable, () -> mongoTemplate.count(videoMoviesDynamicQuery, VideoMovies.class));		
		return videoMoviesPage;		
	}
}

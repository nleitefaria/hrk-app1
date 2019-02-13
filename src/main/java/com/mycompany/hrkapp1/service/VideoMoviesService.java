package com.mycompany.hrkapp1.service;

import org.springframework.data.domain.Page;

import com.mycompany.hrkapp1.entity.VideoMovies;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface VideoMoviesService 
{
	Flux<VideoMovies> findAll();
	Mono<VideoMovies> findById(String id);
	Page<VideoMovies> listAllPaged(int pageNum);

}

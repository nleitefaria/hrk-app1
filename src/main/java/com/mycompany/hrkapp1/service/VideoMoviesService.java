package com.mycompany.hrkapp1.service;

import com.mycompany.hrkapp1.entity.VideoMovies;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface VideoMoviesService 
{
	Flux<VideoMovies> findAll();
	Mono<VideoMovies> findById(String id);

}

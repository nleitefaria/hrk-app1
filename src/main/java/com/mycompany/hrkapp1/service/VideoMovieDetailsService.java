package com.mycompany.hrkapp1.service;

import com.mycompany.hrkapp1.entity.VideoMovieDetails;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface VideoMovieDetailsService {
	
	Flux<VideoMovieDetails> findAll();
	Mono<VideoMovieDetails> findById(String id);


}

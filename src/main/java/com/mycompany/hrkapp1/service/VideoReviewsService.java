package com.mycompany.hrkapp1.service;

import com.mycompany.hrkapp1.entity.VideoReviews;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface VideoReviewsService 
{
	Flux<VideoReviews> findAll();
	Mono<VideoReviews> findById(String id);
}

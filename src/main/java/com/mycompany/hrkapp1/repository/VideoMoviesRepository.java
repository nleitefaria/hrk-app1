package com.mycompany.hrkapp1.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.mycompany.hrkapp1.entity.VideoMovies;

public interface VideoMoviesRepository extends ReactiveMongoRepository<VideoMovies, Integer> 
{	
}
package com.mycompany.hrkapp1.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.mycompany.hrkapp1.entity.VideoMovieDetails;

public interface VideoMovieDetailsRepository extends ReactiveMongoRepository<VideoMovieDetails, ObjectId> {

}

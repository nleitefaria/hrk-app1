package com.mycompany.hrkapp1.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.mycompany.hrkapp1.entity.VideoReviews;

public interface VideoReviewsRepository extends ReactiveMongoRepository<VideoReviews, ObjectId> {

}

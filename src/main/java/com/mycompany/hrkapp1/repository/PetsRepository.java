package com.mycompany.hrkapp1.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.mycompany.hrkapp1.entity.Pets;

public interface PetsRepository extends ReactiveMongoRepository<Pets, String> 
{	
}
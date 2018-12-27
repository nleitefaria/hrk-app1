package com.mycompany.hrkapp1.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.mycompany.hrkapp1.entity.SakilaCustomers;

public interface SakilaCustomersRepository extends ReactiveMongoRepository<SakilaCustomers, Integer> 
{	
}
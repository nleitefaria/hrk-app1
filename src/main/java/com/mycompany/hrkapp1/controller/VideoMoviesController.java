package com.mycompany.hrkapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.hrkapp1.entity.VideoMovies;
import com.mycompany.hrkapp1.repository.VideoMoviesRepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class VideoMoviesController 
{
	@Autowired
	private VideoMoviesRepository repository;
	
	@ApiOperation(value = "Get all movies",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    ) 
	@RequestMapping(value = "/video/movies", method = RequestMethod.GET)
	public Flux<VideoMovies> findAll() 
	{
	  return repository.findAll();
	}
}

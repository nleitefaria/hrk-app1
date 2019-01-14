package com.mycompany.hrkapp1.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.hrkapp1.entity.VideoMovies;
import com.mycompany.hrkapp1.repository.VideoMoviesRepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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
	@GetMapping(value = "/video/movies")
	public Flux<ResponseEntity<VideoMovies>> findAll() 
	{
	  return repository.findAll()
			  .map(videoMovies -> ResponseEntity.ok(videoMovies))
              .defaultIfEmpty(ResponseEntity.notFound().build());
	}
	
	@ApiOperation(value = "Get movie by id",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    ) 
	@GetMapping("/video/movie/{id}")
    public Mono<ResponseEntity<VideoMovies>> findOne(@PathVariable(value = "id") String id) 
	{
        return repository.findById(new ObjectId(id))
                .map(videoMovie -> ResponseEntity.ok(videoMovie))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}

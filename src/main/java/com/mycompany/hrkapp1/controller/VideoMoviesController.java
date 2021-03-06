package com.mycompany.hrkapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mycompany.hrkapp1.entity.VideoMovies;
import com.mycompany.hrkapp1.service.VideoMoviesService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class VideoMoviesController 
{
	@Autowired
	VideoMoviesService service;
	
	@GetMapping(value = "/video/movies")
	public ResponseEntity<Flux<VideoMovies>> findAll() 
	{  
	  return new ResponseEntity<Flux<VideoMovies>>(service.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/video/movies/page/{pageNum}")
    public ResponseEntity<Mono<Page<VideoMovies>>> findAllPaged(@PathVariable(value = "pageNum") Integer pageNum) 
	{
		return new ResponseEntity<Mono<Page<VideoMovies>>>(service.listAllPaged(pageNum), HttpStatus.OK);
    }
	
	@GetMapping(value = "/video/movie/{id}")
    public ResponseEntity<Mono<VideoMovies>> findOne(@PathVariable(value = "id") String id) 
	{
		return new ResponseEntity<Mono<VideoMovies>>(service.findById(id), HttpStatus.OK);
    }
	
	
}

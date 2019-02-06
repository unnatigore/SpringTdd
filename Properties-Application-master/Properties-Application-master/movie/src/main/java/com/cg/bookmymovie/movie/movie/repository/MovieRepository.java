package com.cg.bookmymovie.movie.movie.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.bookmymovie.movie.movie.entity.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, Integer>{

}

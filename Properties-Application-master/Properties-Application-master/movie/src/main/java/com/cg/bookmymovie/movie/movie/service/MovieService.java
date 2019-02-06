package com.cg.bookmymovie.movie.movie.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.cg.bookmymovie.movie.movie.entity.Movie;
import com.cg.bookmymovie.movie.movie.exception.IllegalDateException;

public interface MovieService {

	void addNewMovie(Movie movie);
	
	List<Movie> getAllMovie();
	
	Optional<Movie> getMovieById(int movieId);
	
	public void updateMovieReleaseDate(int movieId, LocalDate releaseDate) throws IllegalDateException;
	
	
	void deleteMovies(Movie movie);
}
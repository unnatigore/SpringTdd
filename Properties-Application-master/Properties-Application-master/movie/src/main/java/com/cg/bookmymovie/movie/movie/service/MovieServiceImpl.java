package com.cg.bookmymovie.movie.movie.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.bookmymovie.movie.movie.entity.Movie;
import com.cg.bookmymovie.movie.movie.exception.IllegalDateException;
import com.cg.bookmymovie.movie.movie.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepository movieRepository;

	public void addNewMovie(Movie movie) {
		movieRepository.save(movie);
	}

	public List<Movie> getAllMovie() {

		return movieRepository.findAll();
	}

	public Optional<Movie> getMovieById(int movieId) {
		Optional<Movie> getMovie = movieRepository.findById(movieId);
		if (!getMovie.isPresent()) {
			return null;
		}

		return movieRepository.findById(movieId);
	}

	public void deleteMovies(Movie movie) {
		movieRepository.delete(movie);
	}

	public void updateMovieReleaseDate(int movieId, LocalDate releaseDate) throws IllegalDateException {

		Movie movie = movieRepository.findById(movieId).get();
		 if(LocalDate.now().compareTo(releaseDate)>0)
		{
			throw new IllegalDateException("release date can not be before current date");
		}
		movie.setReleaseDate(releaseDate);
		movieRepository.save(movie);

	}
}

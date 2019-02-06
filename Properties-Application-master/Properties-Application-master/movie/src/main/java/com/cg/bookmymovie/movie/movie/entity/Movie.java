package com.cg.bookmymovie.movie.movie.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Movie {
	@Id
	private Integer movieId;
	private String title;
	private String director;
	private String description;
	private RunningTime runtime;
	private LocalDate releaseDate;
	private List<Cast> Cast;
	private List<Crew> Crew;

	public Movie() {
		super();
	}

	public Movie(Integer movieId, String title, String director, String description, RunningTime runtime,
			LocalDate releaseDate, List<Cast> cast, List<Crew> crew) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.director = director;
		this.description = description;
		this.runtime = runtime;
		this.releaseDate = releaseDate;
		Cast = cast;
		Crew = crew;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public RunningTime getRuntime() {
		return runtime;
	}

	public void setRuntime(RunningTime runtime) {
		this.runtime = runtime;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public List<Cast> getCast() {
		return Cast;
	}

	public void setCast(List<Cast> cast) {
		Cast = cast;
	}

	public List<Crew> getCrew() {
		return Crew;
	}

	public void setCrew(List<Crew> crew) {
		Crew = crew;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", director=" + director + ", description="
				+ description + ", runtime=" + runtime + ", releaseDate=" + releaseDate + ", Cast=" + Cast + ", Crew="
				+ Crew + "]";
	}

}

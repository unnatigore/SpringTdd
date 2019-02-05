package com.cg.bookmymovie.theatreService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.bookmymovie.theatreService.entity.Theatre;

@Service
public interface TheatreService {

	void addNewTheatre(Theatre theatre);

	List<Theatre> getAllTheatres();

	void updateTheatre(Theatre theatre);

	void deleteTheatre(int theatreId);

	Object getTheatreById(int theatreId);

}
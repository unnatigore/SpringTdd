package com.cg.bookmymovie.theatreService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookmymovie.theatreService.entity.Theatre;
import com.cg.bookmymovie.theatreService.repository.TheatreRepository;

@Service
public class TheatreServiceImpl implements TheatreService {

	@Autowired
	private TheatreRepository theatreRepository;

	@Override
	public Optional<Theatre> getTheatreById(Integer theatreId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNewTheatre(Theatre theatre) {
		theatreRepository.save(theatre);
	}

	@Override
	public List<Theatre> getAllTheatres() {
		return theatreRepository.findAll();
	}

	@Override
	public void updateTheatre(Theatre theatre) {
		theatreRepository.save(theatre);

	}

	@Override
	public void deleteTheatre(int theatreId) {
		Optional<Theatre> theatre = theatreRepository.findById(theatreId);
		theatreRepository.deleteById(theatreId);

	}
	/*
	 * @Override public Object getTheatreById(int theatreId) { Optional<Theatre>
	 * theatre = theatreRepository.findById(theatreId); return theatre;
	 * 
	 * }
	 */

	@Override
	public void deleteTheatre(Theatre theatre) {
		// TODO Auto-generated method stub
		
	}
}

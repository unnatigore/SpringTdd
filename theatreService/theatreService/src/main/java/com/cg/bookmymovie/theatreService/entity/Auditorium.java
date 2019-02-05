package com.cg.bookmymovie.theatreService.entity;

import java.util.Set;

public class Auditorium {
	private String auditoriumName;
	private Set<Seat> seat;

	public Auditorium() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAuditoriumName() {
		return auditoriumName;
	}

	public void setAuditoriumName(String auditoriumName) {
		this.auditoriumName = auditoriumName;
	}

	public Set<Seat> getSeat() {
		return seat;
	}

	public void setSeat(Set<Seat> seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "Auditorium [auditoriumName=" + auditoriumName + ", seat=" + seat + "]";
	}

}

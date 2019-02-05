package com.cg.bookmymovie.theatreService.entity;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Theatre {
	@Id
	private int theatreId;
	private String theatreName;
	private Address theatreAddress;
	private Set<Auditorium> auditorium;

	public Theatre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public Address getTheatreAddress() {
		return theatreAddress;
	}

	public void setTheatreAddress(Address theatreAddress) {
		this.theatreAddress = theatreAddress;
	}

	public Set<Auditorium> getAuditorium() {
		return auditorium;
	}

	public void setAuditorium(Set<Auditorium> auditorium) {
		this.auditorium = auditorium;
	}

	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", theatreAddress=" + theatreAddress
				+ ", auditorium=" + auditorium + "]";
	}

	public void setTheatreAddress(String string, String string2, String string3, String string4) {
		// TODO Auto-generated method stub
		
	}

}

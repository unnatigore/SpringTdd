package com.cg.bookmymovie.theatreService.entity;

public class Seat {
	private int seatType;
	private int seatRow;

	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSeatType() {
		return seatType;
	}

	public void setSeatType(int seatType) {
		this.seatType = seatType;
	}

	public int getSeatRow() {
		return seatRow;
	}

	public void setSeatRow(int seatRow) {
		this.seatRow = seatRow;
	}

	@Override
	public String toString() {
		return "Seat [seatType=" + seatType + ", seatRow=" + seatRow + "]";
	}

}

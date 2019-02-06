
package com.cg.bookmymovie.theatreService.service;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.bookmymovie.theatreService.entity.Address;
import com.cg.bookmymovie.theatreService.entity.Auditorium;
import com.cg.bookmymovie.theatreService.entity.Seat;
import com.cg.bookmymovie.theatreService.entity.Theatre;

@RunWith(SpringRunner.class)

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TheatreServiceImplIntegrationTest {
	
	Theatre theatre1;
	
	@Autowired
	private TheatreService theatreService;

	@Test
	public void addTheatreFailedTest() throws Exception {

		Set<Seat> seatSet = new HashSet<Seat>();
		Set<Auditorium> auditoriumSet = new HashSet<Auditorium>();

		seatSet.add(new Seat("Balcony", "M", 12));
		auditoriumSet.add(new Auditorium("Kibe", seatSet));
		Address address = new Address("Prabhat Road", "Maharashtra", "Pune");
		theatre1 = new Theatre(1, "E-SQUARE", address, auditoriumSet);

	}
}

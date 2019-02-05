package com.cg.bookmymovie.theatreService.repository;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataMongoTest
public class TheatreServiceIntegrationTest {
	
	@Autowired
	private TheatreRepository theatreRepository;
	
	

}

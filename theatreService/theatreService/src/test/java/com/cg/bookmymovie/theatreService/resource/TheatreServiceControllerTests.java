package com.cg.bookmymovie.theatreService.resource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.bookmymovie.theatreService.entity.Theatre;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TheatreServiceControllerTests {

	@Autowired
	private TestRestTemplate testRestTemplate;
	
	@LocalServerPort
	int randomServerPort;

	@Test
	@Ignore
	public void noControllerTest() throws Exception {
		ResponseEntity<Resource> responseEntity = testRestTemplate.getForEntity("/theatres", 
				Resource.class);

		assertEquals((responseEntity.getStatusCode()), (HttpStatus.NOT_FOUND));
	}

	@Test
	@Ignore
	public void controllerWithNoUrlTest() throws Exception {
		ResponseEntity<Resource> responseEntity = testRestTemplate.getForEntity("/theatres",
				Resource.class);

		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
	}

	@Test
	@Ignore
	public void controllerWithWrongUrlTest() throws Exception {
		ResponseEntity<Resource> responseEntity = testRestTemplate.getForEntity("/theatres", 
				Resource.class);

		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
	}
	
	@Test
	public void testAddEmployeeWithoutHeader_success() throws URISyntaxException
	{
	    TestRestTemplate testRestTemplate = new TestRestTemplate();
	     
	    final String baseUrl = "http://localhost:"+randomServerPort+"/theatres/";
	    URI uri = new URI(baseUrl);
	     
	    Theatre theatre = new Theatre();
	 
	    ResponseEntity<String> result = testRestTemplate.postForEntity(uri, theatre, String.class);
	     
	    //Verify request succeed
	    Assert.assertEquals(200, result.getStatusCodeValue());
	}

}

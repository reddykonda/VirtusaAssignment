package com.virtusa.numbertoword.test;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.web.client.RestTemplate;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class NumberToWordTest {

	@LocalServerPort
    int randomServerPort;
	
	@Test
	public void testNumberToWordSuccess() throws URISyntaxException
	{
	 
		RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:" + randomServerPort + "/numberToWord/10";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	     
	    //Verify request succeed
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertEquals("ten", result.getBody());
	    
	}
	
	@Test
	public void testNumberToWordFail() throws URISyntaxException
	{
	 
		RestTemplate restTemplate = new RestTemplate();
	    
		//restTemplate.postForEntity(uri, request, String.class);
	    final String baseUrl = "http://localhost:" + randomServerPort + "/numberToWord/20";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	     
	    //Verify request succeed
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertEquals("ten", result.getBody());
	    
	}
	
}

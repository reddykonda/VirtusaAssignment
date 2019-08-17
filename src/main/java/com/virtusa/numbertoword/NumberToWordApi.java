package com.virtusa.numbertoword;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.numbertoword.service.NumberToWordService;

import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class NumberToWordApi {
    
	private final NumberToWordService numberToWordService;
	
	 @Autowired
	 public NumberToWordApi(final NumberToWordService numberToWordService) {
	    this.numberToWordService = numberToWordService;
	 }

	
	@GetMapping(value = "/numberToWord/{number}")
	public ResponseEntity<String> getNumberToWord(@PathVariable("number") final Integer number){
		return ResponseEntity.ok(numberToWordService.getNumberToWord(number));
	}
}

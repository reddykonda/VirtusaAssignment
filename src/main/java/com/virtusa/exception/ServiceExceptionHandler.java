package com.virtusa.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ServiceExceptionHandler {

	@ExceptionHandler
	public String handleInvalidFieldException(final InvalidFieldException exception) {
		 return exception.getMessage();
	}
}

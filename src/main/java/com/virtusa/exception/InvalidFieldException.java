package com.virtusa.exception;

@SuppressWarnings("serial")
public class InvalidFieldException extends Exception{

	public InvalidFieldException(final String errorMessage) {
		super(errorMessage);
	}
}

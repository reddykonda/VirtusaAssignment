package com.virtusa.numbertoword.service;

import com.virtusa.exception.InvalidFieldException;

public interface NumberToWordService {
    
	public String getNumberToWord(final Integer number) throws InvalidFieldException;
}

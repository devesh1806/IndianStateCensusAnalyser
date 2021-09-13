package com.indianstatecensusanalyser;


@SuppressWarnings("serial")
public class IndianStateCensusExeption extends Exception{
	public enum ExceptionType{
		Parse_Error,File_Not_Found
	}
	
	ExceptionType type;
	public IndianStateCensusExeption(String message,ExceptionType type) {
		super(message);
		this.type=type;
	}
}

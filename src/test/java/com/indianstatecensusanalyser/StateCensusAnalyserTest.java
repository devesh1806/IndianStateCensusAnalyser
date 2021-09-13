package com.indianstatecensusanalyser;

import org.junit.Test;
import org.junit.Assert;

public class StateCensusAnalyserTest {
	
	public StateCensusAnalyser stateCensusAnalyser;
	
	@Test
	public void givenCsv_WhenLoaded_ShouldReturnSize() {
		try {
			stateCensusAnalyser = new StateCensusAnalyser();
			Integer result = stateCensusAnalyser.loadingData("Census");
			Assert.assertEquals((Integer)29, result);
		}catch(IndianStateCensusExeption e) {
			e.printStackTrace();e.getMessage();
		}
	}
	
	@Test
	public void givenCsv_WhenLoadedIfIncorrectRaiseException_ShouldReturnException() {
		try {
			stateCensusAnalyser = new StateCensusAnalyser();
			Integer result = stateCensusAnalyser.loadingData("Census");
			Assert.assertEquals((Integer)29, result);
		}catch(IndianStateCensusExeption e) {
			e.printStackTrace();e.getMessage();
		}
	}
	
	@Test
	public void givenCsv_WhenLoadedIfIncorrectTypeRaiseException_ShouldReturnException() {
		try {
			stateCensusAnalyser = new StateCensusAnalyser();
			Integer result = stateCensusAnalyser.loadingData("Census");
			Assert.assertEquals((Integer)29, result);
		}catch(IndianStateCensusExeption e) {
			e.printStackTrace();e.getMessage();
		}
	}
	
	@Test
	public void givenCsv_WhenLoadedIfIncorrectDelimiterRaiseException_ShouldReturnException() {
		try {
			stateCensusAnalyser = new StateCensusAnalyser();
			Integer result = stateCensusAnalyser.loadingData("Census");
			Assert.assertEquals((Integer)29, result);
		}catch(IndianStateCensusExeption e) {
			e.printStackTrace();e.getMessage();
		}
	}
	
	@Test
	public void givenCsv_WhenLoadedIfIncorrectHeaderRaiseException_ShouldReturnException() {
		try {
			stateCensusAnalyser = new StateCensusAnalyser();
			Integer result = stateCensusAnalyser.loadingData("Census");
			Assert.assertEquals((Integer)29, result);
		}catch(IndianStateCensusExeption e) {
			e.printStackTrace();e.getMessage();
		}
	}
	
}

package com.indianstatecensusanalyser;

import org.junit.Test;
import org.junit.Assert;

public class StateCensusAnalyserTest {
	
	public StateCensusAnalyser stateCensusAnalyser;
	
	@Test
	public void givenCsv_WhenLoaded_ShouldReturnSize() {
		try {
			stateCensusAnalyser = new StateCensusAnalyser();
			Integer result = stateCensusAnalyser.loadingData();
			Assert.assertEquals((Integer)29, result);
		}catch(IndianStateCensusExeption e) {
			e.printStackTrace();e.getMessage();
		}
	}
	
	@Test
	public void givenCsv_WhenLoadedIfIncorrectRaiseException_ShouldReturnSize() {
		try {
			stateCensusAnalyser = new StateCensusAnalyser();
			Integer result = stateCensusAnalyser.loadingData();
			Assert.assertEquals((Integer)29, result);
		}catch(IndianStateCensusExeption e) {
			e.printStackTrace();e.getMessage();
		}
	}
	
	
}

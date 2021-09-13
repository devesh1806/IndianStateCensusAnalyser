package com.indianstatecensusanalyser;

import org.junit.Test;
import org.junit.Assert;

public class StateCensusAnalyserTest {
	
	public StateCensusAnalyser stateCensusAnalyser;
	
	@Test
	public void givenCsv_WhenLoaded_ShouldReturnSize() {
		
		stateCensusAnalyser = new StateCensusAnalyser();
		Integer result = stateCensusAnalyser.loadingData();
		Assert.assertEquals((Integer)29, result);
	}
	
}

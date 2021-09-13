package com.indianstatecensusanalyser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import com.opencsv.CSVReader;

public class StateCensusAnalyser {
	
	public static final String PathName = "./src/main/resources/IndiaStateCensusData.csv";
	public static final String PathNameState = "./src/main/resources/StateCode.csv";;
	public static List<CSVStateCensus> stateCensusArray = new ArrayList<>();
	public static List<CSVState> stateArray = new ArrayList<>();
	
	
	public int loadingData(String inputName) throws IndianStateCensusExeption {
		try {	
				CSVReader reader = new CSVReader(loadReader(inputName));
				List<String[]> records = reader.readAll();
				records.stream().forEach(n->{
					Iterator<String> rotate = Arrays.stream(n).iterator();
					if (inputName.equals("Census")) loadRecordCensus(rotate);
					else loadRecordState(rotate);
				});
			reader.close();
		}catch(IOException e) {
			throw new IndianStateCensusExeption(e.getMessage(), IndianStateCensusExeption.ExceptionType.File_Not_Found);
		}catch(IllegalStateException e) {
			throw new IndianStateCensusExeption(e.getMessage(), IndianStateCensusExeption.ExceptionType.Parse_Error);
		}catch(InputMismatchException e) {
			throw new IndianStateCensusExeption(e.getMessage(), IndianStateCensusExeption.ExceptionType.Parse_Error);
		}
		
		if (inputName.equals("Census"))return stateCensusArray.size();
		return stateArray.size();
	}

	private FileReader loadReader(String inputName) throws FileNotFoundException{
		if (inputName.equals("Census")) return new FileReader(PathName);
		return new FileReader(PathNameState);
	}
	
	private void loadRecordCensus(Iterator<String> rotate) {
		String state = rotate.next();
        String population = rotate.next();
        String areaInSqKm = rotate.next();
        String densityPerSqKm = rotate.next();
        if (!population.equals("Population")) stateCensusArray.add(new CSVStateCensus(state, Long.parseLong(population), Long.parseLong(areaInSqKm), Integer.parseInt(densityPerSqKm)));
        else if ((state.equals("State") && population.equals("Population") && areaInSqKm.equals("AreaInSqKm") && densityPerSqKm.equals("DensityPerSqKm"))!=true) {
        	throw new InputMismatchException("Wrong Header name");
        }
	}

	private void loadRecordState(Iterator<String> rotate) {
			String srNo = rotate.next();
            String stateName = rotate.next();
            String tin = rotate.next();
            String stateCode = rotate.next();
            if (!stateName.equals("State Name")) stateArray.add(new CSVState(Integer.parseInt(srNo), stateName, tin, stateCode));
	}
}

package com.indianstatecensusanalyser;

public class CSVState {
	public Integer srNo;
	public String stateName;
	public String tin;
	public String stateCode;
	
	public CSVState() {}
	
	public CSVState(Integer srNo,String stateName,String tin,String stateCode) {
		this.srNo=srNo;
		this.stateName=stateName;
		this.tin=tin;
		this.stateCode=stateCode;
	}
}

package com.everis.domain;


import java.util.List;

public class submissionManagementImpl implements submissionManagment {
	
	 String SAMPLE_XLSX_FILE_PATH = "C:\\workspace\\submissionReport\\resources\\testExcel.xlsx";
	 List<Submission> submissions;


	@Override
	public List<Submission> getAllSubmissions() {
		// TODO Auto-generated method stub
		return readFromExcel.getSubmissionsFromExcel(SAMPLE_XLSX_FILE_PATH);
	}

	@Override
	public void addSubmission(Submission submission) {
		submissions.add(submission);
		
	}

	@Override
	public void updateSubmission(Submission submission) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSubmission(Integer submissionId) {
		// TODO Auto-generated method stub
		
	}
	
	

}

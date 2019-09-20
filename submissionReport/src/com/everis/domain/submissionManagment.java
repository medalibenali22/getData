package com.everis.domain;

import java.util.List;

public interface submissionManagment {
	
	 void addSubmission(Submission submission);
	
	 void updateSubmission(Submission submission);
	 
	 void deleteSubmission(Integer submissionId);
	 
	  List<Submission> getAllSubmissions();
	 
	

}

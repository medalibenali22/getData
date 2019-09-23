package com.everis.domain;

public class Submission {
	
	String	sender;
	String 	submissionId;
	String	applicationNumber;
	String	formType;
	String	currentStates;
	String	receivingTime;
	String	stateTimestamp;
	String	comment;
	String	team;
	String status;
	
	public Submission(String sender, String submissionId, String applicationNumber, String formType,
			String currentStates, String receivingTime, String stateTimestamp, String comment, String team,
			String status) {
		super();
		this.sender = sender;
		this.submissionId = submissionId;
		this.applicationNumber = applicationNumber;
		this.formType = formType;
		this.currentStates = currentStates;
		this.receivingTime = receivingTime;
		this.stateTimestamp = stateTimestamp;
		this.comment = comment;
		this.team = team;
		this.status = status;
	}
	
	public Submission() {
		
	}


	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getSubmissionId() {
		return submissionId;
	}

	public void setSubmissionId(String submissionId) {
		this.submissionId = submissionId;
	}

	public String getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public String getFormType() {
		return formType;
	}

	public void setFormType(String formType) {
		this.formType = formType;
	}

	public String getCurrentStates() {
		return currentStates;
	}

	public void setCurrentStates(String currentStates) {
		this.currentStates = currentStates;
	}

	public String getReceivingTime() {
		return receivingTime;
	}

	public void setReceivingTime(String receivingTime) {
		this.receivingTime = receivingTime;
	}

	public String getStateTimestamp() {
		return stateTimestamp;
	}

	public void setStateTimestamp(String stateTimestamp) {
		this.stateTimestamp = stateTimestamp;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}

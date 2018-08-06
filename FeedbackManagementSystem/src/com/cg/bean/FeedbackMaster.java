package com.cg.bean;

public class FeedbackMaster 
{
	private int trainingCode;
	private int participantId;
	private int fbPresentationCommunication;
	private int fbClarifyDoubts;
	private int fbTimeManagement;
	private int fbHandOut;
	private int fbHardwareSoftwareNetwork;
	private String comments;
	private String suggestions;
	
	public int getTrainingCode() {
		return trainingCode;
	}
	public void setTrainingCode(int trainingCode) {
		this.trainingCode = trainingCode;
	}
	public int getParticipantId() {
		return participantId;
	}
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}
	public int getFbPresentationCommunication() {
		return fbPresentationCommunication;
	}
	public void setFbPresentationCommunication(int fbPresentationCommunication) {
		this.fbPresentationCommunication = fbPresentationCommunication;
	}
	public int getFbClarifyDoubts() {
		return fbClarifyDoubts;
	}
	public void setFbClarifyDoubts(int fbClarifyDoubts) {
		this.fbClarifyDoubts = fbClarifyDoubts;
	}
	public int getFbTimeManagement() {
		return fbTimeManagement;
	}
	public void setFbTimeManagement(int fbTimeManagement) {
		this.fbTimeManagement = fbTimeManagement;
	}
	public int getFbHandOut() {
		return fbHandOut;
	}
	public void setFbHandOut(int fbHandOut) {
		this.fbHandOut = fbHandOut;
	}
	public int getFbHardwareSoftwareNetwork() {
		return fbHardwareSoftwareNetwork;
	}
	public void setFbHardwareSoftwareNetwork(int fbHardwareSoftwareNetwork) {
		this.fbHardwareSoftwareNetwork = fbHardwareSoftwareNetwork;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getSuggestions() {
		return suggestions;
	}
	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}

}

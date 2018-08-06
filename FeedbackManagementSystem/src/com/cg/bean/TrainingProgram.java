package com.cg.bean;

import java.util.Date;

public class TrainingProgram {
	private int trainingCode;
	private int facultyId;
	private int courseId;
	private Date startDate;
	private Date endDate;
	public int getTrainingCode() {
		return trainingCode;
	}
	public void setTrainingCode(int trainingCode) {
		this.trainingCode = trainingCode;
	}
	
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}

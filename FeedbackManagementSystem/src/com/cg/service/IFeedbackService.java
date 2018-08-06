package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.CourseMaster;
import com.cg.exception.FeedbackException;

public interface IFeedbackService 
{
	public String verifyUser(String username, String password) throws FeedbackException;

	public ArrayList fetchFacultySkill() throws FeedbackException;
	public int addCourse(CourseMaster courseMaster) throws FeedbackException;
	public int updateCourse(CourseMaster courseMaster)throws FeedbackException;
	public CourseMaster retrieveCourse(int courseId)throws FeedbackException;
	public CourseMaster deleteCourse(int courseId)throws FeedbackException;
	public ArrayList<CourseMaster> retrieveAllCourse()throws FeedbackException;
	
}

package com.cg.service;

import java.util.ArrayList;

import com.cg.exception.FeedbackException;

public interface IFeedbackService 
{
	public String verifyUser(String username, String password) throws FeedbackException;

	public ArrayList fetchFacultySkill() throws FeedbackException;
	
}

package com.cg.dao;

import java.util.ArrayList;

import com.cg.exception.FeedbackException;

public interface IFeedbackDao {

	public String verifyUser(String username, String password) throws FeedbackException;

	public ArrayList fetchFacultySkill() throws FeedbackException;
}

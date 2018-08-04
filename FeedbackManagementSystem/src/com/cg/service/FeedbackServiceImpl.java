package com.cg.service;

import java.util.ArrayList;

import com.cg.dao.FeedbackDaoImpl;
import com.cg.dao.IFeedbackDao;
import com.cg.exception.FeedbackException;

public class FeedbackServiceImpl implements IFeedbackService
{
	IFeedbackDao dao=new FeedbackDaoImpl();
	@Override
	public String verifyUser(String username, String password) throws FeedbackException {
		return dao.verifyUser(username, password);
	}
	@Override
	public ArrayList fetchFacultySkill() throws FeedbackException {
	return dao.fetchFacultySkill();
	}

}

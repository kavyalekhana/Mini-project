package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.CourseMaster;
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
	@Override
	public int addCourse(CourseMaster courseMaster) throws FeedbackException {
		return dao.addCourse(courseMaster);
	}
	@Override
	public int updateCourse(CourseMaster courseMaster) throws FeedbackException {
		return dao.updateCourse(courseMaster);
	}
	@Override
	public CourseMaster retrieveCourse(int courseId) throws FeedbackException {
		return dao.retrieveCourse(courseId);
	}
	@Override
	public CourseMaster deleteCourse(int courseId) throws FeedbackException {
		return dao.deleteCourse(courseId);
	}
	@Override
	public ArrayList<CourseMaster> retrieveAllCourse() throws FeedbackException {
		return dao.retrieveAllCourse();
	}

}

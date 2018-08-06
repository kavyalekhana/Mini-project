package com.cg.dao;

import java.util.ArrayList;

import com.cg.bean.CourseMaster;
import com.cg.exception.FeedbackException;

public class FeedbackDaoImpl implements IFeedbackDao 
{

	@Override
	public String verifyUser(String username, String password) throws FeedbackException {
		
		return null;
	}

	@Override
	public ArrayList fetchFacultySkill() throws FeedbackException {
	
		ArrayList list =new  ArrayList<>();
		ArrayList innerlist=new ArrayList<>();
		
		return list;
	}

	@Override
	public int addCourse(CourseMaster courseMaster) throws FeedbackException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCourse(CourseMaster courseMaster) throws FeedbackException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CourseMaster retrieveCourse(int courseId) throws FeedbackException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseMaster deleteCourse(int courseId) throws FeedbackException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CourseMaster> retrieveAllCourse() throws FeedbackException {
		// TODO Auto-generated method stub
		return null;
	}

}

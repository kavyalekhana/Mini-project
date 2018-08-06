package com.cg.client;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.bean.CourseMaster;
import com.cg.exception.FeedbackException;
import com.cg.service.FeedbackServiceImpl;
import com.cg.service.IFeedbackService;

public class FeedbackClient 
{
	static String username;
    static String password;
    static Scanner input =null;
    static int choice;
    static IFeedbackService service=new FeedbackServiceImpl();
    
	public static void main(String args[]){
		input= new Scanner(System.in);
	    System.out.println("-----Login Page-----");
	    System.out.println("Log in:");
	    System.out.println("username: ");
	    username = input.next();
	    System.out.println("password: ");
	    password = input.next();
	    String role=null;
		try {
			role = service.verifyUser(username,password);
			switch(role){  
		    case "admin": 
		    	while(true) {
		    		System.out.println("-----Training Admin Page-----");
			    	System.out.println("[1.]	Faculty Skill Maintenance\r\n" + 
			    			"[2.]	Course Maintenance\r\n" + 
			    			"[3.]	View Feedback Report\r\n" + 
			    			"[4.]	Exit\r\n" );
			    	choice = input.nextInt();
			    	switch(choice){  
			        	case 1: 
			        		callFacultySkillMaintenance();
			        		break;  
			        	case 2: 
			        		callCourseMaintenance();
			        		break;  
			        	case 3: 
			        		callViewFeedbackReport();
			        		break;  
			        	case 4: 
			        		System.exit(0);
			        	default:
			        		System.out.println("Please Enter valid choice...??");  
			        }
			    	break; 
		    	}
		    	 
		    	
		    case "coordinator": 
		    	while(true) {
			    	System.out.println("-----Co-coordinator Page-----");
			    	System.out.println("[1.]	Training program Maintenance\r\n" + 
			    			"[2.]	Participant Enrollment\r\n" + 
			    			"[3.]	View Feedback Report\r\n" +
			    			"[4.]	Exit\r\n" );
			    	choice = input.nextInt();
			    	switch(choice){  
			        	case 1: 
			        		callTrainingProgramMaintenance();
			        		break;  
			        	case 2: 
			        		callParticipantEnrollment();
			        		break;  
			        	case 3: 
			        		callViewFeedbackReport();
			        		break;  
			        	case 4: 
			        		System.exit(0);
			        	default:
			        		System.out.println("Please Enter valid choice...??");  
			        }
			    	break; 
		    	}
		    	
		    case "participant": 
		    	System.out.println("-----Participant Page-----");
		    	System.out.println("[1.]	Feedback Entry");
		    	break;  
		    	
		    default:
		    	System.out.println("Please Enter valid Username or Password...??");  
		    	
	    }  
		} catch (FeedbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
	}

	private static void callTrainingProgramMaintenance() {
		// TODO Auto-generated method stub
		
	}

	private static void callParticipantEnrollment() {
		// TODO Auto-generated method stub
		
	}
	//To be done again
	private static void callFacultySkillMaintenance()  {
	 
		ArrayList list=new ArrayList();
		try {
			list=service.fetchFacultySkill();
		} catch (FeedbackException e) {
		
			e.printStackTrace();
		}
		
	}
	
	
	private static void callCourseMaintenance() {
		char ans='Y';
		int	courseId=0;
		CourseMaster courseMaster = new CourseMaster();
		do {
			System.out.println("-----Course Maintenance Page-----");
			System.out.println("Enter your Choice\n[1.]	Add new Course\n" + "[2.]	Update a Course\r\n" + "[3.]	Show a Course\r\n"
					+ "[4.]	Retrieve All\n" + "[5.] Delete a Course\n 	[6.] Exit\n");
			choice = input.nextInt();
			switch (choice) {
			case 1:
					System.out.println("Enter course Name");
					String courseName=input.next();
					courseMaster.setCourseName(courseName);
					System.out.println("Enter course Duration(in days)");
					int noOfDays=input.nextInt();
					courseMaster.setNoOfDays(noOfDays);
					try {
						courseId=service.addCourse(courseMaster);
						System.out.println("Course with Id "+courseId+" is generated");
					} catch (FeedbackException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					

				break;
			case 2:
					System.out.println("Enter course Id");
					courseId=input.nextInt();
					courseMaster.setCourseId(courseId);
					System.out.println("Enter course Name");
					courseName=input.next();
					courseMaster.setCourseName(courseName);
					System.out.println("Enter course Duration(in days)");
					noOfDays=input.nextInt();
					courseMaster.setNoOfDays(noOfDays);
					try {
						courseId=service.updateCourse(courseMaster);
						if(courseId!=0)
						{
						System.out.println("Course with Id "+courseId+" is updated");
						}
						else
						{
							throw new FeedbackException("Please enter a valid Id");
						}
					} catch (FeedbackException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				break;
			case 3: 
					System.out.println("Enter the course Id");
					courseId=input.nextInt();
					try {
						courseMaster=service.retrieveCourse(courseId);
						if(courseId!=0)
						{
						System.out.println("The course details for "+courseId+" are ");
						System.out.println("CourseId\t:\t"+courseMaster.getCourseId());
						System.out.println("CourseName\t:\t"+courseMaster.getCourseName());
						System.out.println("No.of Days\t:\t"+courseMaster.getNoOfDays());
						}
						else
						{
							throw new FeedbackException("Course with Id"+courseId+"not found");
						}
					} catch (FeedbackException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				break;
			case 4: 
					ArrayList<CourseMaster> courseList=new ArrayList<>();
					try {
						courseList=service.retrieveAllCourse();
						System.out.println("The course details are : ");
						for(CourseMaster course:courseList)
						{
							System.out.println("CourseId\t:\t"+course.getCourseId());
							System.out.println("CourseName\t:\t"+course.getCourseName());
							System.out.println("No.of Days\t:\t"+course.getNoOfDays());
		
						}
						
					} catch (FeedbackException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				break;
			case 5:
					System.out.println("Enter the course Id");
					courseId=input.nextInt();
					try {
						courseMaster=service.deleteCourse(courseId);
						if(courseId!=0)
						{
						System.out.println("The course details are : ");
						}
						else
						{
							throw new FeedbackException("Please enter valid courseId");
						}
					}catch (FeedbackException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				break;
			case 6:
				System.exit(choice);
				break;
			default:
				System.out.println("Enter a valid option");

			}
			System.out.println("Do you want to continue?Y/N");
			ans=input.next().charAt(0);
		} while (ans=='Y' || ans=='y');
		
		
	}
	private static void callViewFeedbackReport() 
	{	
		
	}
	
}

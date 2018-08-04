package com.cg.client;

import java.util.ArrayList;
import java.util.Scanner;

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
	
	private static void callFacultySkillMaintenance()  {
	 
		ArrayList list=new ArrayList();
		try {
			list=service.fetchFacultySkill();
		} catch (FeedbackException e) {
		
			e.printStackTrace();
		}
		
	}
	//yaha chhoda hain...yahi se shuru karo....will meet u all on monday at 6

	private static void callCourseMaintenance() {
		
		char ans='Y';
		do {
			System.out.println("-----Course Maintenance Page-----");
			System.out.println("[1.]	Add new Course\r\n" + "[2.]	Update a Course\r\n" + "[3.]	Show a Course\r\n"
					+ "[4.]	Detlete a Course\r\n" + "[5.] 	Exit\r\n");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				

				break;
			case 2:

				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.exit(choice);
				break;
			default:
				System.out.println("Enter a valid option");

			}
			System.out.println("Do you want to continue?Y/N");
			ans=input.next().charAt(0);
		} while (ans=='Y' || ans=='y');
		
		
	}
	private static void callViewFeedbackReport() {
		
		
	}
	
}

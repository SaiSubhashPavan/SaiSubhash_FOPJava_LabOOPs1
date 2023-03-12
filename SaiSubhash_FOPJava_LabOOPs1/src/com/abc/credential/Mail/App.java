package com.abc.credential.Mail;

import java.util.Scanner;

import com.abc.credential.employee.Employee;
import com.abc.credential.Service.Credentials;

public class App {

	public static void main(String[] args) {
		Employee employee=new Employee("Sai","Subhash");
		Credentials credentials=new Credentials();
		String email="";
		String newPassword;

		System.out.println("please enter the department from the following:");
        System.out.println("1. Technical ");		
	    System.out.println("2. Admin");
	    System.out.println("3. Human resource");
	    System.out.println("4. Legal");

	    Scanner scanner=new Scanner(System.in);
	     int  choice = scanner.nextInt();
	      if(choice==1) {
	    	   email=credentials.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"tech");


	      }else if(choice==2) {
	    	   email=credentials.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"admin");


	      }else if(choice==3) {
	    	   email=credentials.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"HR");


	      }else if(choice==4) {
	    	  email=credentials.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"legal");


	      }else {
	    	  System.out.println("Not a valid input !");
	    	  scanner.close();
	    	  System.exit(-1); 
	      }
	      newPassword=credentials.generatePassword();
	      credentials.showCredentials(employee.getFirstName(),employee.getLastName(),email,newPassword);

	 scanner.close();


	}

}
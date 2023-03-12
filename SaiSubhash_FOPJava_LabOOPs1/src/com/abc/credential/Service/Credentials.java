package com.abc.credential.Service;

public class Credentials {
	
	public String generatePassword() {
		
		
		String passwordSet= "0123456789!@#$%ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		char[] password=new char[8];
		
		for(int i=0;i<8;i++) {
			
			int rand=(int) (Math.random()*passwordSet.length());
			
			password[i]=passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	public String generateEmailAddress(String firstName,String lastName,String department) {
		
		    return firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+".abc.com";

	}
	public void showCredentials(String firstName,String lastName, String email,String passwordCreated) {

		System.out.println("Dear "+ firstName +" "+ lastName +" your generated credentials are as follows");
		
		System.out.println("Email --> "+ email);
		
		System.out.println("Password --> "+ passwordCreated);

	}

} 
package com.application.service;

import java.util.Random;

import com.application.model.Employee;

public class CredentialService {
   public char[] generatePassword() {
	String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters= "abcdefghijklmnopqrstuvwxyz";
	String numbers= "0123456789";
    String specialCharacters="!@#$%^&*_=+-/.?<>)";
    String values= (capitalLetters + smallLetters + numbers + specialCharacters);
    Random random =new Random();
    char[] password =new char[8]; 	
    for (int i=0; i<8; i++) {
    	password[i] = values.charAt(random.nextInt(values.length()));
    }
    return password; 
    }
   public String generateEmailAddress(String firstName,String lastName,String departmentName) 
   {
   String genratedEmail= firstName + lastName +"@"+departmentName+"company.com";
   return genratedEmail;
   }
   public void showCredentials(Employee employee, String email, char[] generatedPassword) {
  System.out.println("Dear" + employee.getFirstName() + "Your genrated credential are as follows-");
  System.out.println("Email is"  + email);
  System.out.println("Password is"  + generatedPassword);
   }
   
}
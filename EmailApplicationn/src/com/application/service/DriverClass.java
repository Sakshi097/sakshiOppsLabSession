package com.application.service;

import com.application.model.Employee;
import java.util.Scanner;
public class DriverClass {
  public static void main(String[] args) {
    Employee employee1 = new Employee("Sakshi", "Trimukhe");
		String generatedEmail;
        char[] generatedPassword;
        CredentialService cService =new CredentialService();
        Scanner sc = new Scanner (System.in);
        
        int choice;
    System.out.println("please select your department");
    
		System.out.println("1. Technical Department");
		System.out.println("2. Admin Department");
		System.out.println("3. Human Department");
		System.out.println("4. Legal Department");
		
		choice = sc.nextInt();
		
		if (choice ==1) {
			generatedEmail= cService.generateEmailAddress(employee1.getFirstName(), employee1.getLastName(), "Technical");
			generatedPassword= cService.generatePassword();
			cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		else if (choice ==2) {
				generatedEmail= cService.generateEmailAddress(employee1.getFirstName(), employee1.getLastName(), "Admin");
				generatedPassword= cService.generatePassword();
				cService.showCredentials(employee1, generatedEmail, generatedPassword);
			}
				else if (choice==3) {
				generatedEmail= cService.generateEmailAddress(employee1.getFirstName(), employee1.getLastName(), "Hr");
				generatedPassword= cService.generatePassword();
				cService.showCredentials(employee1, generatedEmail, generatedPassword);
			}	
			
			else if (choice==4) {
				generatedEmail= cService.generateEmailAddress(employee1.getFirstName(), employee1.getLastName(), "Legal");
				generatedPassword= cService.generatePassword();
				cService.showCredentials(employee1, generatedEmail, generatedPassword);
				
				}
			else System.out.println("Invalid");
			
			
     }}



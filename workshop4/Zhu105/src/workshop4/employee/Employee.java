/********************************************** 
Workshop 4 
Course:JAC444 - Semester2021Fall 
Last Name:Zhu 
First Name:David 
ID:105936107 
Section:NDD 
This assignment represents my own work in accordance with Seneca Academic Policy. 
Signature 
Date:10/17/2021 
**********************************************/
package workshop4.employee;

import workshop4.Payable;

public abstract class Employee implements Payable{

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	//Constructor
	public Employee(){
		setFirstName("");
		setLastName("");
		setSocialSecurityNumber("");
	}
	
	public Employee(String firstName, String lastName, String socialSecurityNumber){
		setFirstName(firstName);
		setLastName(lastName);
		setSocialSecurityNumber(socialSecurityNumber);
	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityNumber="
				+ socialSecurityNumber + "]";
	}

	//getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumer() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}	
}

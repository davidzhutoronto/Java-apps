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

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;
	
	public HourlyEmployee(){
		setWage(0.0);
		setHours(0.0);
	}
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours){
		super(firstName, lastName, socialSecurityNumber);
		setWage(wage);
		setHours(hours);
	}
	
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		if(wage > 0) {
			this.wage = wage;
		}else {
			throw new IllegalArgumentException("Wage should be greater than 0.0");
		}
		
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		
		if(hours > 0.0 && hours < 168.0) {
			this.hours = hours;
		}else {
			throw new IllegalArgumentException("Hours is between 0.0 and 168.0");
		}
	}
	
	@Override
	public String toString() {
		return super.getFirstName() + " " + super.getLastName() + " SSN: " + super.getSocialSecurityNumer() + " HourlyEmployee [wage=" + getWage() + ", hours=" + getHours() + "]";
	}
	
	public double getPaymentAmount() {
		double payment = 0;
		if(getHours() > 40) {
			payment = 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}else {
			payment = getWage() * getHours();
		}
		return payment;
	}
	
	
}

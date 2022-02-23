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

public class SalariedEmployee extends Employee{
	private double weeklySalary;

	public SalariedEmployee(){
		setWeeklySalary(0.0);
	}
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
		super(firstName, lastName, socialSecurityNumber);
		setWeeklySalary(weeklySalary);
	}
	
	@Override
	public String toString() {
		return  super.getFirstName() + " " + super.getLastName() + " SSN: " + super.getSocialSecurityNumer() + "SalariedEmployee [weeklySalary=" + getWeeklySalary() + "]";
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if(weeklySalary > 0.0) {
			this.weeklySalary = weeklySalary;
		}else {
			throw new IllegalArgumentException("Weekly salary should not be less than 0.0");
		}
	}
	
	public double getPaymentAmount() {
		return getWeeklySalary();
	}
	
}

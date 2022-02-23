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

public class BasePlusCommissionEmployee extends CommissionEmployee{
	double baseSalary;

	public BasePlusCommissionEmployee(){
		super();
		setBaseSalary(0.0);
	}
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate, double baseSalary){
		super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate);
		setBaseSalary(baseSalary);
	}
	
	
	public double getPaymentAmount() {
		return super.getCommissionRate() * super.getGrossSales() + 1.1 * getBaseSalary();
	}
	
	
	//getters and setters
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary > 0.0) {
			this.baseSalary = baseSalary;
		}else {
			throw new IllegalArgumentException("Base salary should not be less than 0.0");
		}
	}

	@Override
	public String toString() {
		return  super.getFirstName() + " " + super.getLastName() + " SSN: " + super.getSocialSecurityNumer() + "Commission Rate: "+ super.getCommissionRate() + "Gross Sale: " + super.getGrossSales() + " BasePlusCommissionEmployee [baseSalary=" + getBaseSalary() + "]";
	}
	
}

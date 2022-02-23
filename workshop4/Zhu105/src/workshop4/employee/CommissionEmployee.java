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

public class CommissionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(){
		super();
		setGrossSales(0.0);
		setCommissionRate(0.0);
	}

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate){
		super(firstName, lastName, socialSecurityNumber);
		setGrossSales(grossSale);
		setCommissionRate(commissionRate);
	}
	
	
	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales)  {
		if(grossSales > 0.0) {
			this.grossSales = grossSales;
		} else {
			throw new IllegalArgumentException("Error! Only positive numbers");
			
		}
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if(commissionRate <= 1.0 && commissionRate >= 0.0) {
			this.commissionRate = commissionRate;
		}else {
			throw new IllegalArgumentException("Commission Rate is between 0.0 and 1.0");
		}
	}

	public double getPaymentAmount() {
		return getGrossSales() * getCommissionRate();
	}
	
	@Override
	public String toString() {
		return  super.getFirstName() + " " + super.getLastName() + " SSN: " + super.getSocialSecurityNumer() + "CommissionEmployee [grossSales=" + getGrossSales() + ", commissionRate=" + getCommissionRate() + "]";
	}
	
}

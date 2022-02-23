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
package workshop4;

import workshop4.employee.BasePlusCommissionEmployee;
import workshop4.employee.CommissionEmployee;
import workshop4.employee.HourlyEmployee;
import workshop4.employee.SalariedEmployee;
import workshop4.invoice.Invoice;

public class TestPayable {

	public static void main(String[] args) {
		
		Payable firstInvoice = new Invoice("Apple", "Fruit", 3, 1.5);
		System.out.println(firstInvoice.toString() + "Payable: " + firstInvoice.getPaymentAmount());
		
		Payable secondInvoice = new Invoice("Beef", "Meat", 5, 2.5);
		System.out.println(secondInvoice.toString() + "Payable: " + secondInvoice.getPaymentAmount());
		

		try {
			Payable firstSalariedEmployee = new SalariedEmployee("John", "Smith", "123-456-789", 456.6);
			System.out.println(firstSalariedEmployee.toString() + "Payable: " + firstSalariedEmployee.getPaymentAmount());
		}catch(IllegalArgumentException ex) {
			System.out.println("Exception: Invalid Entry");
		}

		try {
			Payable firstHourlyEmployee = new HourlyEmployee("David", "Beckham", "987-634-321", 100.0, 45.5);
			System.out.println(firstHourlyEmployee.toString() + "Payable: " + firstHourlyEmployee.getPaymentAmount());
		}catch(IllegalArgumentException ex) {
			System.out.println("Exception: Invalid Entry");
		}
		
		try {
			Payable firstCommissionEmployee = new CommissionEmployee("Jack", "Jones", "957-654-321", 100000.0, 0.1);
			System.out.println(firstCommissionEmployee.toString() + "Payable: " + firstCommissionEmployee.getPaymentAmount());
		}catch(IllegalArgumentException ex) {
			System.out.println("Exception: Invalid Entey");
		}
		
		
		try {
			Payable firstBasePlusCommissionEmployee = new BasePlusCommissionEmployee("Mary", "Smith", "987-654-123", 500000.0, 0.1, 1000*1.1);
			System.out.println(firstBasePlusCommissionEmployee.toString() + "Payable: " + firstBasePlusCommissionEmployee.getPaymentAmount());
		}catch(IllegalArgumentException ex) {
			System.out.println("Exception: Invalid Entry");
		}		
	}

}

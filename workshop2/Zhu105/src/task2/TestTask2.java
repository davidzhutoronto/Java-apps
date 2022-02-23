/**********************************************
Workshop #2
Course:<JAC444> - r
Last Name:<ZHU>
First Name:<DAVID>
ID:<105936207>
Section:<NDD>
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature David Zhu
Date:<10/3/2021>
**********************************************/
package task2;

import java.util.Scanner;

public class TestTask2 {

	public static void main(String[] args) {
	
		
		System.out.println("Canadian Federal Personal Income Tax Calculator");
		System.out.println("");
		int mainSelection = 5;
		//main menu
		do {	
			while(mainSelection != 1 && mainSelection != 2 && mainSelection != 0) {
				System.out.println("1. Compute personal income tax");
				System.out.println("2. Print tax tables");
				System.out.println("0. Exit");
				System.out.print("Please choose one: ");
				Scanner scan = new Scanner(System.in);
				mainSelection = scan.nextInt();
				System.out.println("");
				if(mainSelection == 1) {
					IncomeTax incomeTax = new IncomeTax();
					System.out.println("0 - single filer");
					System.out.println("1 - married jointly or qualifying widow(er)");
					System.out.println("2 - married separately");
					System.out.println("3 - head of household)");
					System.out.print("Enter the filing status: ");
					int filler = scan.nextInt();
					System.out.print("Enter the Taxable Income: $");
					int income = scan.nextInt();
					int tax = incomeTax.getTax2009(income, filler);
					System.out.print("Tax is: $" + tax);
					System.out.println("");
					System.out.println("");
					mainSelection = 5;
				} else if (mainSelection == 2) {
					
					System.out.print("Please enter the amount From: $");
					int amountFrom, amountTo;
					amountFrom =scan.nextInt();
					System.out.print("Enter the amount To: $");
				    amountTo =scan.nextInt();
					
				    // table
				    IncomeTax tax = new IncomeTax();
				    tax.print(amountFrom, amountTo);
				    System.out.println("");
				    System.out.println("");
				    mainSelection = 5;
				} else if (mainSelection == 0) {
				} else {
					System.out.println("Please enter a valid number: ");
				}
			}
		} while (mainSelection != 0);
		
	}

}

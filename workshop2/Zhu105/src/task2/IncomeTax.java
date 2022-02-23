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

public class IncomeTax {
//constant data
	
	int interval = 0;
	int[] fillingStatus;
	double[] rates;
	int income = 0;
	int[][] interval2001 = {
			{27050, 65550, 136750, 297350},
			{45200, 109250, 166500, 297350},
			{22600, 54625, 83250, 148675},
			{36250, 93650, 151650, 297350}
	};
	double[] rate2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
	
	 int[][] interval2009 = {
				{8350, 33950, 82250, 171550, 372950},
				{16700, 67900, 137050, 20885, 372950},
				{8350, 33950, 68525, 104425, 186475},
				{11950, 45500, 117450, 190200, 372950}
		};
	double[] rate2009 = {0.1, 0.15, 0.25, 0.28, 0.33, .035};
	
	//constructors

	IncomeTax(){
	
	}
	
	
	IncomeTax(int[] fillingStatus, int intervals, double[] rates, int taxableIncome){
		this.interval = intervals;
		this.fillingStatus = fillingStatus;
		setRate(rates);
		this.income = taxableIncome;
	}
	
	//setters & getters
	
	public int[][] getIntervals2001() {
		return interval2001;
	}
	
	public int[][] getIntervals2009() {
		return interval2009;
	}
	
	public double[] getRates2001() {
		return rate2001;
	}
	
	public void setRate(double[] rate) {
		this.rate2001 = rate;
	}
	
	public void setRate2001(double[] rate2001) {
		this.rate2001 = rate2001;
	}
	
	public double[] getRates2009() {
		return rate2009;
	}
	

	
	public int getTax2001(int income, int filingStatus) {
		int tax = 0;
		for (int i = rate2001.length-2; i >= 0; i--) {
			
			if (income > interval2001[filingStatus][i]) {
				tax += (income - interval2001[filingStatus][i]) * rate2001[i + 1];
				income = interval2001[filingStatus][i];
			}
			if (income <= interval2001[filingStatus][0]) {
				tax += income * rate2001[0];
			}
		}
		return tax;
	}
	
	public int getTax2009(int income, int filingStatus) {
		int tax = 0;
		for (int i = rate2009.length-2; i >= 0; i--) {
			
			if (income > interval2009[filingStatus][i]) {
				tax += (income - interval2009[filingStatus][i]) * rate2009[i + 1];
				income = interval2009[filingStatus][i];
			}
			if (income <= interval2009[filingStatus][0]) {
				tax += income * rate2009[0];
			}
		}
		return tax;
	}
	
	//print...
	public void print(int amountFrom, int amountTo) {
		System.out.println("Table 1: 2001 tax tables for taxable income from $" + amountFrom + " to $" + amountTo);
		 
		System.out.println(
				"---------------------------------------------------------------------\n" +
				"Income	       Single      Married Joint       Married        Head of\n" +
				"         		or Qualifying         Filling         a House\n" +
				"                          Widow(er)    	     Separately\n"+
				"---------------------------------------------------------------------");
		for(int i = amountFrom; i<=amountTo; i+=1000) {
			System.out.print(i);
			for(int j = 0; j<4; j++) {
				System.out.print("          "+ getTax2001(i, j));
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Table 2: 2009 tax tables for taxable income from $" + amountFrom + " to $" + amountTo);
		System.out.println(
				"---------------------------------------------------------------------\n" +
				"Income	       Single      Married Joint       Married        Head of\n" +
				"         		or Qualifying         Filling         a House\n" +
				"                          Widow(er)    	     Separately\n"+
				"---------------------------------------------------------------------");
		for(int i = amountFrom; i<=amountTo; i+=1000) {
			System.out.print(i);
			for(int j = 0; j<4; j++) {
				System.out.print("          "+ getTax2009(i, j));
			}
			System.out.println("");
		}
	}
}

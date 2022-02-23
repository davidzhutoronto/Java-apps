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
package task1;

public class Task1 {
	final static int PEOPLE = 4;
	final static int PRODUCT = 5;
	final static int MAXVALUE = 10000 ;
	public static void main(String[] args) {
	
		//create 100 random sales slips, pass to constructor
		SalesSlips[] rec = new SalesSlips[100];
		for(int i = 0; i < 100; i++) {
			rec[i] = new SalesSlips(1+(int)(Math.random()*PEOPLE), 
					1+(int)(Math.random()*PRODUCT), 
					(int)(Math.random()*MAXVALUE)); //constructor
		}
		
		
		//create a 4 by 5 table
		double[][] sales = new double[4][5];
		
		for(int i = 0; i < 100; i++) {
			int people = rec[i].getPeople();
			int product = rec[i].getProduct();
			double price = rec[i].getPrice();
			
			sales[people-1][product-1] += price;
			
		} //loop 100 times and add price to total accordingly
		
		
		//printing...
		System.out.println("Prod/Person        1               2               3               4               Total");
		for(int i = 0; i < PRODUCT; i++) {
			double personTotal = 0.0;
			System.out.print(i+1 +"                  ");
			
			for(int j = 0; j < PEOPLE; j++) {
				System.out.print(String.format("%.2f",sales[j][i]) + "          ");
				personTotal += sales[j][i];
			}
			System.out.print(String.format("%.2f",personTotal));
			System.out.println("");
		}
		
		
		//last row
		System.out.print("Total              ");
		for(int i = 0; i < PEOPLE; i++) {
			double productTotal = 0.0;
			
			for(int j = 0; j < PRODUCT; j++) {
				productTotal += sales[i][j];
				
			}
			System.out.print(String.format("%.2f",productTotal) + "          ");
			
		}
	}
}

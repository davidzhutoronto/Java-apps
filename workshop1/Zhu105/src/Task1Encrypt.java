/**********************************************
Workshop 1
Course:JAC444 - Semester2021Fall
Last Name:Zhu
First Name:David
ID:105936107
Section:NDD
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:9/26/2021
**********************************************/

import java.io.IOException;
import java.util.Scanner;

public class Task1Encrypt {

	public static void main(String[] args) throws IOException {
		int key;
		
	//	key=System.in.read();
		System.out.print("Please enter a 4-digit integer number: ");
		Scanner scan = new Scanner(System.in);
		key = scan.nextInt();
		
		while (key > 9999) {
			System.out.println("Invalid value, please enter an integer from 0000 to 9999.");
			System.out.print("Please enter again: ");
			key = scan.nextInt();
		}
		
		int a = key / 1000;
		int b = (key - a * 1000) / 100;
		int c = (key - a * 1000 - b * 100 ) / 10;
		int d = (key - a * 1000 - b * 100 - c * 10);
		
		a = (a + 7) % 10;
		b = (b + 7) % 10;
		c = (c + 7) % 10;
		d = (d + 7) % 10;
		
		int newKey = 1000 * c + 100 * d + 10 * a + b;
		
		
		if (newKey < 1000)
		{
		System.out.print("Your encrypted integer is: 0"+newKey);
		} 
		else {
			System.out.print("Your encrypted integer is: "+newKey);
		}
	}
}

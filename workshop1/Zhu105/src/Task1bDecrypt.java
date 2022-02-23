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

import java.util.Scanner;

public class Task1bDecrypt {

	public static void main(String[] args) {
		int key;
		System.out.print("Please enter your encrypted 4-digit integer number: ");
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
		
		//swap
		int temp1 = a;
		
		a = c; 
		c = temp1;
		
		int temp2 = b;
		b = d;
		d = temp2;
		
		if (a-7 <= 0) {
			a += 3;
		} else {
			a -= 7;
			}
		
		if (b-7 <= 0) {
			b += 3;
		} else {
			b -= 7;
			}
		
		if (c-7 <= 0) {
			c += 3;
		} else {
			c -= 7;
			}
		
		if (d-7 <= 0) {
			d += 3;
		} else {
			d -= 7;
			}
		
		System.out.print("Your original number is: ");
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
	
		
		
	}

}

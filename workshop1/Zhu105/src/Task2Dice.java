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

public class Task2Dice {

	public static void main(String[] args) {
	
		int input = 5;
		
		while(input != 1 && input != 0) {
			System.out.println("Please enter 1 to start the game or 0 to end the game");
			Scanner scan = new Scanner(System.in);
			input = scan.nextInt();
			
			if (input ==0) {
				System.out.println("Game Ended");
			} else if (input == 1) {
				int sum;
				int die1 = (int) (1+(Math.random() * 6));
				int die2 = (int) (1+(Math.random() * 6));
				sum = die1 + die2;
				System.out.println("You rolled:");
				System.out.println("Die1: " + die1);
				System.out.println("Die2: " + die2);
				System.out.println("Sum: " + sum);
				
				if (sum == 7 || sum == 11) {
					System.out.println("Congratulations, You win");
				} else if (sum == 2 || sum == 3 || sum == 12) {
					System.out.println("Craps, Better Luck Next Time, You lose");
				} else {
					
					int point = sum;
				    
					do {
						die1 = (int) (1+(Math.random() * 6));
						die2 = (int) (1+(Math.random() * 6));
						sum = die1 + die2;
						System.out.println("You rolled:");
						System.out.println("Die1: " + die1);
						System.out.println("Die2: " + die2);
						System.out.println("Sum: " + sum);
						if( sum == 7) {
							System.out.println("Craps, Better Luck Next Time, You lose");
						} else if (sum == point) {
							System.out.println("Congratulations, You win");
						}	
					}while (point != sum && sum != 7) ;
				}
			}
			
		}
	}

}

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

public class Task3ModCraps {

	public static void main(String[] args) {
		String chatter = null;
		int bankBalance = 1000;
		int wager = 0;
		boolean flag = false; 
		
		do {
			int input = 2;
			while(input != 1 && input != 0) {
				System.out.println("Please enter 1 to start the game or 0 to end the game");
				Scanner scan = new Scanner(System.in);
				input = scan.nextInt();
				
				if (input ==0) {
					flag = true;
					System.out.println("Game Ended");
					System.out.println("Your balance: " + bankBalance);
				} else if (input == 1) {
					do {
						System.out.print("Please enter Wager: ");
						
						wager = scan.nextInt();
						if(wager > bankBalance) {
							System.out.println("Wager is higer than you bank balance: " + bankBalance);
						}
					} while (wager > bankBalance);
					int sum;
					int die1 = (int) (1+(Math.random() * 6));
					int die2 = (int) (1+(Math.random() * 6));
					sum = die1 + die2;
					System.out.println("You rolled:");
					System.out.println("Die1: " + die1);
					System.out.println("Die2: " + die2);
					System.out.println("Sum: " + sum);
					
					if (sum == 7 || sum == 11) {
						chatter = chatter();
						System.out.println(chatter);
						System.out.println("Congratulations, You win");
						bankBalance += wager;
						System.out.println("Your Balance: " + bankBalance);
					} else if (sum == 2 || sum == 3 || sum == 12) {
						System.out.println("Craps, Better Luck Next Time, You lose");
						bankBalance -= wager;
						System.out.println("Your Balance: " + bankBalance);
					} else {
						
						int point = sum;
					    
						do {
							int confirm;
							do {
								System.out.print("Please enter 1 to continue: ");
								confirm = scan.nextInt();
							}
							while (confirm != 1);
							die1 = (int) (1+(Math.random() * 6));
							die2 = (int) (1+(Math.random() * 6));
							sum = die1 + die2;
							System.out.println("You rolled:");
							System.out.println("Die1: " + die1);
							System.out.println("Die2: " + die2);
							System.out.println("Sum: " + sum);
							chatter = chatter();
							System.out.println(chatter);
							
							
							if( sum == 7) {
								System.out.println("Craps, Better Luck Next Time, You lose");
								bankBalance -= wager;
								System.out.println("Your Balance: " + bankBalance);
							} else if (sum == point) {
								
								System.out.println("Congratulations, You win");
								bankBalance += wager;
								System.out.println("Your Balance: " + bankBalance);
							}	
						} while (point != sum && sum != 7) ;
					}
				} 
				if (bankBalance <= 0) {
					flag = true;
					System.out.println("Sorry. You busted!");
				}
			}
			
		}while (bankBalance > 0 && flag == false);
	}
		
	public static String chatter() {
		String chatter = null;
		int index = (int) (Math.random() * 3);
		if(index == 0) {
			chatter = "Oh, you’re going for broke, huh?";
		} else if(index == 1) {
			chatter = "Aw c’mon, take a chance!";
		} else if(index == 2) {
			chatter = "You’re up big. Now’s the time to cash in your chips!";
		}
		return chatter;
	}
	
	
}

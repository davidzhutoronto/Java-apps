package task2;

import java.util.Scanner;

public class TestTask2 {

	public static void main(String[] args) {
		
		int option = 1;
		int month, day, year, dayOfYear;
		String stringMonth;
		
		while(option != 4) {
			
			System.out.println("Enter 1 for format: MM/DD/YYYY");
			System.out.println("Enter 2 for format: Month DD, YYYY");
			System.out.println("Enter 3 for format: DDD YYYY");
			System.out.println("Enter 4 to exit");
			
			
			Scanner input = new Scanner(System.in);
			
			//check if user input is integer
			do {
				System.out.print("Choice: ");
				while(!input.hasNextInt()) {
					System.out.println("That's not a number!");
					System.out.print("Choice: ");
					input.next();
				}
				option = input.nextInt();
			} while(option <= 0);
			
			
			switch(option) {
				case 1:
					do {
						System.out.print("Enter Month(1-12): ");
						while(!input.hasNextInt()) {
							System.out.println("That's not a number!");
							System.out.print("Enter Month(1-12): ");
							input.next();
						}
						month = input.nextInt();
						while (month < 1 || month > 12) {
							System.out.println("Invalid month");
							System.out.print("Enter Month(1-12): ");
							while(!input.hasNextInt()) {
								System.out.println("That's not a number!");
								System.out.print("Enter Month(1-12): ");
								input.next();
							}
							month = input.nextInt();
						}
					} while(month <= 0);
					
					do {
						System.out.print("Enter Day of Month: ");
						while(!input.hasNextInt()) {
							System.out.println("That's not a number!");
							System.out.print("Enter Day(1-31): ");
							input.next();
						}
						day = input.nextInt();
						while (day < 1 || day > 31) {
							System.out.println("Invalid day");
							System.out.print("Enter Day(1-31): ");
							while(!input.hasNextInt()) {
								System.out.println("That's not a number!");
								System.out.print("Enter Day(1-31): ");
								input.next();
							}
							day = input.nextInt();
						}
					} while(day <= 0);
					
					do {
						System.out.print("Enter Year: ");
						while(!input.hasNextInt()) {
							System.out.println("That's not a number!");
							System.out.print("Enter Year: ");
							input.next();
						}
						year = input.nextInt();
						while (year < 1 || year > 9999) {
							System.out.println("Invalid year");
							System.out.print("Enter Year ");
							while(!input.hasNextInt()) {
								System.out.println("That's not a number!");
								System.out.print("Enter Year: ");
								input.next();
							}
							year = input.nextInt();
						}
					} while(year <= 0);
					
				
					
					//call first constructor
					MyDate firstDate = new MyDate(month, day, year);
					firstDate.printDate();
					break;
			
				case 2:
					System.out.print("Enter Month by Spelling: ");
					stringMonth = input.next();			
					
					while (!stringMonth.toLowerCase().equals("january") &&
							!stringMonth.toLowerCase().equals("february") &&
							!stringMonth.toLowerCase().equals("march") && 
							!stringMonth.toLowerCase().equals("april") && 
							!stringMonth.toLowerCase().equals("may") &&
							!stringMonth.toLowerCase().equals("june") && 
							!stringMonth.toLowerCase().equals("july") && 
							!stringMonth.toLowerCase().equals("august") && 
							!stringMonth.toLowerCase().equals("september") && 
							!stringMonth.toLowerCase().equals("october") && 
							!stringMonth.toLowerCase().equals("november") &&
							!stringMonth.toLowerCase().equals("december")) {
						
						System.out.println("Please check spelling");
						System.out.print("Enter Month by Spelling: ");
						stringMonth = input.next();
					}
					
					
					do {
						System.out.print("Enter Day of Month: ");
						while(!input.hasNextInt()) {
							System.out.println("That's not a number!");
							System.out.print("Enter Day(1-31): ");
							input.next();
						}
						day = input.nextInt();
						while (day < 1 || day > 31) {
							System.out.println("Invalid day");
							System.out.print("Enter Day(1-31): ");
							while(!input.hasNextInt()) {
								System.out.println("That's not a number!");
								System.out.print("Enter Day(1-31): ");
								input.next();
							}
							day = input.nextInt();
						}
					} while(day <= 0);
									
					System.out.print("Enter Year: ");
					year = input.nextInt();
					
					while (year < 1 || year > 9999) {
						System.out.println("Invalid day");
						System.out.print("Enter Day(1-9999): ");
						year = input.nextInt();
					}
					
					//call second constructor
					MyDate secondDate = new MyDate(stringMonth, day, year);
					secondDate.printDate();
					break;
					
				case 3:
					
					do {
						System.out.print("Enter Day of Year: ");
						while(!input.hasNextInt()) {
							System.out.println("That's not a number!");
							System.out.print("Enter Day(1-365): ");
							input.next();
						}
						dayOfYear = input.nextInt();
						while (dayOfYear < 1 || dayOfYear > 365) {
							System.out.println("Invalid day of year");
							System.out.print("Enter Day(1-365): ");
							while(!input.hasNextInt()) {
								System.out.println("That's not a number!");
								System.out.print("Enter Day(1-365): ");
								input.next();
							}
							dayOfYear = input.nextInt();
						}
					} while(dayOfYear <= 0);
					
					do {
						System.out.print("Enter Year: ");
						while(!input.hasNextInt()) {
							System.out.println("That's not a number!");
							System.out.print("Enter Year: ");
							input.next();
						}
						year = input.nextInt();
						while (year < 1 || year > 9999) {
							System.out.println("Invalid year");
							System.out.print("Enter Year ");
							while(!input.hasNextInt()) {
								System.out.println("That's not a number!");
								System.out.print("Enter Year: ");
								input.next();
							}
							year = input.nextInt();
						}
					} while(year <= 0);		
					
					//call third constructor
					MyDate thirdDate = new MyDate(dayOfYear, year);
					thirdDate.printDate();
					break;
			}
			
		}
		
	}
}

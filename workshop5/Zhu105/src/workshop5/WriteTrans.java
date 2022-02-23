
/**********************************************
Workshop 5
Course:JAC444 - Semester2021Fall
Last Name:Zhu
First Name:David
ID:105936107
Section:NDD
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:10/30/2021
**********************************************/
package workshop5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WriteTrans {
	private static ObjectOutputStream output;
	
	
	public static void main(String[] args) {
		openFile();
		addRecords();			
	}

	
	private static void addRecords() {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("%s%n%s%n", "Enter account number "
				+ "and balance.","Enter end-of-file indicator to end input.");

		while(scan.hasNext())
		{
			try {
				TransactionRecord tr = new TransactionRecord(scan.nextInt(), scan.nextDouble());
				output.writeObject(tr);
			}catch (NoSuchElementException eex)
			{
				System.err.println("Invalid input. Please try again.");
				scan.nextLine();
			}
			catch(IOException ex) {
				System.err.println("Error Writting to the file");
				ex.printStackTrace();
				break;
			}
			
		}
	}

	private static void openFile() {
		try {
			output = new ObjectOutputStream(new FileOutputStream("trans.txt"));
		}catch (IOException ex) {
			System.err.println("Error openning the file.");
		}
	}
}

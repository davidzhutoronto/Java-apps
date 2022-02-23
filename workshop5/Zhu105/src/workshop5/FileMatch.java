
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


import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import workshop5.Account;

public class FileMatch {
	private static ObjectInputStream input;
	private static ObjectOutputStream output;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		//count lines in oldmast.txt and trans.txt
		//BufferedReader reader = new BufferedReader(new FileReader("oldmast.txt"));
		
		openOldMastFile();
		int oldMastLines = 0;
		try {
			while(true)
			{
			Account record = (Account)input.readObject();
			oldMastLines++;
			}
		}catch (EOFException eof)
		{
			System.out.println("No More Reords");
		}catch(ClassNotFoundException cnfex)
			{
			System.err.println("Invalid object type");
			}
		catch(IOException ex) {
			System.err.println("Error Reading from the file");
		}
	
		System.out.println("oml: "+ oldMastLines);
		
		openTransFile();
		int transLines = 0;
		try {
			while(true)
			{
			TransactionRecord tr = (TransactionRecord)input.readObject();
			transLines++;
			}
		}catch (EOFException eof)
		{
			System.out.println("No More Reords");
		}catch(ClassNotFoundException cnfex)
			{
			System.err.println("Invalid object type");
			}
		catch(IOException ex) {
			System.err.println("Error Reading from the file");
		}
		
		System.out.println("tr: "+ transLines);
		
		openOldMastFile();
		Account account[] = new Account[oldMastLines];
		try{
			
			for(int i = 0; i < oldMastLines; i++) {
				account[i] = (Account)input.readObject();
				System.out.printf("%-15d%-12s%-12s%10.2f%n", 
						account[i].getAccNum(), 
						account[i].getfName(),
						account[i].getlName(),
						account[i].getBalance());
			
			}
		}
		catch(IOException ex) {
			System.err.println("Error Reading from the file");
		}
		
		openTransFile();
		TransactionRecord tr[] = new TransactionRecord[transLines];
		try{
			
			for(int i = 0; i < transLines; i++) {
				tr[i] = (TransactionRecord)input.readObject();
				System.out.printf("%-15d%10.2f%n", 
						tr[i].getAccountNum(), 
						tr[i].getAmount());
			
			}
		}
		catch(IOException ex) {
			System.err.println("Error Reading from the file");
		}
		
		for(int i = 0; i < oldMastLines; i++) {
			for(int j = 0; j < transLines; j++) {
				if(account[i].getAccNum() == tr[j].getAccountNum()) {
					account[i].combine(account[i], tr[j]);
					System.out.println("Account: "+account[i].getAccNum() + "  newB: "+account[i].getBalance());
				}
			}
		}
		
		//write to newmast.txt
		openNewMastFile();
		
		for(int i = 0; i < oldMastLines; i++) {
			Account record = new Account(account[i].getAccNum(),account[i].getfName(),account[i].getlName(),account[i].getBalance());
			output.writeObject(record);
		}
		
		
		//create log.txt
		FileWriter myWriter = new FileWriter("log.txt");
		
		for(int i = 0; i < transLines; i++) {
			boolean found = false;
			
			for(int j = 0; j < oldMastLines; j++) {
				if(tr[i].getAccountNum() == account[j].getAccNum()) {
					found = true;
				}
			}
			
			if (found == false) {
				myWriter.write("Unmatched transaction record for account number: " + tr[i].getAccountNum() + "\n");
			}
			
		}
		myWriter.close();
		
		
		//testing
		
		openNewMastFileInput();
		try {
			while(true)
			{
			Account record = (Account)input.readObject();
			System.out.printf("%-15d%-12s%-12s%10.2f%n? ", 
										record.getAccNum(), 
										record.getfName(),
										record.getlName(),
										record.getBalance());
			}
		}catch (EOFException eof)
		{
			System.out.println("No More Reords");
		}catch(ClassNotFoundException cnfex)
			{
			System.err.println("Invalid object type");
			}
		catch(IOException ex) {
			System.err.println("Error Reading from the file");
		}
		
		
		
		
	}
	
	//methods
	private static void openOldMastFile() {
		try {
			input = new ObjectInputStream(new FileInputStream("oldmast.txt"));
		}catch (IOException ex) {
			System.err.println("Error openning the file.");
		}
	}
		
	private static void openTransFile() {
		try {
			input = new ObjectInputStream(new FileInputStream("trans.txt"));
		}catch (IOException ex) {
			System.err.println("Error openning the file.");
		}
	}

	private static void openNewMastFile() {
		try {
			output = new ObjectOutputStream(new FileOutputStream("newmast.txt"));
		}catch (IOException ex) {
			System.err.println("Error openning the file.");
		}
	}
	
	private static void openLogFile() {
		try {
			output = new ObjectOutputStream(new FileOutputStream("log.txt"));
		}catch (IOException ex) {
			System.err.println("Error openning the file.");
		}
	}
	
	private static void openLogFileInput() {
		try {
			input = new ObjectInputStream(new FileInputStream("log.txt"));
		}catch (IOException ex) {
			System.err.println("Error openning the file.");
		}
	}
	
	private static void openNewMastFileInput() {
		try {
			input = new ObjectInputStream(new FileInputStream("newmast.txt"));
		}catch (IOException ex) {
			System.err.println("Error openning the file.");
		}
	}
}


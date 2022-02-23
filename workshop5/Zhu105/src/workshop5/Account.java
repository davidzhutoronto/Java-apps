package workshop5;

import java.io.Serializable;


public class Account implements Serializable{

	//private transient int accNum;
	private int accNum;
	private String fName;
	private String lName;
	private double balance;
	
	public Account() {
		this(0,"","",0.0);
	}
	
	public Account(int accNum, String fName, String lName, double balance) {
		this.accNum = accNum;
		this.fName = fName;
		this.lName = lName;
		this.balance = balance;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//Combine
	public void combine(Account ac, TransactionRecord tr) {
		ac.setBalance(tr.getAmount() + ac.getBalance());
	}
	
	
}

package workshop5;

import java.io.Serializable;

public class TransactionRecord implements Serializable{

	private int accountNum;
	private double amount;
	
	public TransactionRecord() {
		setAccountNum(0);
		setAmount(0.0);
	}

	public TransactionRecord(int accountNum, double amount) {
		setAccountNum(accountNum);
		setAmount(amount);
	}
	
	
	public void addAmount(double trans) {
		amount += trans;
	}
	
	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}

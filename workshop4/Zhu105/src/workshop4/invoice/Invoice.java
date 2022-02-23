/********************************************** 
Workshop 4 
Course:JAC444 - Semester2021Fall 
Last Name:Zhu 
First Name:David 
ID:105936107 
Section:NDD 
This assignment represents my own work in accordance with Seneca Academic Policy. 
Signature 
Date:10/17/2021 
**********************************************/
package workshop4.invoice;

import workshop4.Payable;

public class Invoice implements Payable{
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(){
		setPartNumber("");
		setPartDescription("");
		setQuantity(0);
		setPricePerItem(0.0);
	}
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
		setPartNumber(partNumber);
		setPartDescription(partDescription);
		setQuantity(quantity);
		setPricePerItem(pricePerItem);
	}


	@Override
	public String toString() {
		return "Invoice [partNumber=" + getPartNumber() + ", partDescription=" + getPartDescription() + ", quantity=" + getQuantity()
				+ ", pricePerItem=" + getPricePerItem() + "]";
	}



	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem();
	}
	
}

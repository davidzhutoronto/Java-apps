/**********************************************
Workshop #2
Course:<JAC444> - r
Last Name:<ZHU>
First Name:<DAVID>
ID:<105936207>
Section:<NDD>
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature David Zhu
Date:<10/3/2021>
**********************************************/
package task1;

public class SalesSlips {

	private int m_people;
	private int m_product;
	private double m_price;
	
	//constructor overload
	SalesSlips(int people, int product, double price){
		setPeople(people);
		setProduct(product);
		setPrice(price);
	}
		
	//getter and setter
	public void setPeople(int people) {
		this.m_people = people;
	}
	
	public void setProduct(int product) {
		this.m_product = product;
	}
	
	public void setPrice(double price) {
		this.m_price = price / 100;
	}
	
	
	public int getPeople() {
		return m_people;
	}
	
	public int getProduct() {
		return m_product;
	}
	
	public double getPrice() {
		return m_price;
	}	
}

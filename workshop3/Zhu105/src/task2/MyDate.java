package task2;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;

public class MyDate {

	int month;
	int day;
	int year;
	String stringMonth;
	
	MyDate(int month, int day, int year){
		setMonth(month);
		setDay(day);
		setYear(year);

	}

	MyDate(String month, int day, int year){
		setStringMonth(month);
		setDay(day);
		setYear(year);
	}
	
	
	MyDate(int day, int year){
		
		setYear(year);
		setDaysAndMonth(day);
	}
	

	
	//setters and getters
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setStringMonth(String month) {
		if(month.toLowerCase().equals("january")) {
			this.month = 1;
		}else if(month.toLowerCase().equals("february")) {
			this.month = 2;
		}else if(month.toLowerCase().equals("march")) {
			this.month = 3;
		}else if(month.toLowerCase().equals("april")) {
			this.month = 4;
		}else if(month.toLowerCase().equals("may")) {
			this.month = 5;
		}else if(month.toLowerCase().equals("june")) {
			this.month = 6;
		}else if(month.toLowerCase().equals("july")) {
			this.month = 7;
		}else if(month.toLowerCase().equals("august")) {
			this.month = 8;
		}else if(month.toLowerCase().equals("september")) {
			this.month = 9;
		}else if(month.toLowerCase().equals("october")) {
			this.month = 10;
		}else if(month.toLowerCase().equals("november")) {
			this.month = 11;
		}else if(month.toLowerCase().equals("december")) {
			this.month = 12;
		}else {
			this.month = 0;
		}
	}
	
	//set three digits days
	public void setDaysAndMonth(int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, this.year);
		calendar.set(Calendar.DAY_OF_YEAR, day);
		
		//Date date = calendar.getTime();
		
		this.month = calendar.get(Calendar.MONTH) + 1;
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
		
	}
	
	//convert integer to month
	public String getMonth(int month) {
	    return new DateFormatSymbols().getMonths()[month -1 ];
	}
	
	//convert date to number of day of a year
	public int getDayOfYear(int day, int month, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month -1);
		calendar.set(Calendar.DAY_OF_MONTH, day);
		
		return calendar.get(Calendar.DAY_OF_YEAR);
		
	}
	//print date
	public void printDate() {
		System.out.println();
		System.out.println("MM/DD/YYYY: " + this.month + "/" + this.day + "/" + this.year);
		System.out.println("Month DD, YYYY: " + getMonth(this.month) + " " + this.day + ", " + this.year);
		System.out.println("DDD YYYY: " + getDayOfYear(day, month, year) + " " + this.year);
		System.out.println();
	}
	
}

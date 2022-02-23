package task1;

public class MyInteger {

	private int value;
	
	public MyInteger(int value) {
		setValue(value);
	}
	
//setter and getter
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
//return true if the value in this object is even, odd, or prime
	public boolean isEven() {
		return this.value % 2 == 0;
	}
	
	public boolean isOdd() {
		return !(this.value % 2 == 0);
	}
	
	public boolean isPrime() {
		boolean flag = false;
		int i = 2;
		while((i < ((value / 2) +1) ) && (flag == false)) {
			if (this.value % i == 0) {
				flag = true;
			}
			i++;
		}
		
		if (value == 1) {
			flag = true;
		}
		return !flag;
	}
	
//static methods, return true if the specified value is even, odd, or prime, respectively
	public static boolean isEven(int value) {
		return value % 2 == 0;
	}
	
	public static boolean isOdd(int value) {
		return !(value % 2 == 0);
	}
	
	public static boolean isPrime(int value) {
		boolean flag = false;
		int i = 2;
		while((i < ((value / 2) +1) ) && (flag == false)) {
			if (value % i == 0) {
				flag = true;
			}
			i++;
		}
		
		if (value == 1) {
			flag = true;
		}
		return !flag;
	}

//static methods, return true if the specified value is even, odd, or prime
	public static boolean isEven(MyInteger obj) {
		return obj.getValue() % 2 == 0;
	}
	
	public static boolean isOdd(MyInteger obj) {
		return obj.getValue() % 2 != 0;
	}
	
	public static boolean isPrime(MyInteger obj) {
		int v = obj.getValue();
		
		boolean flag = false;
		int i = 2;
		while((i < ((v / 2) +1) ) && (flag == false)) {
			if (v % i == 0) {
				flag = true;
			}
			i++;
		}
		
		if (v == 1) {
			flag = true;
		}
		return !flag;
	}
	
//return true if the value in this object is equal to the specified value.
	public boolean euqals(int i) {
		return value == i;
	}
	
	public boolean equals(MyInteger obj) {
		return obj.value == this.value;
	}
	
	
//converts an array of numeric characters to an integer value
	public static int parseInt(char[] c) {
        return parseInt(new String(c));
    }
	
//converts a string into an integer value
	public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
	
}

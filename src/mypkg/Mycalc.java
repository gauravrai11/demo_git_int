package mypkg;

public class Mycalc {
	
	int sum(int a, int b) {
		return a+b;
	}
	
	int diff(int a, int b) {
		return a-b;
	}

	
	public static void main(String[] args) {
		Mycalc calc = new Mycalc();
		System.out.println("Sum is "+calc.sum(20, 10));
		System.out.println("Sum is "+calc.diff(20, 10));
		
	}

}

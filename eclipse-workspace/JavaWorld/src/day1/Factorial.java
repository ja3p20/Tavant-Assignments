package day1;

public class Factorial {
	
	static int calculateFactorial(int number) {
		int fact = 1;
		for(int i = 1; i <= number; i++) {
			fact = fact*i;
		}
		return fact;
		
	}

	public static void main(String[] args) {
	
		int number = 5;
		int result = calculateFactorial(number);
		System.out.println("Factorial of "+number+ " is "+ result);
	}

}

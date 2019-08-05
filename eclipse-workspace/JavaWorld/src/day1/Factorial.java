package day1;

import java.util.Scanner;

public class Factorial {
	
	
	static int calculateFactorial(int number) {
		if (number<0) return 0;
		int fact = 1;
		for(int i = 1; i <= number; i++) {
			fact = fact*i;
		}
		return fact;
		
	}
	public static void main(String[] args) {
	
		//int number = 5;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial");
		int number = scanner.nextInt();
		int result = calculateFactorial(number);
		System.out.println("Factorial of "+number+ " is "+ result);
		scanner.close();
	}

}

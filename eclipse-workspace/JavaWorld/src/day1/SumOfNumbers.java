package day1;

import java.util.Scanner;

public class SumOfNumbers {

	public int sumOfOddNumbers(int start, int end) {
		int sum=0;
		if(start%2 != 1) start++;
		for(int i=start; i<= end;i += 2) {
			sum += i;
		}
		return sum;
	}

	public int sumOfEvenNumbers(int start, int end) {
		int sum = 0;
		if(start%2 != 0) start++;
		for(int i=start; i<= end;i +=2) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter start of range");
		int start = scanner.nextInt();
		System.out.println("Enter end of range");
		int end = scanner.nextInt();
		SumOfNumbers sumOfNumbers = new SumOfNumbers();
		System.out.println("Sum of even numbers in the range "+start+" to "+end+ " = "+sumOfNumbers.sumOfEvenNumbers(start,end));
		System.out.println("Sum of odd numbers in the range "+start+ " to "+end+ " = "+sumOfNumbers.sumOfOddNumbers(start,end));
		scanner.close();
	}
}

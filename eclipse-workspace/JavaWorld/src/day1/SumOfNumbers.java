package day1;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter start of range");
		int start = scanner.nextInt();
		System.out.println("Enter end of range");
		int end = scanner.nextInt();
		SumOfNumbers somobject = new SumOfNumbers();
		somobject.sumOfEvenNumbers(start,end);
		somobject.sumOfOddNumbers(start,end);
		scanner.close();
	}

	public int sumOfOddNumbers(int start, int end) {
		int sum=0;
		if(start%2 != 1) start++;
		for(int i=start; i<= end;i += 2) {
			//System.out.println(i);
			sum += i;
		}
		System.out.println("Sum of odd number in the given range is " + sum);
		return sum;
	}

	public int sumOfEvenNumbers(int start, int end) {
		int sum = 0;
		if(start%2 != 0) start++;
		for(int i=start; i<= end;i +=2) {
			//System.out.println(i);
			sum+=i;
		}
		System.out.println("Sum of even number in the given range is " + sum);
		return sum;
	}

}

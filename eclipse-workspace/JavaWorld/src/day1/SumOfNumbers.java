package day1;

public class SumOfNumbers {

	public static void main(String[] args) {
		int start = 6;
		int end = 15;
		
		sumOfOddNumbers(start,end);
		sumOfEvenNumbers(start,end);
	}

	static int sumOfOddNumbers(int start, int end) {
		int sum=0;
		if(start%2 != 1) start++;
		for(int i=start; i<= end;i += 2) {
			//System.out.println(i);
			sum += i;
		}
		System.out.println("sum of odd number in the range is " + sum);
		return sum;
	}

	static int sumOfEvenNumbers(int start, int end) {
		int sum = 0;
		if(start%2 != 0) start++;
		for(int i=start; i<= end;i +=2) {
			//System.out.println(i);
			sum+=i;
		}
		System.out.println("sum of even number in the range is " + sum);
		return sum;
	}

}

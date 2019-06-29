package day1;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		//Double degtemp = (double) 100.0;
		//Double fahrentemp = (double) 212;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the temp in degree celcius");
		double degtemp1 = sc.nextDouble();
		System.out.println("Enter the temp in fahrenheit");
		double fahrentemp1 = sc.nextDouble();
		System.out.println(degtemp1 + " degree to fahrenheit = " + convertToFahrenheit(degtemp1));
		System.out.println(fahrentemp1 + " fahrenheit to celsius = " + convertToCelsius(fahrentemp1));
		sc.close();

	}
	public static Double convertToFahrenheit(Double degtemp){
		Double farenheit = 9 * (degtemp / 5) +32; 
		return farenheit; 
	}
	public static Double convertToCelsius(Double fahrentemp){
		Double celsius = (fahrentemp -32) * 5/9;
		return celsius; 
	}
}

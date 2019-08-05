package day1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		//Double degtemp = (double) 100.0;
		//Double fahrentemp = (double) 212;
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the temperature in degree celcius");
		double celsius = scanner.nextDouble();
		System.out.println("Enter the temperature in fahrenheit");
		double fahrenheit = scanner.nextDouble();
		DecimalFormat decimalformat = new DecimalFormat("0.0"); 
		System.out.println(celsius + " degree to fahrenheit = " + decimalformat.format(convertToFahrenheit(celsius)));
		System.out.println(fahrenheit + " fahrenheit to celsius = " + decimalformat.format(convertToCelsius(fahrenheit)));
		scanner.close();
	}
	public static Double convertToFahrenheit(Double celsius){
		double fahrenheit = 9 * (celsius / 5) +32; 
		
		return fahrenheit; 
	}
	public static Double convertToCelsius(Double fahrenheit){
		Double celsius = (fahrenheit -32) * 5/9;
		return celsius; 
	}
}

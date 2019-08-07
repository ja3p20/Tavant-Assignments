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
		Temperature tempobject = new Temperature();
		System.out.println(celsius + " degree to fahrenheit = " + decimalformat.format(tempobject.convertToFahrenheit(celsius)));
		System.out.println(fahrenheit + " fahrenheit to celsius = " + decimalformat.format(tempobject.convertToCelsius(fahrenheit)));
		scanner.close();
	}
	public Double convertToFahrenheit(Double celsius){
		double fahrenheit = 9 * (celsius / 5) +32; 
		
		return fahrenheit; 
	}
	public Double convertToCelsius(Double fahrenheit){
		Double celsius = (fahrenheit -32) * 5/9;
		return celsius; 
	}
}

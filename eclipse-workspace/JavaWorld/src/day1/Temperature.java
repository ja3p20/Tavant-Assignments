package day1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperature {
	
	public Double convertToFahrenheit(Double celsius){
		return (9 * (celsius / 5) + 32); 
	}
	
	public Double convertToCelsius(Double fahrenheit){
		return ((fahrenheit -32) * 5/9); 
	}
	
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the temperature in degree celcius");
		double celsius = scanner.nextDouble();
		System.out.println("Enter the temperature in fahrenheit");
		double fahrenheit = scanner.nextDouble();
		DecimalFormat decimalformat = new DecimalFormat("0.0");
		Temperature temperature = new Temperature();
		System.out.println(celsius + " degree to fahrenheit = " + decimalformat.format(temperature.convertToFahrenheit(celsius)));
		System.out.println(fahrenheit + " fahrenheit to celsius = " + decimalformat.format(temperature.convertToCelsius(fahrenheit)));
		scanner.close();
		
	}
}

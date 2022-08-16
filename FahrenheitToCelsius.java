package gorkhasolutions.fahrenheittocelsius.assignment.an.com;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter fahrenheit to convert to celsius:");
		
		float celsius = input.nextInt();
		
		celsius =((celsius-32)*5)/9;
		
		System.out.println("The conversion from fahrenheit to celsius is: " + celsius);
		
		
	
	}

}

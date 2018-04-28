package chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec18 {
	public static double ctof (double temperature) {
		return (temperature-32)*5/9;
	}
	public static double ftoc (double temperature) {
		return (temperature*9/5)+32;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		DecimalFormat df2 = new DecimalFormat("#.##");
		String input, selected, target = null;
		double temperature, targettemperature = 0, kelvintemperatureresult = 0;
		
		while( true ) {
			System.out.println("Press C to convert from Fahrenheit to Celsius.");
			System.out.println("Press F to convert from Celsius to Fahrenheit.");
			System.out.print("Your choice: ");
			input = sc.nextLine();
			String check = input.toUpperCase();
			if ( check.equals("C") ) {
				selected = "Fahrenheit";
				target = "Celsius";
				break;
			} else if ( check.equals("F") ){
				selected = "Celsius";
				target = "Fahrenheit";
				break;
			} else {
				System.out.println("Please input C or F only.");
				continue;
			}
		}
		
		while ( true ) {
			System.out.print("Please enter the temperature in "+ selected+": ");
			try {
				input = sc.nextLine();
				temperature = Double.parseDouble(input);
				if ( selected.equals("Fahrenheit") ) {
					targettemperature = ctof(temperature);
					kelvintemperatureresult = targettemperature + 273.15;
				} else if ( selected.equals("Celsius") ) {
					targettemperature = ftoc(temperature);
					kelvintemperatureresult = ( targettemperature + 459.67 ) * ( 5.0 / 9.0);
				}
				break;
			} catch ( Exception e ) {
				System.out.println("Please input numbers only ");
				continue;
			}
		}
		if ( targettemperature == 0.0 ) {
			System.out.println("The temperature in "+ target + " is " + (int)targettemperature + ".");
		} else {
			System.out.println("The temperature in "+ target + " is " + df.format( targettemperature ) + ".");
		}
		
		System.out.println("The Kelvin temperature result in "+ target + " is " + df.format( kelvintemperatureresult )
					+ " with " + target + " " + df2.format( targettemperature ) + ".");

	}
}

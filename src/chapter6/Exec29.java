package chapter6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#");
		double rate, years;
		while( true ) {
			System.out.print("What is the rate of return? ");
			String input = sc.nextLine();
			try {
				rate = Integer.parseInt(input);
				if ( rate == 0  ) {
					System.out.println("Sorry. That's not a valid input.");
					continue;
				}
				break;
			} catch ( Exception e) {
				System.out.println("You input wrong types of values. Please input only numbers.");
				continue;
			}
		}
		years = 72/rate;
		System.out.println("It will take "+ df.format(years) + " years to double your initial investment.");
		
		
	}

}

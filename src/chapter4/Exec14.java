package chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		double interest = 0.055;
		System.out.print("What is the order amount? ");
		double amount = sc.nextDouble();
		sc.nextLine(); // To avoid no input for next String \n
		System.out.print("What is the state? ");
		String state = sc.nextLine();

		String uppercase = state.toUpperCase();
		String lowercase = state.toLowerCase();
		
		if( uppercase.equals("WI") || lowercase.equals("wisconsin")) {
			double tax = amount*interest;
			double total = amount + tax;
			System.out.println("The subtotal is $"+amount + "\nThe tax is $"+tax+"\nThe total is $"+df.format(total));
			return;
		}
		double tax = amount*interest;
		double total = amount + tax;
		System.out.println("The total is $"+df.format(total));
	}

}

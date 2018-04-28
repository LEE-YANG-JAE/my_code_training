package chapter5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec26 {
	
	private static double calculateMonthsUnitlPaidOff(double balance, double apr, double monthly_payment ) {
		apr = apr / 100;
		double daily_interest = apr / 365;
		
		double a = 1.0 / 30.0;
		double b = balance / monthly_payment;
		double c = 1 - Math.pow( 1 + daily_interest , 30);
		double d = 1 + daily_interest;
		
		double result = -( a ) * ( Math.log ( 1 +  b * c ) /  Math.log( d ) ) ;
		
		return result;
	}
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0");
		Scanner sc = new Scanner(System.in);
		String input = null;
		
		System.out.print("What is your balance? ");
		input = sc.nextLine();
		double balance = Double.parseDouble(input);
		
		System.out.print("What is the APR on the card (as a percent)? ");
		input = sc.nextLine();
		double apr = Double.parseDouble(input);
		
		System.out.print("What is the monthly payment you can make? ");
		input = sc.nextLine();
		double monthly_payment = Double.parseDouble(input);
		
		double result = calculateMonthsUnitlPaidOff(balance, apr, monthly_payment ) ;
		System.out.println("It will take you " + df.format(Math.ceil(result)) + " months to pay off this card.");
		
	}
}
